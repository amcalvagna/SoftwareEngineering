package AbsFactExt;

import Products.Menu;
import Products.WinMenu;

//VARIANTE 

public class WinMenuFactory implements IMenuFactory{

    public Menu getMenu(){
        return new WinMenu();
    }

    
}
