package terminalfaker;

// === CONTEXT (maneja Strategy + State) ===
public class ProcessContext
{
    private ProcessState state;
    private AnimationStrategy animation;

    public ProcessContext(AnimationStrategy animation) {
        this.animation = animation;
        this.state = new IdleState(); // estado inicial
    }

    public void setState(ProcessState state) {
        this.state = state;
    }

    public void setAnimation(AnimationStrategy animation) {
        this.animation = animation;
    }

    public AnimationStrategy getAnimation() {
        return animation;
    }

    public void executeStep() {
        state.handle(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}