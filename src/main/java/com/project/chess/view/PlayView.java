package com.project.chess.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "game", layout = AppView.class)
public class PlayView extends VerticalLayout {
   public PlayView() {
      add(
         new H1("PlayView")
      );
   }
}
