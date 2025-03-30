package AbsFactExt;
import Products.Button;
import Products.Menu;
import Products.Window;

// VERSIONE 2: factory methods esterni 
// aggiungo riferimenti ai factorymethod astratti in oggetti esterni preesistenti
// derivo per selezionare le implementaioni concrete 
public abstract class AbsFact {    
    IMenuFactory menuFactory; 
    IWindowFactory windowFactory;
    IButtonFactory buttonFactory;

    //delego alle sottoclassi di inizializzare le factory da usare

    Menu getMenu() { return menuFactory.getMenu();}
    Window getWindow() { return windowFactory.getWindow();}
    Button getButton() { return buttonFactory.getButton();}


}



