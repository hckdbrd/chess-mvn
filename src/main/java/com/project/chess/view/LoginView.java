package com.project.chess.view;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.router.Route;

@Route("/login")
public class LoginView extends Div {

   public LoginView() {
      getStyle()
         .set("background-color", "var(--lumo-contrast-5pct)")
         .set("display", "flex")
         .set("justify-content", "center")
         .set("padding", "var(--lumo-space-l)")
         .set("height", "100%");


      LoginForm loginForm = new LoginForm();
      add(loginForm);

      loginForm.getElement().setAttribute("no-autofocus", "");
   }

}
