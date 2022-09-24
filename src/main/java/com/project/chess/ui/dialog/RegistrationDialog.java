package com.project.chess.ui.dialog;

import com.project.chess.ui.form.RegistrationForm;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class RegistrationDialog extends Dialog {
   public RegistrationDialog() {
      Image img = new Image("images/logo.svg", "Gambit logotype");
      HorizontalLayout logo = new HorizontalLayout(img);
      RegistrationForm registrationForm = new RegistrationForm();
      Paragraph offer = new Paragraph("Already have an account?");
      Button loginButton = new Button("Login!", click -> {
         close();
         new LoginDialog().open();
      });
      HorizontalLayout loginOffer = new HorizontalLayout(offer, loginButton);

      getHeader().add(
         logo
      );

      add(
         registrationForm
      );

      getFooter().add(
         loginOffer
      );

      img.setHeight("60px");
      img.getStyle().set("padding-top", "20px");
      loginButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
      loginOffer.setWidthFull();
      loginOffer.setAlignItems(FlexComponent.Alignment.CENTER);
      loginOffer.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
      logo.setWidthFull();
      logo.setAlignItems(FlexComponent.Alignment.CENTER);
      logo.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
   }
}
