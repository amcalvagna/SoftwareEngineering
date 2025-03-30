package AbsFactExt;

import Products.Window;
import Products.WinWindow;

public class WinWindowFactory implements IWindowFactory{

    public Window getWindow(){
        return new WinWindow();
    }

    
}
