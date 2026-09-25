package com.mycompany.mywebapp.ui.settings;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

public class AboutView extends Composite {

    public AboutView() {
        HTML html = new HTML(
                "<div class=\"tf-detail\">"
                        + "<h2 class=\"tf-detail-title\">TaskFlow</h2>"
                        + "<p class=\"tf-detail-text\">Gerenciador de tarefas desenvolvido com Google Web Toolkit.</p>"
                        + "<h3>Objetivo</h3>"
                        + "<p class=\"tf-detail-text\">Construir uma aplicação GWT navegável e organizada, "
                        + "com CRUD completo de tarefas mantido em memória.</p>"
                        + "<h3>Tecnologias</h3>"
                        + "<p class=\"tf-detail-text\">Java · GWT · UiBinder · Maven · HTML · CSS</p>"
                        + "<h3>Arquitetura</h3>"
                        + "<pre class=\"tf-tree\">App\n└── MainLayout\n    └── AppRouter\n        ├── DashboardView\n"
                        + "        ├── TaskListView\n        ├── TaskFormView\n        └── TaskDetailView\n\n"
                        + "model/    dados\nservice/  operações\nui/components/ peças reutilizáveis</pre>"
                        + "<h3>Conceitos GWT utilizados</h3>"
                        + "<p class=\"tf-detail-text\">EntryPoint, Composite, UiBinder, CssResource, @UiField, "
                        + "@UiHandler, History, DialogBox, FlexTable, ListBox, DateBox.</p>"
                        + "<h3>Próximos passos</h3>"
                        + "<p class=\"tf-detail-text\">GWT + backend Java, API REST, banco de dados, "
                        + "autenticação, persistência e deploy.</p>"
                        + "</div>");
        initWidget(html);
    }
}