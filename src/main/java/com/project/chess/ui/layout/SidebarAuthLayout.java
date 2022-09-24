package com.project.chess.ui.layout;

import com.project.chess.ui.dialog.LoginDialog;
import com.project.chess.ui.dialog.RegistrationDialog;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class SidebarAuthLayout extends HorizontalLayout{
   public SidebarAuthLayout() {

      Button loginButton = new Button("Log in", click -> new LoginDialog().open());
      Button regButton = new Button("Sign Up", click -> new RegistrationDialog().open());

      add(
         loginButton,
         regButton
      );

      loginButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
      setWidthFull();
      setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
   }
}
