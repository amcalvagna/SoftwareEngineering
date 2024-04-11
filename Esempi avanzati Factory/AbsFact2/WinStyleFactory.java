package AbsFact2;
import Products.WinMenu;
import Products.WinWindow;
import Products.WinButton;

public class WinStyleFactory extends AbsFact {

    public WinStyleFactory() {
        menuFactory = new MenuFactory(WinMenu.class);
        windowFactory = new WindowFactory(WinWindow.class); 
        buttonFactory = new ButtonFactory(WinButton.class);  

        /*
                 menuFactory = new WinMenuFactory();
                 ...
                 ...
          
         */

    } 


    
}