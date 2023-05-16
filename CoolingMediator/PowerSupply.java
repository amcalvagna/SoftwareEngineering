
public class PowerSupply extends Colleague {

    private boolean on = false;

    public void start() {
        if (!on) {
            on = true;
            System.out.println("Switching power on...");
        }
    }

    public void stop() {
        if (on) {
            System.out.println("Switching power off...");
            on = false;
        }
    }

    public boolean isOn() {
        return on;
    }
}
