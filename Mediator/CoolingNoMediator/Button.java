public class Button {

    private Fan fan;

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    // constructor, getters and setters

    public void press() {
        System.out.println("Button pressed...");
        PowerSupply power = fan.getPowerSupplier();
        if (!power.isOn())
            power.start();
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }
}