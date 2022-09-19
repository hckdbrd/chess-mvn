package com.project.chess.view.component;

import com.project.chess.view.*;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;

public class Sidebar extends VerticalLayout{

   public Sidebar() {
      Tabs tabs = buildTabs();
      HorizontalLayout auth = buildAuth();

      add(
         tabs,
         auth
      );

      setHeightFull();
      setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);
   }

   private static HorizontalLayout buildAuth() {
      LoginOverlay loginOverlay = new LoginOverlay();
      loginOverlay.setTitle("GAMBIT");
      loginOverlay.setDescription("Chess platform for professionals.");

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

      loginBlock.setWidthFull();
      loginBlock.setJustifyContentMode(JustifyContentMode.CENTER);

      return loginBlock;
   }

   private Tabs buildTabs() {
      Tabs tabs = new Tabs();
      tabs.add(
         buildTab(VaadinIcon.GAMEPAD, "Play", PlayView.class),
         buildTab(VaadinIcon.PUZZLE_PIECE, "Puzzles", PuzzlesView.class),
         buildTab(VaadinIcon.GROUP, "Social", SocialView.class),
         buildTab(VaadinIcon.SLIDERS, "Settings", SettingsView.class),
         buildTab(VaadinIcon.ELLIPSIS_DOTS_H, "More", MoreView.class)
      );
      tabs.setOrientation(Tabs.Orientation.VERTICAL);

      return tabs;
   }

   private Tab buildTab(VaadinIcon viewIcon, String viewName, Class<? extends Component> navigationTarget) {
      Icon icon = buildIcon(viewIcon);
      RouterLink link = new RouterLink();
      link.add(icon, new Span(viewName));
      link.setRoute(navigationTarget);
      link.setTabIndex(-1);

      return new Tab(link);
   }

   private static Icon buildIcon(VaadinIcon viewIcon) {
      Icon icon = viewIcon.create();
      icon.getStyle()
         .set("box-sizing", "border-box")
         .set("margin-inline-end", "var(--lumo-space-m)")
         .set("margin-inline-start", "var(--lumo-space-xs)")
         .set("padding", "var(--lumo-space-xs)");
      return icon;
   }
}
