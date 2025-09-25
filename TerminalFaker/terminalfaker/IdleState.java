package terminalfaker;

public class IdleState implements ProcessState
{
    @Override
    public void handle(ProcessContext context) {
        System.out.print("Esperando para iniciar...");
        System.out.flush();
    }

    @Override
    public String getStatus() {
        return "IDLE";
    }
}