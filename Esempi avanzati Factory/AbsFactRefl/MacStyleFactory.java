package AbsFactRefl;
import Products.MacMenu;
import Products.MacWindow;
import Products.MacButton;

public class MacStyleFactory extends AbsFact {

    public MacStyleFactory() {
        menuFactory = new MenuFactory(MacMenu.class);
        windowFactory = new WindowFactory(MacWindow.class); 
        buttonFactory = new ButtonFactory(MacButton.class);          

    } 


    
}