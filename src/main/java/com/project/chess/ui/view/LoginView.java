package com.project.chess.ui.view;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@Route("login")
@PageTitle("Login")
@PermitAll
public class LoginView extends VerticalLayout implements BeforeEnterObserver {
   private final LoginForm login = new LoginForm();

   public LoginView() {
      setSizeFull();
      setAlignItems(Alignment.CENTER);
      setJustifyContentMode(JustifyContentMode.CENTER);
      getStyle().set("background-color", "var(--lumo-contrast-5pct)");

      login.setAction("login");
      login.getElement().setAttribute("no-autofocus", "");

      add(
         login
      );
   }

   @Override
   public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
      if(beforeEnterEvent.getLocation()
         .getQueryParameters()
         .getParameters()
         .containsKey("error")) {
         login.setError(true);
      }
   }
}