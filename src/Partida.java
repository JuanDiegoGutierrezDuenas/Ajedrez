
public class Partida {
    
    private Tablero tablero;
    private boolean turnoBlanco;
    private String estado;
    private Historial historial;
    
    public Partida() {
        this.tablero = new Tablero();
        this.turnoBlanco = true; 
        this.estado = "jugando";
         this.historial = new Historial();
    }

    public void iniciarPartida() {
        System.out.println("Iniciando nueva partida de ajedrez...");
        tablero.mostrarTablero();
    }

    public void cambiarTurno() {
        this.turnoBlanco = !this.turnoBlanco;
    }

    public boolean verificarJaqueMate() {
        return false;
        
    }
    public Tablero getTablero() {
        return tablero;
    }
    public Historial getHistorial() {
        return historial;
    }

    public void registrarMovimiento(Pieza pieza, int filaOrig, int colOrig, int filaDest, int colDest) {
        Movimiento m = new Movimiento(pieza.getTipo(), filaOrig, colOrig, filaDest, colDest);
        historial.registrarJugada(m);
    }
}
