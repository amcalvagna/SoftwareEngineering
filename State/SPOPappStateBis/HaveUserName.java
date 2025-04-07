public class HaveUserName implements SpopState {

    private String userName;

    public HaveUserName(String userName) {
        System.out.println("User: " + userName);
        this.userName=userName;
    }

    @Override
    public boolean pass(String password) {
        return validate(password); //should be name and password

    }

    private boolean validate(String password) {
        // check password for <userName> 
        if (password.equals("open sesame!")) {
            System.out.println("User validated!");
            return true;
        }
        return false;
    }

}
