package terminalfaker;

public class SpinnerAnimation implements AnimationStrategy
{
    private final char[] frames = {'|', '/', '-', '\\'};
    private int index = 0;

    @Override
    public void nextFrame() {
        index = (index + 1) % frames.length;
    }

    @Override
    public String render() {
        return "Procesando " + frames[index];
    }
}