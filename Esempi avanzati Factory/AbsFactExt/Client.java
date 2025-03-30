package AbsFactExt;

import Products.Menu;
import Products.Window;
import Products.Button;

public class Client {

    public static void main(String[] args) {
        AbsFact factory = new WinStyleFactory(); //

        Menu m = factory.getMenu();
        m.draw();
        Window w = factory.getWindow();
        w.draw();
        Button b = factory.getButton();
        b.draw();

        factory = new MacStyleFactory(); 

        factory.getMenu().draw();
        factory.getWindow().draw();
        factory.getButton().draw();
        
    }

}
