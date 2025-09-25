package terminalfaker;

public class FinishedState implements ProcessState
{
    @Override
    public void handle(ProcessContext context) {
        System.out.println(" Proceso terminado ✅");
    }

    @Override
    public String getStatus() {
        return "FINISHED";
    }
}