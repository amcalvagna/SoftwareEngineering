public class HaveUserName implements SpopState {
    String userName;
    String password;

    public HaveUserName(String userName) {
        this.userName = userName;
        System.out.println("User: " + this.userName);
    }

    @Override
    public SpopState pass(String password) {
        this.password = password;
        if (validate())
            return new Authorized(userName);
        else {
            sendErrorMessageOrWhatEver();
            this.userName = null;
            this.password = null;
            return goToStartState();
        }
    }

    private boolean validate() {
        // check password for <userName>
        if (this.password.equals("open sesame!")) {
            System.out.println("User validated!");
            return true;
        }
        return false;
    }

}
