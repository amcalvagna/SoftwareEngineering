
public class Button extends Colleague {
    // private Mediator mediator;

    public void press() {
        System.out.println("Button pressed...");
        mediator.press(); // logica interamente spostata nel medatior
        /*
         * oppure parte della logica qui
         * ma con messaggi indiretti via mediator
         * 
         * if (!mediator.powerIsOn())
         * mediator.startPower();
         * if (mediator.fanIsOn()) {
         * mediator.fanTurnOff();
         * } else {
         * mediator.fanTurnOn();
         * }
         * 
         * in tal caso riporto (alcuni) metodi dei componenti nell'interfaccia del
         * mediator
         * 
         */

    }
}
