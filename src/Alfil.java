public class Alfil extends Pieza {
    public Alfil(String color, int x, int y) {
        super(color, "Alfil", x, y);
    }

    @Override
    public boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero) {
        return Math.abs(nuevoX - getPosicionX()) == Math.abs(nuevoY - getPosicionY());
    }
}
