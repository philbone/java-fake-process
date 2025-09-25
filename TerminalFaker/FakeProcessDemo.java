import terminalfaker.*;

import java.util.*;

public class FakeProcessDemo {
    public static void main(String[] args) throws InterruptedException {
        // Ejemplo 1: proceso directo
        FakeProcess.run(new ProgressBarAnimation(), 10, 300, 500);

        // Ejemplo 2: lista de procesos secuenciales
        List<ProcessContext> processes = List.of(
            buildProcess(new SpinnerAnimation(), 20, 150, 300),
            buildProcess(new DotsAnimation(), 15, 400, 200),
            buildProcess(new BouncingBarAnimation(), 30, 100, 0),
            buildProcess(new TypingTextAnimation("Bienvenidos al curso!"), 20, 150, 500)
        );

        FakeProcess.runAll(processes);
    }

    private static ProcessContext buildProcess(AnimationStrategy anim, int steps, int delay, int initDelay) {
        ProcessContext p = new ProcessContext(anim);
        p.setSteps(steps);
        p.setDelay(delay);
        p.setInitialDelay(initDelay);
        return p;
    }
}