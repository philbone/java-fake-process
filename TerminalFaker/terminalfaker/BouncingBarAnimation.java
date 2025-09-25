package terminalfaker;

public class BouncingBarAnimation implements AnimationStrategy
{
    private int position = 0;
    private int direction = 1;
    private final int width = 10;

    @Override
    public void nextFrame() {
        position += direction;
        if (position == 0 || position == width - 1) {
            direction *= -1; // cambia dirección
        }
    }

    @Override
    public String render() {
        char[] bar = new char[width];
        for (int i = 0; i < width; i++) {
            bar[i] = ' ';
        }
        bar[position] = '#';
        return "[" + new String(bar) + "]";
    }
}