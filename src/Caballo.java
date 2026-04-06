public class Caballo extends Pieza {
    public Caballo(String color, int x, int y) {
        super(color, "Caballo", x, y);
    }

   @Override
public boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero) {
    int dx = Math.abs(nuevoX - getPosicionX());
    int dy = Math.abs(nuevoY - getPosicionY());
    return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
 }
}
