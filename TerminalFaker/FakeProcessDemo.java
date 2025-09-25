import terminalfaker.*;

public class FakeProcessDemo
{
    public static void main(String[] args) throws InterruptedException {
        // Usamos una animación tipo Spinner
        ProcessContext process = new ProcessContext(new ProgressBarAnimation());

        // Arrancamos en Idle
        process.executeStep();
        Thread.sleep(500);

        // Pasamos a Running
        process.setState(new RunningState());
        for (int i = 0; i < 10; i++) {
            process.executeStep();
            Thread.sleep(300);
        }

        // Finalizamos
        process.setState(new FinishedState());
        process.executeStep();
    }
}