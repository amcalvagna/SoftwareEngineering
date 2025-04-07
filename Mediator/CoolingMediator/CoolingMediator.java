
public class CoolingMediator implements Mediator {
    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;

    public CoolingMediator(Button button, Fan fan, PowerSupply powerSupply) {
        this.button = button;
        this.fan = fan;
        this.powerSupply = powerSupply;

        button.setMediator(this);
        fan.setMediator(this);
        powerSupply.setMediator(this);
    }

    public void press() { // logica che era prima in button
        if (!powerSupply.isOn())
            powerSupply.start();
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() { // indirezione per powerSupply
        powerSupply.start();
    }

    public void stop() { // //indirezione per powerSupply
        powerSupply.stop();
    }

    // oppure, con gli altri approcci per colleague...

    // public void setButton(Button button) {
    // this.button = button;
    // // this.button.setMediator(this);
    // }

    // public void setFan(Fan fan) {
    // this.fan = fan;
    // // this.fan.setMediator(this);
    // }

    // public void setPowerSupplier(PowerSupplier powerSupply) {
    // this.powerSupply = powerSupply;
    // // this.powerSupply.setMediator(this);
    // }

}
