package com.project.chess.ui.form;

import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;

import java.util.stream.Stream;

public class LoginForm extends FormLayout {

   public LoginForm() {
      TextField username = new TextField("Username");
      PasswordField password = new PasswordField("Password");
      Span error = new Span();
      Button submitButton = new Button("Log in");

      add(
         username, password,
         error, submitButton
      );

      submitButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
      submitButton.getStyle().set("margin-top", "40px");

      setRequiredIndicatorVisible(username, password);

      setMaxWidth("380px");
      getStyle().set("margin", "20px");
      getStyle().set("padding", "20px");
   }

   private void setRequiredIndicatorVisible(HasValueAndElement<?, ?>... components) {
      Stream.of(components).forEach(comp -> comp.setRequiredIndicatorVisible(true));
   }
}
