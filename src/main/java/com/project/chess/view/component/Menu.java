package com.project.chess.view.component;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

public class Menu extends VerticalLayout{

   public Menu() {
      Tabs tabs = getTabs();
      HorizontalLayout auth = getAuth();

      add(
         tabs,
         auth
      );

      getStyle().set("height","100%");
      setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);
   }

   private static HorizontalLayout getAuth() {
      LoginOverlay loginOverlay = new LoginOverlay();

      Button loginButton = new Button("Log in");
      Button signUpButton = new Button("Sign Up");

      loginButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
      loginButton.addClickListener(event -> loginOverlay.setOpened(true));

      HorizontalLayout loginBlock = new HorizontalLayout();
      loginBlock
         .add(
            loginButton,
            signUpButton
         );
      loginBlock
         .setPadding(true);

      return loginBlock;
   }

   private static Tabs getTabs() {
      Tab play = new Tab("Play");
      Tab puzzles = new Tab("Puzzles");
      Tab social = new Tab("Social");
      Tab settings = new Tab("Settings");
      Tab more = new Tab("More");

      Tabs tabs = new Tabs(
         play, puzzles, social, settings, more
      );

      tabs.setOrientation(Tabs.Orientation.VERTICAL);

      return tabs;
   }
}
