package terminalfaker;

public interface AnimationStrategy
{
    void nextFrame();   // avanzar al siguiente "frame" de la animación
    String render();    // devolver lo que se dibuja (ejemplo: texto, barra, etc.)
}
