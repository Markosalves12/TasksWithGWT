package com.mycompany.mywebapp.ui.dashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

import com.mycompany.mywebapp.model.Status;
import com.mycompany.mywebapp.service.TaskService;

import com.mycompany.mywebapp.ui.components.StatCard;

public class DashboardView extends Composite {

    interface Binder extends UiBinder<Widget, DashboardView> {}
    private static final Binder binder = GWT.create(Binder.class);

    @UiField FlowPanel cards;
    @UiField FlowPanel activity;
    @UiField DivElement progressBar;
    @UiField Label progressLabel;

    public DashboardView() {
        initWidget(binder.createAndBindUi(this));
        update();
        TaskService.get().addListener(new TaskService.Listener() {
            @Override public void onTasksChanged() { update(); }
        });
    }

    private void update() {
        TaskService service = TaskService.get();
        render(service.count(),
                service.countByStatus(Status.PENDENTE),
                service.countByStatus(Status.EM_ANDAMENTO),
                service.countByStatus(Status.CONCLUIDA));
    }

    public void render(int total, int pendentes, int andamento, int concluidas) {
        cards.clear();
//        cards.add(card("Total de tarefas", total));
//        cards.add(card("Pendentes", pendentes));
//        cards.add(card("Em andamento", andamento));
//        cards.add(card("Concluídas", concluidas));

        cards.add(new StatCard("Total de tarefas", total));
        cards.add(new StatCard("Pendentes", pendentes));
        cards.add(new StatCard("Em andamento", andamento));
        cards.add(new StatCard("Concluídas", concluidas));

        int pct = total == 0 ? 0 : (concluidas * 100) / total;
        progressBar.getStyle().setProperty("width", pct + "%");
        progressLabel.setText(pct + "% das tarefas concluídas");

        activity.clear();
        activity.add(new HTML("<strong>Você</strong> criou a tarefa \"Configurar ambiente\""));
        activity.add(new HTML("<strong>Você</strong> concluiu a tarefa \"Ler documentação GWT\""));
    }

    private IsWidget card(String totalDeTarefas, int total) {
        return new StatCard(totalDeTarefas, total);
    }
}