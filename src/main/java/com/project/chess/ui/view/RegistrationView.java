package com.project.chess.ui.view;

import com.project.chess.ui.binder.RegistrationFormBinder;
import com.project.chess.ui.form.RegistrationForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@Route("register")
@PageTitle("Register")
@PermitAll
public class RegistrationView extends VerticalLayout{
   RegistrationForm registration = new RegistrationForm();

   public RegistrationView() {

      add(
         registration
      );

      setSizeFull();
      getStyle().set("margin-top","-100px");
      setJustifyContentMode(JustifyContentMode.CENTER);
      setHorizontalComponentAlignment(Alignment.CENTER, registration);

      RegistrationFormBinder registrationFormBinder = new RegistrationFormBinder(registration);
      registrationFormBinder.addBindingAndValidation();
   }
}