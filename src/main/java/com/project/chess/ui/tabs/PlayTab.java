package com.project.chess.ui.tabs;

import com.project.chess.ui.layout.Main;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@Route(value = "", layout = Main.class)
@PageTitle("Play")
@PermitAll
public class PlayTab extends VerticalLayout {
   public PlayTab() {
      add(
         new H1("PlayView")
      );
   }
}
