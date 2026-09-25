package com.mycompany.mywebapp.ui.layout;

import com.google.gwt.user.client.ui.Anchor;
import java.util.ArrayList;
import java.util.List;

public class NavItem extends Anchor {

    private static final List<NavItem> ALL = new ArrayList<>();
    private final String token;

    public NavItem(String label, String token) {
        super(label, "#" + token);
        this.token = token;
        setStyleName("tf-nav-item");
        ALL.add(this);
    }

    /** Marca como ativo o item correspondente ao token atual. */
    public static void highlight(String current) {
        String token = (current == null || current.isEmpty()) ? AppRouter.DASHBOARD : current;
        for (NavItem item : ALL) {
            boolean active = item.token.equals(token);
            item.setStyleName("tf-nav-item" + (active ? " tf-nav-item-active" : ""));
        }
    }
}