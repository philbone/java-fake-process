package terminalfaker;

public class IdleState implements ProcessState
{
    @Override
    public void handle(ProcessContext context) {
        System.out.println("Esperando para iniciar...");
    }

    @Override
    public String getStatus() {
        return "IDLE";
    }
}