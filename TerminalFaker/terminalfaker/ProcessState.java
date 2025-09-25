package terminalfaker;

public interface ProcessState
{
    void handle(ProcessContext context);
    String getStatus();
}