import com.murcia.utils.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Partida partida = new Partida();
        partida.iniciarPartida();

        boolean salir = false;
        
        String[] opciones = {
            "1. Mover pieza",
            "2. Mostrar tablero",
            "3. Cambiar turno",
            "4. Salir",
            "5. Mostrar historial"
        };
        
        Menu menu = new Menu(opciones, 'H', "\n", " ---Menu---");

        while (!salir) {
            System.out.println(menu.toString());
            
            int opcion = Input.nextInt("Elige una opcion: ");
 
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
