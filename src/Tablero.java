
public class Tablero {
    
    private Pieza[][] casillas;

    public Tablero() {
        this.casillas = new Pieza[8][8];
    }

    public Pieza getPieza(int fila, int columna) {
        return casillas[fila][columna];
    }

    public void moverPieza(int filaOrig, int colOrig, int filaDest, int colDest) {
        Pieza pieza = casillas[filaOrig][colOrig];
        casillas[filaDest][colDest] = pieza;
        casillas[filaOrig][colOrig] = null;
    }

    public boolean estaOcupada(int fila, int columna) {
        return casillas[fila][columna] != null;
    }

    public void mostrarTablero() {
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(estaOcupada(i, j) ? "[P]" : "[ ]");
            }
            System.out.println();
        }
    }
}
