package com.mycompany.mywebapp.ui.tasks;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.mycompany.mywebapp.model.Priority;
import com.mycompany.mywebapp.model.Status;
import com.mycompany.mywebapp.model.Task;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiHandler;
import com.mycompany.mywebapp.service.TaskService;
import com.mycompany.mywebapp.ui.layout.AppRouter;


public class TaskFormView extends Composite {

    interface Binder extends UiBinder<Widget, TaskFormView> {}
    private static final Binder binder = GWT.create(Binder.class);

    @UiField TextBox titleBox;
    @UiField TextArea descriptionBox;
    @UiField ListBox categoryBox;
    @UiField ListBox priorityBox;
    @UiField ListBox statusBox;
    @UiField TextBox assigneeBox;
    @UiField DateBox dueDateBox;
    @UiField Button saveButton;
    @UiField Button cancelButton;
    @UiField Label alert;

    private Task editing;

    public TaskFormView() {
        initWidget(binder.createAndBindUi(this));

        for (String c : new String[] {"Setup", "Interface", "Qualidade", "Documentação"}) {
            categoryBox.addItem(c);
        }
        for (Priority p : Priority.values()) {
            priorityBox.addItem(p.getLabel(), p.name());
        }
        for (Status s : Status.values()) {
            statusBox.addItem(s.getLabel(), s.name());
        }
    }

    /** Carrega uma tarefa existente no formulário (modo edição). */
    public void bind(Task task) {
        this.editing = task;
        if (task == null) return;
        titleBox.setText(task.getTitle());
        descriptionBox.setText(task.getDescription());
        assigneeBox.setText(task.getAssignee());
        dueDateBox.setValue(task.getDueDate());
        selectValue(categoryBox, task.getCategory());
        selectValue(priorityBox, task.getPriority().name());
        selectValue(statusBox, task.getStatus().name());
    }

    public Task getEditing() { return editing; }

    @UiHandler("saveButton")
    void onSave(ClickEvent event) {
        String title = titleBox.getText().trim();
        if (title.length() < 3) {
            showAlert("Informe um título com pelo menos 3 caracteres.");
            return;
        }

        Task task = editing != null ? editing : new Task();
        task.setTitle(title);
        task.setDescription(descriptionBox.getText().trim());
        task.setCategory(categoryBox.getSelectedItemText());
        task.setAssignee(assigneeBox.getText().trim());
        task.setDueDate(dueDateBox.getValue());
        task.setPriority(Priority.valueOf(priorityBox.getSelectedValue()));
        task.setStatus(Status.valueOf(statusBox.getSelectedValue()));

        TaskService.get().save(task);
        AppRouter.go(AppRouter.TASKS);
    }

    @UiHandler("cancelButton")
    void onCancel(ClickEvent event) {
        AppRouter.go(AppRouter.TASKS);
    }

    private void showAlert(String message) {
        alert.setText(message);
        alert.setVisible(true);
    }

    private void selectValue(ListBox box, String value) {
        if (value == null) return;
        for (int i = 0; i < box.getItemCount(); i++) {
            if (value.equals(box.getValue(i)) || value.equals(box.getItemText(i))) {
                box.setSelectedIndex(i);
                return;
            }
        }
    }
}