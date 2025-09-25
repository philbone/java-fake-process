import terminalfaker.*;

import java.util.*;

public class FakeProcessDemo
{
    public static void main(String[] args) throws InterruptedException {
        // Ejemplo 1: proceso directo
        FakeProcess.run(new ProgressBarAnimation(), 10, 300, 500);

        // Ejemplo 2: lista de procesos secuenciales
        List<ProcessContext> processes = List.of(
            buildProcess("Compilando", new SpinnerAnimation(), 20, 150, 300),
            buildProcess("Cargando datos", new DotsAnimation(), 15, 400, 200),
            buildProcess("Ingresando a la Matrix", new BouncingBarAnimation(), 30, 100, 0),
            buildProcess("Hola Neo", new TypingTextAnimation("Sigue al conejo"), 20, 150, 500)
        );

        FakeProcess.runAll(processes);
    }

    private static ProcessContext buildProcess(String label, AnimationStrategy anim, int steps, int delay, int initDelay) {
        ProcessContext p = new ProcessContext(anim);
        p.setSteps(steps);
        p.setDelay(delay);
        p.setInitialDelay(initDelay);
        p.setLabel(label);
        return p;
    }
    
    
}