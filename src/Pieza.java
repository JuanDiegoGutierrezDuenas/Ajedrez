
public abstract class Pieza {
    private String color;
    private String tipo;
    private int posicionX;
    private int posicionY;
    private boolean viva;

    public Pieza(String color, String tipo, int posicionX, int posicionY){
        this.color = color;
        this.tipo = tipo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.viva = true;
    }

    public String getColor(){ return color; }
    public String getTipo(){ return tipo; }
    public int getPosicionX(){ return posicionX; }
    public int getPosicionY(){ return posicionY; }
    public boolean estaViva(){ return viva; }

    public void setPosicion(int posicionX, int posicionY){
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public abstract boolean validarMovimiento(int nuevoX, int nuevoY, Pieza[][] tablero);
}
