package com.mycompany.mywebapp.ui.tasks;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ListBox;
import com.mycompany.mywebapp.model.Status;
import com.mycompany.mywebapp.model.Task;
import com.mycompany.mywebapp.service.TaskService;
import com.mycompany.mywebapp.ui.components.Badge;
import com.mycompany.mywebapp.ui.components.EmptyState;

public class TaskDetailView extends Composite {

    public TaskDetailView(int id) {
        final Task task = TaskService.get().findById(id);
        FlowPanel root = new FlowPanel();
        root.setStyleName("tf-detail");

        if (task == null) {
            root.add(new EmptyState("Tarefa não encontrada", "Ela pode ter sido excluída."));
            initWidget(root);
            return;
        }

        root.add(new HTML("<h2 class=\"tf-detail-title\">" + task.getTitle() + "</h2>"));
        root.add(new HTML("<p class=\"tf-detail-text\">"
                + (task.getDescription() == null || task.getDescription().isEmpty()
                ? "Sem descrição." : task.getDescription()) + "</p>"));

        FlowPanel meta = new FlowPanel();
        meta.setStyleName("tf-detail-meta");
        meta.add(new HTML("<span>Categoria: <strong>" + task.getCategory() + "</strong></span>"));
        meta.add(new HTML("<span>Responsável: <strong>"
                + (task.getAssignee() == null || task.getAssignee().isEmpty() ? "—" : task.getAssignee())
                + "</strong></span>"));
        meta.add(Badge.of(task.getPriority()));
        meta.add(Badge.of(task.getStatus()));
        root.add(meta);

        final ListBox statusBox = new ListBox();
        statusBox.setStyleName("tf-filter");
        for (Status s : Status.values()) {
            statusBox.addItem(s.getLabel(), s.name());
            if (s == task.getStatus()) statusBox.setSelectedIndex(statusBox.getItemCount() - 1);
        }
        statusBox.addChangeHandler(new ChangeHandler() {
            @Override public void onChange(ChangeEvent event) {
                task.setStatus(Status.valueOf(statusBox.getSelectedValue()));
                TaskService.get().save(task);
            }
        });

        FlowPanel actions = new FlowPanel();
        actions.setStyleName("tf-detail-actions");
        actions.add(statusBox);
        actions.add(new Anchor("Editar", "#tasks/" + task.getId() + "/edit"));
        actions.add(new Anchor("Voltar para a lista", "#tasks"));
        root.add(actions);

        initWidget(root);
    }
}