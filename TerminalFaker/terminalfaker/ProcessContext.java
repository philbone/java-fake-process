package terminalfaker;

public class ProcessContext
{
    private ProcessState state;
    private AnimationStrategy animation;
    private int steps = 10;
    private int delayMs = 300;
    private int initialDelayMs = 0;

    public ProcessContext(AnimationStrategy animation) {
        this.animation = animation;
        this.state = new IdleState();
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setDelay(int delayMs) {
        this.delayMs = delayMs;
    }

    public void setInitialDelay(int initialDelayMs) {
        this.initialDelayMs = initialDelayMs;
    }

    public void run() throws InterruptedException {
        // Estado inicial
        setState(new IdleState());
        executeStep();

        // Pausa inicial (si corresponde)
        if (initialDelayMs > 0) {
            Thread.sleep(initialDelayMs);
        }

        // Ejecución
        setState(new RunningState());
        for (int i = 0; i < steps; i++) {
            executeStep();
            Thread.sleep(delayMs);
        }

        // Finalización
        setState(new FinishedState());
        executeStep();
    }

    public void executeStep() {
        state.handle(this);
    }

    public void setState(ProcessState state) {
        this.state = state;
    }

    public AnimationStrategy getAnimation() {
        return animation;
    }
}
