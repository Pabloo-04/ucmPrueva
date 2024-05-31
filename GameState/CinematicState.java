package GameState;

public class CinematicState implements GameState {
    @Override
    public void handle(GameContext context) {
        String[] story = {
                "Nuestra aventura comienza en el primer día de clase, cuando nuestro protagonista,",
                "emocionado por ingresar a la UCA, se encuentra con un accidente inesperado.",
                "¡El Pokémon legendario Owluca tomó control de todo el campus y ha hipnotizado a todos los Pokemones y a los profesores!",
                "Es nuestro deber detenerlo y regresar la paz a la UCA.",
                "Solo un estudiante será capaz de hacerlo…"
    };
}


}