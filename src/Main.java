import com.murcia.utils.Input;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Partida partida = new Partida();
        partida.iniciarPartida();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mover pieza");
            System.out.println("2. Mostrar tablero");
            System.out.println("3. Cambiar turno");
            System.out.println("4. Salir");
            
            int opcion = Input.nextInt("Elige una opción: ");

            switch (opcion) {
                case 1:
                    int filaOrig = Input.nextInt("Fila origen: ");
                    System.out.print("Columna origen: ");
                    int colOrig = sc.nextInt();
                    System.out.print("Fila destino: ");
                    int filaDest = sc.nextInt();
                    System.out.print("Columna destino: ");
                    int colDest = sc.nextInt();

                    partida.getTablero().moverPieza(filaOrig, colOrig, filaDest, colDest);
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
    System.out.println("5. Mostrar historial de movimientos");
    partida.getHistorial().mostrarHistorial();
    break;


                default:
                    System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
