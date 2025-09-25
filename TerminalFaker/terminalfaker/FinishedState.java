package terminalfaker;

public class FinishedState implements ProcessState
{
    @Override
    public void handle(ProcessContext context) {        
        String label = context.getLabel().isEmpty() ? "" : context.getLabel() + ": ";
        System.out.println("\n" + label + "Proceso terminado ✅");
    }

    @Override
    public String getStatus() {
        return "FINISHED";
    }
}