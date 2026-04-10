import com.murcia.utils.Input;
import java.util.*;

public class Main {
    public static void main(String[] args) {
     
        Partida partida = new Partida();
        partida.iniciarPartida();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mover pieza");
            System.out.println("2. Mostrar tablero");
            System.out.println("3. Cambiar turno");
            System.out.println("4. Salir");
            System.out.println("5. Mostrar historial");
            int opcion = Input.nextInt("Elige una opción: ");

            switch (opcion) {
                case 1:
                    int filaOrig = Input.nextInt("Fila origen: ");
                    int colOrig = Input.nextInt("Columna origen: ");
                    int filaDest = Input.nextInt("Fila destino: ");
                    int colDest = Input.nextInt("Columna destino: ");

                    partida.getTablero().moverPieza(filaOrig, colOrig, filaDest, colDest);
                    
                    Pieza pieza = partida.getTablero().getPieza(filaDest, colDest);
                   partida.registrarMovimiento(pieza, filaOrig, colOrig, filaDest, colDest);
                
                 partida.getTablero().mostrarTablero();
                 partida.cambiarTurno();
                 break;
                case 2:
                    partida.getTablero().mostrarTablero();
                    break;

                case 3:
                    partida.cambiarTurno();
                    System.out.println("Turno cambiado.");
                    break;

                case 4:
                    salir = true;
                    System.out.println("Saliendo del juego...");
                    break;
                    
                case 5 :
                partida.getHistorial().mostrarHistorial();
                break;


                default:
                    System.out.println("Opción inválida.");
            }
        }
    
    }
}
