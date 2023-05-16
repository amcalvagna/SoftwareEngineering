public class PowerSupply {

    private Fan fan = null;
    private boolean on = false;

    public void start() {
        assert (fan != null); // requires a fan to operate
        if (!on) {
            on = true;
            System.out.println("Switching power on...");
        }
    }

    public void stop() {
        assert (fan != null);
        if (on) {
            System.out.println("Switching power off...");
            on = false;
        }
    }

    public void add(Fan fan) {
        this.fan = fan;
    }

    public boolean isOn() {
        return on;
    }
}
