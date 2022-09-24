package com.project.chess.ui.dialog;

import com.project.chess.ui.form.LoginForm;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class LoginDialog extends Dialog {

   public LoginDialog() {
      Image img = new Image("images/logo.svg", "Gambit logotype");
      HorizontalLayout logo = new HorizontalLayout(img);
      LoginForm loginForm = new LoginForm();
      Paragraph offer = new Paragraph("Newbie?");
      Button regButton = new Button("Sign up - and start playing chess!", click -> {
         close();
         new RegistrationDialog().open();
      });
      HorizontalLayout regOffer = new HorizontalLayout(offer, regButton);

      getHeader().add(
         logo
      );

      add(
         loginForm
      );

      getFooter().add(
         regOffer
      );

      img.setHeight("60px");
      img.getStyle().set("padding-top", "20px");
      regButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
      center(regOffer);
      center(logo);
   }

   private static void center(FlexComponent regOffer) {
      regOffer.setWidthFull();
      regOffer.setAlignItems(FlexComponent.Alignment.CENTER);
      regOffer.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
   }
}
