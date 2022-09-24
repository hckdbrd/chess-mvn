package com.project.chess.ui.view;

import com.project.chess.ui.binder.RegistrationFormBinder;
import com.project.chess.ui.form.RegistrationForm;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@Route("register")
@PageTitle("Register")
@PermitAll
public class RegistrationView extends VerticalLayout{
   RegistrationForm registration = new RegistrationForm();
   H1 title = new H1("Sign up");

   public RegistrationView() {

      add(
         title,
         registration
      );

      setSizeFull();
      setJustifyContentMode(JustifyContentMode.CENTER);
      setHorizontalComponentAlignment(Alignment.CENTER, title, registration);
      setAlignItems(Alignment.CENTER);
      getStyle().set("background-color", "var(--lumo-contrast-5pct)");

      RegistrationFormBinder registrationFormBinder = new RegistrationFormBinder(registration);
      registrationFormBinder.addBindingAndValidation();
   }
}