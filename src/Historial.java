import com.murcia.utils.*;

// 1. Hacemos que Historial SEA una lista (Herencia)
public class Historial extends ColaEnlazada { 

    public Historial() {
        
    }

  public void registrarJugada(Movimiento m) {
    this.encolar(m);
}


    public void mostrarHistorial() {
        // 2. Al ser "hijo" de la lista, ahora SÍ puedes ver el head protegido
        Nodo actual = this.head; 

        if (actual == null) {
            System.out.println("El historial está vacío.");
            return;
        }

        System.out.println("--- HISTORIAL DE MOVIMIENTOS ---");
        int contador = 1;

        while (actual != null) {
            // 3. Extraemos el dato usando los métodos que ya conocemos
            Movimiento mov = (Movimiento) actual.getData();
            System.out.println(contador + ". " + mov);

            // 4. Saltamos al siguiente nodo
            actual = actual.getNext();
            contador++;
        }
    }
}
