package com.mycompany.mywebapp.ui.layout;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;

import com.mycompany.mywebapp.ui.dashboard.DashboardView;
import com.mycompany.mywebapp.ui.tasks.TaskFormView;
import com.mycompany.mywebapp.ui.tasks.TaskListView;

import com.mycompany.mywebapp.service.TaskService;
import com.mycompany.mywebapp.ui.tasks.TaskDetailView;

import com.mycompany.mywebapp.ui.settings.AboutView;

/** Único responsável por decidir qual tela aparece no ContentPanel. */
public class AppRouter implements ValueChangeHandler<String> {

    public static final String DASHBOARD = "dashboard";
    public static final String TASKS = "tasks";
    public static final String TASK_NEW = "tasks/new";
    public static final String CATEGORIES = "categories";
    public static final String REPORTS = "reports";
    public static final String SETTINGS = "settings";
    public static final String URLS_TESTES = "urls/testes";

    private final MainLayout layout;

    public static final String ABOUT = "about";

    public AppRouter(MainLayout layout) {
        this.layout = layout;
        History.addValueChangeHandler(this);
    }

    public static void go(String token) {
        History.newItem(token);
    }

    /** Chamado uma vez no início para respeitar a URL atual. */
    public void start() {
        String token = History.getToken();
        render(token == null || token.isEmpty() ? DASHBOARD : token);
    }

    @Override
    public void onValueChange(ValueChangeEvent<String> event) {
        render(event.getValue());
    }

    private void render(String token) {
        if (token != null && token.startsWith("tasks/") && !TASK_NEW.equals(token)) {
            String rest = token.substring("tasks/".length());
            boolean edit = rest.endsWith("/edit");
            if (edit) rest = rest.substring(0, rest.length() - "/edit".length());
            try {
                int id = Integer.parseInt(rest);
                if (edit) {
                    TaskFormView form = new TaskFormView();
                    form.bind(TaskService.get().findById(id));
                    show("Editar tarefa", "TaskFlow / Tarefas / Editar", form);
                } else {
                    show("Detalhes da tarefa", "TaskFlow / Tarefas / Detalhes", new TaskDetailView(id));
                }
                NavItem.highlight(TASKS);
                return;
            } catch (NumberFormatException ignored) {
                // token inválido: segue para o fluxo padrão
            }
        }

        if (TASKS.equals(token)) {
//            show("Tarefas", "TaskFlow / Tarefas", new HTML("<p>Lista de tarefas</p>"));
            show("Tarefas", "TaskFlow / Tarefas", new TaskListView());
        } else if (TASK_NEW.equals(token)) {
            show("Nova tarefa", "TaskFlow / Tarefas / Nova", new TaskFormView());
        } else if (CATEGORIES.equals(token)) {
            show("Categorias", "TaskFlow / Categorias", new HTML("<p>Categorias</p>"));
        } else if (REPORTS.equals(token)) {
            show("Relatórios", "TaskFlow / Relatórios", new HTML("<p>Relatórios</p>"));
        } else if (SETTINGS.equals(token)) {
            show("Configurações", "TaskFlow / Configurações", new HTML("<p>Configurações</p>"));
        } else if (URLS_TESTES.equals(token)) {
            show("URLs de teste", "TaskFlow / URLs de teste", new HTML("<p>URLs de teste</p>"));
        }else if (ABOUT.equals(token)) {
            show("Sobre o projeto", "TaskFlow / Sobre", new AboutView());
        } else {
            show("Dashboard", "TaskFlow / Dashboard", new DashboardView());
        }
        NavItem.highlight(token);
    }

    private void show(String title, String path, IsWidget view) {
        layout.setHeader(title, path);
        layout.setContent(view);
    }
}