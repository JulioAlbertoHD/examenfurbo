import java.util.Scanner;
public class Jugador {
    private int mejorJugador, dorsal;
    private String nombre, apellido;
    Scanner scanner = new Scanner(System.in);


    public Jugador(int mejorJugador, String nombre, String apellido) {
        this.mejorJugador = mejorJugador;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void altaJugadores(String nombre, String apellido, int dorsal){
        System.out.println("Introduce nombre del jugador: ");
        nombre = scanner.nextLine();
        System.out.println("Introduce apellido del jugador: ");
        apellido = scanner.nextLine();
        System.out.println("Introduce dorsal del jugador: ");

    }
}
