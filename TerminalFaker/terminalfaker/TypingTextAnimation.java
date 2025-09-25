package terminalfaker;

// === Texto que se "escribe solo" ===
public class TypingTextAnimation implements AnimationStrategy
{
    private final String message;
    private int index = 0;

    public TypingTextAnimation(String message) {
        this.message = message;
    }

    @Override
    public void nextFrame() {
        if (index < message.length()) {
            index++;
        }
    }

    @Override
    public String render() {
        return message.substring(0, index);
    }
}