package com.project.chess.ui.form;

import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
public class RegistrationForm extends FormLayout {

   private final PasswordField password;
   private final Span error;
   private final Button submitButton;

   public RegistrationForm() {
      TextField username = new TextField("Username");
      EmailField email = new EmailField("Email");
      password = new PasswordField("Password");
      error = new Span();
      submitButton = new Button("Register");

      add(
         username, email, password,
         error, submitButton
      );

      submitButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
      submitButton.getStyle().set("margin-top", "40px");

      setRequiredIndicatorVisible(username, email, password);

      setMaxWidth("380px");
      getStyle().set("margin", "20px");
      getStyle().set("padding", "20px");
   }

   private void setRequiredIndicatorVisible(HasValueAndElement<?, ?>... components) {
      Stream.of(components).forEach(comp -> comp.setRequiredIndicatorVisible(true));
   }
}