class NodoJugador {
    String jugador;
    NodoJugador siguiente;

    public NodoJugador(String jugador) {
        this.jugador = jugador;
        this.siguiente = null;
    }
}

class ColaJugadores {
    private NodoJugador frente, fin;

    public void encolar(String jugador) {
        NodoJugador nuevo = new NodoJugador(jugador);
        if (fin != null) {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        if (frente == null) {
            frente = nuevo;
        }
    }

    public String desencolar() {
        if (frente == null) return null;
        String jugador = frente.jugador;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return jugador;
    }

    public String verTurno() {
        return (frente != null) ? frente.jugador : "Sin jugadores";
    }
}
