package com.mycompany.mywebapp;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.mycompany.mywebapp.ui.layout.AppRouter;
import com.mycompany.mywebapp.ui.layout.MainLayout;
import com.mycompany.mywebapp.ui.layout.NavItem;

public class App implements EntryPoint {

	@Override
	public void onModuleLoad() {
		final MainLayout layout = new MainLayout();

		layout.getNavPanel().add(new NavItem("Dashboard", AppRouter.DASHBOARD));
		layout.getNavPanel().add(new NavItem("Tarefas", AppRouter.TASKS));
		layout.getNavPanel().add(new NavItem("Nova tarefa", AppRouter.TASK_NEW));
		layout.getNavPanel().add(new NavItem("Categorias", AppRouter.CATEGORIES));
		layout.getNavPanel().add(new NavItem("Relatórios", AppRouter.REPORTS));
		layout.getNavPanel().add(new NavItem("Configurações", AppRouter.SETTINGS));
		layout.getNavPanel().add(new NavItem("URLs de teste", AppRouter.URLS_TESTES));

		layout.getNewTaskButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				AppRouter.go(AppRouter.TASK_NEW);
			}
		});

		RootPanel.get("app").add(layout);
		new AppRouter(layout).start();
	}
}