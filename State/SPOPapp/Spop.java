import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SPop {

	public enum State {
		HAVE_USER_NAME, START, AUTHORIZED;
	}

	private State state = State.START;
	String userName;
	String password;

	List<String> mailbox = new ArrayList<String>(
			Arrays.asList("a first message.", "a second messagge!", "a third and last message"));

	public void user(String userName) {
		switch (state) {
			case START:
				this.userName = userName;
				System.out.println("User: " + this.userName);
				state = State.HAVE_USER_NAME;
				break;
			case HAVE_USER_NAME:
			case AUTHORIZED:
				goToStartState();
		}
	}

	public void pass(String password) {
		switch (state) {
			case START:
				giveWarningOfIllegalCommand();
				break;
			case HAVE_USER_NAME:
				this.password = password;
				if (validateUser())
					state = State.AUTHORIZED;
				else {
					sendErrorMessageOrWhatEver();
					userName = null;
					password = null;
					state = State.START;
				}
				break;
			case AUTHORIZED:
				goToStartState();
		}
	}

	public void list(int n) {
		switch (state) {
			case START:
			case HAVE_USER_NAME:
				giveWarningOfIllegalCommand();
				break;

			case AUTHORIZED:
				if (n <= mailbox.size())
					System.out.println(">> message no. " + n + " is " + mailbox.get(n - 1).length() + " chars long.");
				else
					sendErrorMessageOrWhatEver();

		}
	}

	public void list() {
		switch (state) {
			case START:
			case HAVE_USER_NAME:
				giveWarningOfIllegalCommand();
				break;

			case AUTHORIZED:
				int len = 0;
				for (String s : mailbox)
					len += s.length();
				System.out.println(">> mailbox size is currently " + len + " chars long.");
		}
	}

	public void retreive() {
		switch (state) {
			case START:
			case HAVE_USER_NAME:
				giveWarningOfIllegalCommand();
				break;
			case AUTHORIZED:
				if (mailbox.isEmpty())
					System.out.println("no more messages...");
				else
					System.out.println(">> next mailbox slot is:  " + mailbox.remove(0));
		}
	}

	public void quit() {
		switch (state) {
			case START:
			case HAVE_USER_NAME:
			case AUTHORIZED:
				userName = null;
				password = null;
				goToStartState();
		}
	}

	private void goToStartState() {
		System.out.println("Session terminated!");
		state = State.START;
	}

	private void sendErrorMessageOrWhatEver() {
		System.out.println("ERROR: unauthorized operation.");
	}

	private boolean validateUser() {
		if (password.equals("open sesame!")) {
			System.out.println("User password validated!");
			return true;
		}
		return false;
	}

	private void giveWarningOfIllegalCommand() {
		System.out.println("WARNING!: illegal command!");

	}

}
