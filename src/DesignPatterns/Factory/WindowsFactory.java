package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.button.WindowsButton;
import DesignPatterns.Factory.components.dropdown.Dropdown;
import DesignPatterns.Factory.components.dropdown.WindowsDropdown;
import DesignPatterns.Factory.components.menu.Menu;
import DesignPatterns.Factory.components.menu.WindowsMenu;

public class WindowsFactory implements UIFactory {

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
