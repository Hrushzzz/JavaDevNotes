package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.AndroidButton;
import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.AndroidDropdown;
import DesignPatterns.Factory.components.dropdown.Dropdown;
import DesignPatterns.Factory.components.menu.AndroidMenu;
import DesignPatterns.Factory.components.menu.Menu;

public class AndroidFactory implements UIFactory{

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
