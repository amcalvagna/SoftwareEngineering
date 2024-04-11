package AbsFact2;

import Products.Menu;
import Products.Window;
import Products.Button;

public class Client {

    public static void main(String[] args) {
        AbsFact factory = new WinStyleFactory();

        Menu m = factory.getMenu();
        m.draw();
        Window w = factory.getWindow();
        w.draw();
        Button b = factory.getButton();
        b.draw();


        factory = new MacStyleFactory();

        m = factory.getMenu();
        m.draw();
        w = factory.getWindow();
        w.draw();
        b = factory.getButton();
        b.draw();


    }

}
