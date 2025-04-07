public class Fan {
    private boolean isOn = false;

    private Button button;
    private PowerSupply power;
    // constructor, getters and setters

    public boolean isOn() {
        System.err.println("Fan was " + (isOn ? "on..." : "off..."));
        return isOn;
    }

    public Fan(Button button, PowerSupply power) {
        this.button = button;
        this.power = power;

        this.button.setFan(this);
        this.power.add(this);
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public PowerSupply getPowerSupplier() {
        return power;
    }

    public void setPowerSupplier(PowerSupply powerSupplier) {
        this.power = powerSupplier;
    }

    public void turnOn() {
        System.out.println("turning on fan...");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("turning off fan...");
        isOn = false;
        power.stop();
    }

    public void turnOnPower() {
        power.start();
    }
}