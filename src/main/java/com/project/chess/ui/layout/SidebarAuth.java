package com.project.chess.ui.layout;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class SidebarAuth extends HorizontalLayout{
   public SidebarAuth() {
      Button loginButton = new Button("Log in");
      Button signUpButton = new Button("Sign Up");

      transformToLogin(loginButton);
      transformToRegister(signUpButton);

      add(
         loginButton,
         signUpButton
      );
      
      setWidthFull();
      setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
   }

   private static void transformToRegister(Button signUpButton) {
      signUpButton.addClickListener(e ->
         signUpButton.getUI().ifPresent(ui -> ui.navigate("register")));
   }

   private static void transformToLogin(Button loginButton) {
      loginButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
      loginButton.addClickListener(e ->
         loginButton.getUI().ifPresent(ui -> ui.navigate("login")));
   }
}
