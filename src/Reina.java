public class Reina extends Pieza {
    public Reina(String color, int x, int y) {
        super(color, "Reina", x, y);
    }

    @Override
    public boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero) {
        return (nuevoX == getPosicionX() || nuevoY == getPosicionY()) ||
               (Math.abs(nuevoX - getPosicionX()) == Math.abs(nuevoY - getPosicionY()));
    }
}
