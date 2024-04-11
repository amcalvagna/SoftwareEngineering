package AbsFact2;
import Products.Button;
import Products.Menu;
import Products.Window;

// invece di avere i factorymethod astratti qui dentro
// aggiungo riferimenti ai factorymethod astratti in oggetti esterni preesistenti
// uso il subclassing per selezionare le implementaioni concrete 
public abstract class AbsFact {    
    MenuFactory menuFactory; 
    WindowFactory windowFactory;
    ButtonFactory buttonFactory;

    Menu getMenu() { return menuFactory.getMenu();}
    Window getWindow() { return windowFactory.getWindow();}
    Button getButton() { return buttonFactory.getButton();}

    
    /* 
    In alternativa a sottoclassare una classe astratta, 
    posso farla direttamente concreta e parametrizzarla
    oppure usare i generics
    oppure usare la reflection

    public AbsConcreteFact(MenuFactory m, WindowFactory w, ButtonFactory b) {
        menu = m; \\ ricevo l'istanza di una sotto-factory specifica win o mac
        window = w;
        button = b; 

    }
*/
}



