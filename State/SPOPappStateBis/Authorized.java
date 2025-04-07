import java.util.List;

public class Authorized implements SpopState {

    private List<String> mailbox;

    public Authorized(List<String> mailbox) {
        this.mailbox = mailbox;
        System.out.println("Mailbox access Authorized!");
    }

    @Override
    public boolean list(int n) {
        if (n <= mailbox.size())
            System.out.println(">> message no. " + n + " is " + mailbox.get(n - 1).length() + " chars long.");
        return true;
    }

    @Override
    public boolean list() {
        int len = 0;
        for (String s : mailbox)
            len += s.length();
        System.out.println(">> mailbox size is currently " + len + " chars long.");
        return true;

    }

    @Override
    public boolean retr() {
        if (mailbox.isEmpty())
            System.out.println("no more messages...");
        else
            System.out.println(">> next mailbox slot is:  " + mailbox.remove(0));

        return true;
    }

}
