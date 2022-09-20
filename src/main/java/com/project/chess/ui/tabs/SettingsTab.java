package com.project.chess.ui.tabs;

import com.project.chess.ui.layout.Main;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.RolesAllowed;

@Route(value = "settings", layout = Main.class)
@RolesAllowed({"USER","ADMIN"})
@PageTitle("Settings")
public class SettingsTab extends VerticalLayout {
   public SettingsTab(){
      add(
         new H1("SettingsView")
      );
   }
}
