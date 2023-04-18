
public class Authorized implements SpopState {

    String userName;

    public Authorized(String user) {
        this.userName = user;
        System.out.println("Authorized: " + this.userName);

    }

    @Override
    public SpopState list(int n) {
        if (n <= mailbox.size()) {
            System.out.println(">> message no. " + n + " is " + mailbox.get(n - 1).length() + " chars long.");
            return this;
        }
        giveWarningOfIllegalCommand();
        return this;
    }

    @Override
    public SpopState list() {
        int len = 0;
        for (String s : mailbox)
            len += s.length();
        System.out.println(">> mailbox size is currently " + len + " chars long.");
        return this;

    }

    @Override
    public SpopState retr() {
        if (mailbox.isEmpty())
            System.out.println("no more messages...");
        else
            System.out.println(">> next mailbox slot is:  " + mailbox.remove(0));

        return this;
    }

}
