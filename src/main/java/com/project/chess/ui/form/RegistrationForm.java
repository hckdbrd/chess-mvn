package com.project.chess.ui.form;

import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
public class RegistrationForm extends FormLayout {

   private final PasswordField password;
   private final PasswordField passwordConfirm;
   private final Span errorMessageField;
   private final Button submitButton;


   public RegistrationForm() {
      H1 title = new H1("Sign up");
      TextField firstName = new TextField("First name");
      TextField lastName = new TextField("Last name");
      EmailField email = new EmailField("Email");


      password = new PasswordField("Password");
      passwordConfirm = new PasswordField("Confirm password");

      setRequiredIndicatorVisible(firstName, lastName, email, password, passwordConfirm);

      errorMessageField = new Span();

      submitButton = new Button("Join GAMBIT");
      submitButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
      submitButton.getStyle().set("margin-top", "40px");

      add(
         title, firstName, lastName, email,
         password, passwordConfirm,
         errorMessageField, submitButton
      );

      setMaxWidth("500px");

      setResponsiveSteps(
         new ResponsiveStep("0", 1, ResponsiveStep.LabelsPosition.TOP),
         new ResponsiveStep("490px", 2, ResponsiveStep.LabelsPosition.TOP));

      // These components always take full width
      setColspan(title, 2);
      setColspan(email, 2);
      setColspan(errorMessageField, 2);
      setColspan(submitButton, 2);
   }

   private void setRequiredIndicatorVisible(HasValueAndElement<?, ?>... components) {
      Stream.of(components).forEach(comp -> comp.setRequiredIndicatorVisible(true));
   }
}