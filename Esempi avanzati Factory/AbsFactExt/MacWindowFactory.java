package AbsFactExt;

import Products.Window;
import Products.MacWindow;

public class MacWindowFactory implements IWindowFactory{

    public Window getWindow(){
        return new MacWindow();
    }

    
}
