package com.project.chess.view;

import com.project.chess.view.component.Menu;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.Route;

@Route("")
public class AppView extends AppLayout {
   public AppView() {
      H1 title = new H1("GAMBIT");
      title.getStyle()
         .set("font-size", "var(--lumo-font-size-l)")
         .set("margin", "0");
      //Navbar
      addToNavbar(
         new DrawerToggle(),
         title
      );

      // Drawer
      LoginOverlay loginOverlay = new LoginOverlay();

      addToDrawer(
         new Menu()
      );

      // Additional Settings
//      setPrimarySection(Section.DRAWER);
   }
}
