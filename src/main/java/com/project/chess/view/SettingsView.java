package com.project.chess.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "settings", layout = AppView.class)
public class SettingsView extends VerticalLayout {
   public SettingsView(){
      add(
         new H1("SettingsView")
      );
   }
}
