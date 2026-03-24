public class Torre extends Pieza {
    public Torre(String color, int x, int y) {
        super(color, "Torre", x, y);
    }

    @Override
    public boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero) {

        return (nuevoX == getPosicionX() || nuevoY == getPosicionY());
    }
}

