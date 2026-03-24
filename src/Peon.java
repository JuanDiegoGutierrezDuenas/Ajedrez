public class Peon extends Pieza {
    public Peon(String color, int x, int y) {
        super(color, "Peon", x, y);
    }

    @Override
    public boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero) {
   
        if (getColor().equals("blanco")) {
            return nuevoX == getPosicionX() - 1 && nuevoY == getPosicionY();
        } else {
            return nuevoX == getPosicionX() + 1 && nuevoY == getPosicionY();
        }
    }
}
