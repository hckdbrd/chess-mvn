package com.project.chess.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "puzzles", layout = AppView.class)
public class PuzzlesView extends VerticalLayout {
   public PuzzlesView() {
      add(
         new H1("PuzzlesView")
      );
   }
}
