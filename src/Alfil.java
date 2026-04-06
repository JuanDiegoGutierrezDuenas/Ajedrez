public class Alfil extends Pieza {
    public Alfil(String color, int x, int y) {
        super(color, "Alfil", x, y);
    }

    @Override
public boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero) {
    int dx = nuevoX - getPosicionX();
    int dy = nuevoY - getPosicionY();


    if (Math.abs(dx) != Math.abs(dy)) {
        return false;
    }

    int stepX = Integer.compare(dx, 0);
    int stepY = Integer.compare(dy, 0);

    int x = getPosicionX() + stepX;
    int y = getPosicionY() + stepY;

    while (x != nuevoX && y != nuevoY) {
        if (tablero[x][y] != null) {
            return false; 
        }
        x += stepX;
        y += stepY;
    }

    return tablero[nuevoX][nuevoY] == null ||
           !tablero[nuevoX][nuevoY].getColor().equals(this.getColor());
 }
}
