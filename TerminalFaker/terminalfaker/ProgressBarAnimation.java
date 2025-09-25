package terminalfaker;

public class ProgressBarAnimation implements AnimationStrategy
{
    private int progress = 0;

    @Override
    public void nextFrame() {
        progress = (progress + 10) % 110; // simula avanzar y reiniciar
    }

    @Override
    public String render() {
        int bars = progress / 10;
        return "[" + "#".repeat(bars) + " ".repeat(10 - bars) + "] " + progress + "%";
    }
}