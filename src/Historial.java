import com.murcia.utils.*;

public class Historial {
    private NodoMovimiento cabeza;

    public Historial() {
        cabeza = null;
    }

    public void registrarJugada(Movimiento mov) {
        NodoMovimiento nuevo = new NodoMovimiento(mov);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoMovimiento temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public void mostrarHistorial() {
        System.out.println("--- HISTORIAL DE MOVIMIENTOS ---");
        NodoMovimiento temp = cabeza;
        int contador = 1;
        while (temp != null) {
            System.out.println(contador + ". " + temp.movimiento);
            temp = temp.siguiente;
            contador++;
        }
    }
}
