package com.project.chess.ui.layout;

import com.vaadin.flow.component.applayout.AppLayout;

public class Main extends AppLayout {
   public Main() {
      addToNavbar(
         new Header()
      );

      // Drawer
      addToDrawer(
         new Sidebar()
      );
   }
}
