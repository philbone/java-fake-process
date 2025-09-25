# 🖥️ Java Terminal Faker Process

Un pequeño paquete Java para simular procesos falsos con animaciones en la terminal.
Ideal para clases, demos o ejercicios interactivos donde quieras mostrar progreso sin tener un proceso real detrás.

## ✨ Características

- Varias **estrategias de animación** listas para usar:
    - `ProgressBarAnimation` → barra de progreso llenándose.
    - `SpinnerAnimation` → cursor giratorio.
    - `DotsAnimation` → texto con puntos suspensivos (`Cargando...`).
    - `BouncingBarAnimation` → barra con bloque rebotando.
    - `TypingTextAnimation` → texto que aparece como si se escribiera solo.
- Manejo de **estados del proceso** (`Idle`, `Running`, `Finished`) usando *State pattern*.
- Control de:
    - Número de pasos (`steps`).
    - Velocidad de la animación (`delayMs`).
    - Pausa inicial (`initialDelayMs`).
    - Etiqueta descriptiva (`label`).
- Fácil de usar con:
    - Un solo proceso.
    - Listas de procesos secuenciales.

## 👉 Ejemplo rápido

    import terminalfaker.*;
    
    public class FakeProcessDemo
    {
        public static void main(String[] args) throws InterruptedException {
            // Ejecutar un proceso rápido con barra de progreso
            FakeProcess.run(new ProgressBarAnimation(), 10, 300, 500);
        }
    }

## 📋 Ejemplo con lista de procesos

    import terminalfaker.*;
    import java.util.*;
    
    public class FakeProcessDemo
    {
        public static void main(String[] args) throws InterruptedException {
            List<ProcessContext> processes = List.of(
                buildProcess("Compilando", new SpinnerAnimation(), 20, 150, 300),
                buildProcess("Cargando datos", new DotsAnimation(), 15, 400, 200),
                buildProcess("Ingresando a la Matrix", new BouncingBarAnimation(), 30, 100, 0),
                buildProcess("Hola Neo", new TypingTextAnimation("Sigue al conejo"), 20, 150, 500)
            );
    
            FakeProcess.runAll(processes);
        }
    
        private static ProcessContext buildProcess(String label, AnimationStrategy anim,
                                                   int steps, int delay, int initDelay) {
            ProcessContext p = new ProcessContext(anim);
            p.setLabel(label);
            p.setSteps(steps);
            p.setDelay(delay);
            p.setInitialDelay(initDelay);
            return p;
        }
    }

## 🧭 Roadmap

- Opciones de colores ANSI y estilos personalizados.
- Ejecución de procesos en paralelo.