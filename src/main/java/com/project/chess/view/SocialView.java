package com.project.chess.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "social", layout = AppView.class)
public class SocialView extends VerticalLayout {
   public SocialView() {
      add(
        new H1("SocialView")
      );
   }
}
