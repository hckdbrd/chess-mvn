package com.project.chess.ui.layout;

import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class Header extends HorizontalLayout{
   public Header() {
      Image logo = new Image("images/logo.svg", "Gambit logotype");
      logo.getStyle().set("height", "18px");
      add(
         new DrawerToggle(),
         logo
      );
      setAlignItems(FlexComponent.Alignment.CENTER);
   }
}
