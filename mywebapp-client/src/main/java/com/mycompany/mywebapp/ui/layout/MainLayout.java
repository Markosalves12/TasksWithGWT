package com.mycompany.mywebapp.ui.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/** Moldura única da aplicação: sidebar + topbar + conteúdo. */
public class MainLayout extends Composite {

    interface MainLayoutUiBinder extends UiBinder<Widget, MainLayout> {}
    private static final MainLayoutUiBinder binder = GWT.create(MainLayoutUiBinder.class);

    @UiField FlowPanel navPanel;
    @UiField SimplePanel content;
    @UiField Label pageTitle;
    @UiField Label breadcrumb;
    @UiField Button newTaskButton;

    public MainLayout() {
        initWidget(binder.createAndBindUi(this));
    }

    public FlowPanel getNavPanel() { return navPanel; }
    public Button getNewTaskButton() { return newTaskButton; }

    /** Troca a tela exibida na área central, mantendo sidebar e topbar. */
    public void setContent(IsWidget view) {
        content.setWidget(view);
    }

    public void setHeader(String title, String path) {
        pageTitle.setText(title);
        breadcrumb.setText(path);
    }
}