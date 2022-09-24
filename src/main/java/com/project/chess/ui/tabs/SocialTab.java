package com.project.chess.ui.tabs;

import com.project.chess.ui.layout.MainLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.RolesAllowed;

@Route(value = "social", layout = MainLayout.class)
@RolesAllowed({"USER","ADMIN"})
@PageTitle("Social")
public class SocialTab extends VerticalLayout {
   public SocialTab() {
      add(
        new H1("SocialView")
      );
   }
}
