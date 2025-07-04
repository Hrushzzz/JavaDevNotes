package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.Dropdown;
import DesignPatterns.Factory.components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.WINDOWS);
        UIFactory uiFactory = flutter.uiFactory();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
        Button button = uiFactory.createButton();
    }
}
