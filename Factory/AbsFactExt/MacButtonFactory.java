package AbsFactExt;

import Products.Button;
import Products.MacButton;
//VARIANTE 

public class MacButtonFactory implements IButtonFactory{

    public Button getButton(){
        return new MacButton();
    }

    
}
