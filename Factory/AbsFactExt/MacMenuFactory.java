package AbsFactExt;

import Products.Menu;
import Products.MacMenu;

//VARIANTE 

public class MacMenuFactory implements IMenuFactory{

    public Menu getMenu(){
        return new MacMenu();
    }

    
}
