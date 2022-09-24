package com.project.chess.ui.layout;

import com.vaadin.flow.component.applayout.AppLayout;

public class MainLayout extends AppLayout {
   public MainLayout() {
      addToNavbar(
         new HeaderLayout()
      );

      // Drawer
      addToDrawer(
         new SidebarLayout()
      );
   }
}
