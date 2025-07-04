package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.Dropdown;
import DesignPatterns.Factory.components.menu.Menu;

// factory for UI components
public interface UIFactory {
    Menu createMenu();
    Dropdown createDropdown();
    Button createButton();
}
