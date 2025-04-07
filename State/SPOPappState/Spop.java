
class SPop { // context

	private SpopState state = new Start();

	public void user(String userName) {
		state = state.user(userName);
	}

	public void pass(String password) {
		state = state.pass(password);
	}

	public void list(int n) {
		state = state.list(n);
	}

	public void list() {
		state = state.list();
	}

	public void retreive() {
		state = state.retr();
	}

	public void quit() {
		state = state.quit();
	}

}
