public class Tablero {
    private Pieza[][] casillas;

    public Tablero() {
        this.casillas = new Pieza[8][8];
        inicializarPiezas();
    }

    private void inicializarPiezas() {
    // Peones
    for (int j = 0; j < 8; j++) {
        casillas[6][j] = new Peon("blanco", 6, j);
        casillas[1][j] = new Peon("negro", 1, j);
    }

    // Torres
    casillas[7][0] = new Torre("blanco", 7, 0);
    casillas[7][7] = new Torre("blanco", 7, 7);
    casillas[0][0] = new Torre("negro", 0, 0);
    casillas[0][7] = new Torre("negro", 0, 7);

    // Caballos
    casillas[7][1] = new Caballo("blanco", 7, 1);
    casillas[7][6] = new Caballo("blanco", 7, 6);
    casillas[0][1] = new Caballo("negro", 0, 1);
    casillas[0][6] = new Caballo("negro", 0, 6);

    // Alfiles
    casillas[7][2] = new Alfil("blanco", 7, 2);
    casillas[7][5] = new Alfil("blanco", 7, 5);
    casillas[0][2] = new Alfil("negro", 0, 2);
    casillas[0][5] = new Alfil("negro", 0, 5);

    // Reina y Rey
    casillas[7][3] = new Reina("blanco", 7, 3);
    casillas[7][4] = new Rey("blanco", 7, 4);
    casillas[0][3] = new Reina("negro", 0, 3);
    casillas[0][4] = new Rey("negro", 0, 4);
}


   public void moverPieza(int filaOrig, int colOrig, int filaDest, int colDest) {
    Pieza pieza = casillas[filaOrig][colOrig];
    if (pieza == null) {
        System.out.println("No hay pieza en la posición de origen.");
        return;
    }
    if (pieza.validarMovimiento(filaDest, colDest, casillas)) {
        pieza.setPosicion(filaDest, colDest);
        casillas[filaDest][colDest] = pieza;
        casillas[filaOrig][colOrig] = null;
        System.out.println("Movimiento realizado.");
    } else {
        System.out.println("Movimiento inválido para " + pieza.getTipo());
    }
}

    public void mostrarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (casillas[i][j] != null) {
                    System.out.print("[" + casillas[i][j].getTipo().charAt(0) + "]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
}


