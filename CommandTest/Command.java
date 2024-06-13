import java.lang.reflect.*;

public class Command {
    private Object receiver;
    private Method command;
    private Object[] arguments;

    public Command(Object receiver, Method command,
            Object[] arguments) {
        this.receiver = receiver;
        this.command = command;
        this.arguments = arguments;
    }

    public void execute() throws InvocationTargetException,
            IllegalAccessException {
        command.invoke(receiver, arguments);
    }
}