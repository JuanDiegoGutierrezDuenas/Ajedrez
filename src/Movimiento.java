public class Movimiento {
    private String pieza;
    private int filaOrig, colOrig, filaDest, colDest;

    public Movimiento(String pieza, int filaOrig, int colOrig, int filaDest, int colDest) {
        this.pieza = pieza;
        this.filaOrig = filaOrig;
        this.colOrig = colOrig;
        this.filaDest = filaDest;
        this.colDest = colDest;
    }

    @Override
    public String toString() {
        return pieza + " de (" + filaOrig + "," + colOrig + ") a (" + filaDest + "," + colDest + ")";
    }
}
