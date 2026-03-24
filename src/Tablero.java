public class Tablero {
    private Pieza[][] casillas;

    public Tablero() {
        this.casillas = new Pieza[8][8];
        inicializarPiezas(); // 👉 aquí se colocan las piezas
    }

    private void inicializarPiezas() {
  
        for (int j = 0; j < 8; j++) {
            casillas[6][j] = new Peon("blanco", 6, j);
        }

        for (int j = 0; j < 8; j++) {
            casillas[1][j] = new Peon("negro", 1, j);
        }

   
        casillas[7][0] = new Torre("blanco", 7, 0);
        casillas[7][7] = new Torre("blanco", 7, 7);
        casillas[0][0] = new Torre("negro", 0, 0);
        casillas[0][7] = new Torre("negro", 0, 7);

        // ... y así con caballos, alfiles, reina y rey
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

