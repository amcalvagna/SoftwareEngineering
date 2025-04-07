
public class MediatorIntegrationTest {

    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;

    public void setUp() {
        this.button = new Button();
        this.fan = new Fan();
        this.powerSupply = new PowerSupply();

        Mediator mediator = new CoolingMediator(button, fan, powerSupply);

    }

    public void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        // gli oggetti del sottosistema sono accessibili al client
        // ma le loro interazioni interne invece che dirette e distribuite
        // sono tutte indirette, rivolte solo al mediator
        // da fuori non si vede differenza
        assert (!fan.isOn());

        button.press();
        assert (fan.isOn());

        button.press();
        assert (!fan.isOn());
    }

    public static void main(String[] args) {

        MediatorIntegrationTest t = new MediatorIntegrationTest();

        t.setUp();
        t.givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff();
    }
}