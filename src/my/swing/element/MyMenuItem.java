package my.swing.element;

/**
 *
 * @author ks2980
 */
public class MyMenuItem {
    public String menuItemName;
    public String menuItemIcon;
    public String[] menuSubmenuItems;

    public MyMenuItem(String menuItemName, String menuItemIcon, String[] menuSubmenuItems) {
        this.menuItemName = menuItemName;
        this.menuItemIcon = menuItemIcon;
        this.menuSubmenuItems = menuSubmenuItems;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getMenuItemIcon() {
        return menuItemIcon;
    }

    public void setMenuItemIcon(String menuItemIcon) {
        this.menuItemIcon = menuItemIcon;
    }

    public String[] getMenuSubmenuItems() {
        return menuSubmenuItems;
    }

    public void setMenuSubmenuItems(String[] menuSubmenuItems) {
        this.menuSubmenuItems = menuSubmenuItems;
    }   
}
