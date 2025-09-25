package terminalfaker;

public class RunningState implements ProcessState
{
    @Override
    public void handle(ProcessContext context) {
        context.getAnimation().nextFrame();
        String label = context.getLabel().isEmpty() ? "" : context.getLabel() + ": ";
        System.out.print("\r" + label + context.getAnimation().render());
        System.out.flush();
    }

    @Override
    public String getStatus() {
        return "RUNNING";
    }
}