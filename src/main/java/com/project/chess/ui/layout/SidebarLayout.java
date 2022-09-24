package com.project.chess.ui.layout;

import com.project.chess.ui.tabs.*;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;

public class SidebarLayout extends VerticalLayout{

   public SidebarLayout() {
      Tabs tabs = buildTabs();

      add(
         tabs,
         new SidebarAuthLayout()
      );

      setHeightFull();
      setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);
   }

   private Tabs buildTabs() {
      Tabs tabs = new Tabs();
      tabs.add(
         buildTab(VaadinIcon.GAMEPAD, "Play", PlayTab.class),
         buildTab(VaadinIcon.PUZZLE_PIECE, "Puzzles", PuzzlesTab.class),
         buildTab(VaadinIcon.GROUP, "Social", SocialTab.class),
         buildTab(VaadinIcon.SLIDERS, "Settings", SettingsTab.class),
         buildTab(VaadinIcon.ELLIPSIS_DOTS_H, "More", MoreTab.class)
      );
      tabs.setOrientation(Tabs.Orientation.VERTICAL);

      return tabs;
   }

   private Tab buildTab(VaadinIcon viewIcon, String viewName, Class<? extends Component> navigationTarget) {
      Icon icon = buildIcon(viewIcon);
      RouterLink link = new RouterLink();
      link.add(icon, new Span(viewName));
      link.setRoute(navigationTarget);

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
