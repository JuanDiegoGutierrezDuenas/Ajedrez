public class Torre extends Pieza {
    public Torre(String color, int x, int y) {
        super(color, "Torre", x, y);
    }

    @Override
    public boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero) {
    if(nuevoX != getPosicionX()&& nuevoY != getPosicionY()){
        return false;
    }
    int dx= Integer.compare(nuevoX, getPosicionX());
    int dy= Integer.compare(nuevoY, getPosicionY());
    
    int x = getPosicionX() + dx;
    int y = getPosicionY() + dy;
    while (x != nuevoX || y != nuevoY){
        if(tablero[x][y] != null){
            return false;
        }
        x += dx;
        y += dy;
    }
    return tablero [nuevoX][nuevoY]==null||
            !tablero[nuevoX][nuevoY].getColor().equals(this.getColor());
    }
}