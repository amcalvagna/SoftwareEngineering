
public class BeforeMediatorTest {

    private Fan fan;
    private Button button;
    private PowerSupply power;

    public void setUp() {
        this.button = new Button();
        this.power = new PowerSupply();
        this.fan = new Fan(button, power);
    }

    public void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        assert (!fan.isOn());

        button.press();
        assert (fan.isOn());

        button.press();
        assert (!fan.isOn());
    }

    public static void main(String[] args) {

        BeforeMediatorTest t = new BeforeMediatorTest();

        t.setUp();
        t.givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff();
    }

}