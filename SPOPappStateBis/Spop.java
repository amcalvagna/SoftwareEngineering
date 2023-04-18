import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SPop { // version with business logic hardwired here in the context (was in the state
				// classes)

	private String userName;
	private String password;
	private List<String> mailbox = new ArrayList<String>(
			Arrays.asList("a first message.", "a second messagge!", "a third and last message"));

	private SpopState state = new Start();

	public void user(String userName) {
		if (state.user(userName)) {
			this.userName = userName;
			state = new HaveUserName(this.userName);
		} else
			goToStartState();
	}

	public void pass(String password) {
		if (state.pass(password)) {
			this.password = password;
			this.state = new Authorized(this.mailbox);
		} else {
			sendErrorMessageOrWhatEver();
			goToStartState();

		}

	}

	public void list(int n) {
		if (state.list(n))
			;
		else {
			sendErrorMessageOrWhatEver();
			goToStartState();
		}
	}

	public void list() {
		if (state.list())
			;
		else {
			giveWarningOfIllegalCommand();
			goToStartState();
		}
	}

	public void retreive() {
		if (state.retr())
			;
		else {
			giveWarningOfIllegalCommand();
			goToStartState();
		}
	}

	public void quit() {
		state.quit(); // maybe perform conclusive task
		state = new Start();
	}

	private void goToStartState() {
		System.out.println("Session terminated!");
		this.userName = null; // example conclusive task: 
		this.password = null; // user data reset
		state = new Start();
	}

	private void sendErrorMessageOrWhatEver() {
		System.out.println("ERROR: unauthorized access!!");
	}

	private void giveWarningOfIllegalCommand() {
		System.out.println("WARNING!: illegal command!");
	}

}
