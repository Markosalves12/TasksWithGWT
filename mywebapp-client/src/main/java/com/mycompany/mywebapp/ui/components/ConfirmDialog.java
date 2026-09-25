package com.mycompany.mywebapp.ui.components;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class ConfirmDialog extends DialogBox {

    /** O que executar quando o usuário confirma. */
    public interface Callback {
        void onConfirm();
    }

    public ConfirmDialog(String title, String message, final Callback callback) {
        setText(title);
        setGlassEnabled(true);
        setModal(true);
        setAnimationEnabled(true);
        setStyleName("tf-dialog");

        FlowPanel body = new FlowPanel();
        body.setStyleName("tf-dialog-body");

        Label text = new Label(message);
        text.setStyleName("tf-dialog-text");

        FlowPanel actions = new FlowPanel();
        actions.setStyleName("tf-dialog-actions");

        Button confirm = new Button("Excluir");
        confirm.setStyleName("tf-danger");
        confirm.addClickHandler(new ClickHandler() {
            @Override public void onClick(ClickEvent event) {
                hide();
                callback.onConfirm();
            }
        });

        Button cancel = new Button("Cancelar");
        cancel.setStyleName("tf-ghost");
        cancel.addClickHandler(new ClickHandler() {
            @Override public void onClick(ClickEvent event) { hide(); }
        });

        actions.add(confirm);
        actions.add(cancel);
        body.add(text);
        body.add(actions);
        setWidget(body);
    }

    public void open() {
        center();
        show();
    }
}