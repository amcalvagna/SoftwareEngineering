package AbsFactRefl;
import Products.WinMenu;
import Products.WinWindow;
import Products.WinButton;

public class WinStyleFactory extends AbsFact {

    public WinStyleFactory() { //versione con reflection
        menuFactory = new MenuFactory(WinMenu.class);
        windowFactory = new WindowFactory(WinWindow.class); 
        buttonFactory = new ButtonFactory(WinButton.class);  

    } 


    
}