package terminalfaker;

public class RunningState implements ProcessState
{
    @Override
    public void handle(ProcessContext context) {
        context.getAnimation().nextFrame();
        
        System.out.print("\r" + context.getAnimation().render());
        System.out.flush();
    }

    @Override
    public String getStatus() {
        return " RUNNING";
    }
}