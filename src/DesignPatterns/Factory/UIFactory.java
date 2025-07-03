package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.Dropdown;
import DesignPatterns.Factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Dropdown createDropdown();
    Button createButton();
}
