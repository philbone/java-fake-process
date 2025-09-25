package terminalfaker;

import java.util.List;

public class FakeProcess
{

    // Ejecuta un proceso individual
    public static void run(ProcessContext process) throws InterruptedException {
        process.run();
    }

    // Ejecuta una lista de procesos en secuencia
    public static void runAll(List<ProcessContext> processes) throws InterruptedException {
        for (ProcessContext process : processes) {
            process.run();
            System.out.println(); // salto de línea entre procesos
        }
    }

    // Atajo: construir y correr un proceso sin instanciar manualmente el contexto
    public static void run(AnimationStrategy animation, int steps, int delayMs, int initialDelayMs)
            throws InterruptedException {
        ProcessContext process = new ProcessContext(animation);
        process.setSteps(steps);
        process.setDelay(delayMs);
        process.setInitialDelay(initialDelayMs);
        process.run();
    }
}