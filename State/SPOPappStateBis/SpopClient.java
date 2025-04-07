public class SpopClient {
    static SPop context = new SPop();

    public static void main(String[] args) {

        context.user("Pippo");
        context.pass("open sesame!");

        context.list();
        context.retreive();
        context.retreive();

        context.list();
        context.quit();

        context.user("Pippo");
        context.pass("open sesame!");

        context.list();
        context.retreive();
        context.retreive();
        context.quit();

        context.user("Alfio");
        context.pass("this is a wrong password");
        context.retreive();
        context.quit();

    }

}
