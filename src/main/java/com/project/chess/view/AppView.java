package com.project.chess.view;

import com.project.chess.view.component.Sidebar;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("")
//@RouteAlias(value = "game", layout = AppView.class)
public class AppView extends AppLayout {
   public AppView() {
      HorizontalLayout navBarLayout = getLayout();

      addToNavbar(
         navBarLayout
      );

      // Drawer
      addToDrawer(
         new Sidebar()
      );

      // Additional Settings
//      setPrimarySection(Section.DRAWER);
   }

   private static HorizontalLayout getLayout() {
      HorizontalLayout hzl = new HorizontalLayout();

      Image logo = new Image("images/logo.svg", "Gambit logotype");
      logo.getStyle()
         .set("height", "18px");

      hzl.add(
         new DrawerToggle(),
         logo
      );

      hzl.setAlignItems(FlexComponent.Alignment.CENTER);
      return hzl;
   }
}
