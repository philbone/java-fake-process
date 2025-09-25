package terminalfaker;

// === Puntos suspensivos animados ===
public class DotsAnimation implements AnimationStrategy
{
    private int count = 0;
    private final int maxDots = 3;

    @Override
    public void nextFrame() {
        count = (count + 1) % (maxDots + 1); // 0 → 3 puntos
    }

    @Override
    public String render() {
        return "Cargando." + ".".repeat(count);
    }
}