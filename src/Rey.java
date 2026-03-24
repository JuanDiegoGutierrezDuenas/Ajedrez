public class Rey extends Pieza {
    public Rey(String color, int x, int y) {
        super(color, "Rey", x, y);
    }

    @Override
    public boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero) {
        int dx = Math.abs(nuevoX - getPosicionX());
        int dy = Math.abs(nuevoY - getPosicionY());
        return dx <= 1 && dy <= 1;
    }
}
