package AbsFact2;

import Products.Menu;
import Products.WinMenu;

public class WinMenuFactory implements IMenuFactory{

    public Menu getMenu(){
        return new WinMenu();
    }

    
}
