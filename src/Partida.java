
public class Partida {
    
    private Tablero tablero;
    private boolean turnoBlanco;
    private String estado;

    public Partida() {
        this.tablero = new Tablero();
        this.turnoBlanco = true; // Empiezan blancas
        this.estado = "jugando";
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
}
