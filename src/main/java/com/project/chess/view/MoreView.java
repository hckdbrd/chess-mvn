package com.project.chess.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "more", layout = AppView.class)
public class MoreView extends VerticalLayout {
   public MoreView() {
    add(
       new H1("MoreView")
    );
   }
}
