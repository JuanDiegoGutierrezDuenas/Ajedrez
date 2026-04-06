public class Peon extends Pieza {
    public Peon(String color, int x, int y) {
        super(color, "Peon", x, y);
    }

    @Override
public boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero) {
    int dx = nuevoX - getPosicionX();
    int dy = Math.abs(nuevoY - getPosicionY());

    if (getColor().equals("blanco")) {
        // avance simple
        if (dx == -1 && dy == 0 && tablero[nuevoX][nuevoY] == null) return true;
        // avance doble desde fila 6
        if (getPosicionX() == 6 && dx == -2 && dy == 0 &&
            tablero[getPosicionX()-1][nuevoY] == null && tablero[nuevoX][nuevoY] == null) return true;
        // captura diagonal
        if (dx == -1 && dy == 1 && tablero[nuevoX][nuevoY] != null &&
            !tablero[nuevoX][nuevoY].getColor().equals(this.getColor())) return true;
    } else {
        // avance simple
        if (dx == 1 && dy == 0 && tablero[nuevoX][nuevoY] == null) return true;
        // avance doble desde fila 1
        if (getPosicionX() == 1 && dx == 2 && dy == 0 &&
            tablero[getPosicionX()+1][nuevoY] == null && tablero[nuevoX][nuevoY] == null) return true;
        // captura diagonal
        if (dx == 1 && dy == 1 && tablero[nuevoX][nuevoY] != null &&
            !tablero[nuevoX][nuevoY].getColor().equals(this.getColor())) return true;
    }
    return false;
       } 

    }

