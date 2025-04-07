package AbsFactExt;

import Products.Button;
import Products.WinButton;
//VARIANTE 

public class WinButtonFactory implements IButtonFactory{

    public Button getButton(){
        return new WinButton();
    }

    
}
