package com.mycompany.mywebapp.ui.tasks;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.mycompany.mywebapp.model.Task;
import com.mycompany.mywebapp.service.TaskService;
import com.mycompany.mywebapp.ui.components.Badge;
import com.mycompany.mywebapp.ui.components.EmptyState;
import java.util.List;


import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.mycompany.mywebapp.model.Status;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.mycompany.mywebapp.ui.components.ConfirmDialog;

public class TaskListView extends Composite {

    interface Binder extends UiBinder<Widget, TaskListView> {}
    private static final Binder binder = GWT.create(Binder.class);

    @UiField FlowPanel toolbar;
    @UiField SimplePanel tableHost;

    public TaskListView() {
        initWidget(binder.createAndBindUi(this));
        buildToolbar();
        refresh();
    }

    private final TextBox searchBox = new TextBox();
    private final ListBox statusFilter = new ListBox();
    private final Label counter = new Label();

    private void buildToolbar() {
        searchBox.getElement().setPropertyString("placeholder", "Pesquisar por título…");
        searchBox.setStyleName("tf-search");
        searchBox.addKeyUpHandler(new KeyUpHandler() {
            @Override public void onKeyUp(KeyUpEvent event) { refresh(); }
        });

        statusFilter.setStyleName("tf-filter");
        statusFilter.addItem("Todos os status", "");
        for (Status s : Status.values()) {
            statusFilter.addItem(s.getLabel(), s.name());
        }
        statusFilter.addChangeHandler(new ChangeHandler() {
            @Override public void onChange(ChangeEvent event) { refresh(); }
        });

        counter.setStyleName("tf-counter");

        toolbar.add(searchBox);
        toolbar.add(statusFilter);
        toolbar.add(counter);
    }

    public void refresh() {
        String value = statusFilter.getSelectedValue();
        Status status = value == null || value.isEmpty() ? null : Status.valueOf(value);
        List<Task> tasks = TaskService.get().search(searchBox.getText(), status);
        counter.setText(tasks.size() + " tarefa(s)");

        if (tasks.isEmpty()) {
            tableHost.setWidget(new EmptyState(
                    "Nenhuma tarefa por aqui",
                    "Clique em \"Nova tarefa\" para criar a primeira."));
            return;
        }

        FlexTable table = new FlexTable();
        table.setStyleName("tf-table");
        table.setText(0, 0, "Título");
        table.setText(0, 1, "Categoria");
        table.setText(0, 2, "Prioridade");
        table.setText(0, 3, "Status");
        table.setText(0, 4, "Ações");
        table.getRowFormatter().setStyleName(0, "tf-table-head");

        int row = 1;
        for (final Task task : tasks) {
            Anchor title = new Anchor(task.getTitle(), "#tasks/" + task.getId());
            table.setWidget(row, 0, title);
            table.setWidget(row, 1, new Label(task.getCategory()));
            table.setWidget(row, 2, Badge.of(task.getPriority()));
            table.setWidget(row, 3, Badge.of(task.getStatus()));
//            table.setWidget(row, 4, new Anchor("Editar", "#tasks/" + task.getId() + "/edit"));

            FlowPanel rowActions = new FlowPanel();
            rowActions.setStyleName("tf-row-actions");
            rowActions.add(new Anchor("Editar", "#tasks/" + task.getId() + "/edit"));

            Anchor remove = new Anchor("Excluir");
            remove.setStyleName("tf-link-danger");
            remove.addClickHandler(new ClickHandler() {
                @Override public void onClick(ClickEvent event) {
                    new ConfirmDialog("Excluir tarefa",
                            "Deseja realmente excluir \"" + task.getTitle() + "\"?",
                            new ConfirmDialog.Callback() {
                                @Override public void onConfirm() {
                                    TaskService.get().delete(task.getId());
                                    refresh();
                                }
                            }).open();
                }
            });
            rowActions.add(remove);
            table.setWidget(row, 4, rowActions);

            row++;
        }

        tableHost.setWidget(table);
    }
}