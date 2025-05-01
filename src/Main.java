import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cocinero 1: ");
        String nombreCocinero1 = scanner.nextLine();
        System.out.print("Ingrese la experiencia del cocinero 1: ");
        String experienciaCocinero1 = scanner.nextLine();
        System.out.print("Ingrese la especialidad del cocinero 1: ");
        String especialidadCocinero1 = scanner.nextLine();
        Cocinero cocinero1 = new Cocinero(nombreCocinero1, experienciaCocinero1, especialidadCocinero1);

        System.out.print("Ingrese el nombre del cocinero 2: ");
        String nombreCocinero2 = scanner.nextLine();
        System.out.print("Ingrese la experiencia del cocinero 2: ");
        String experienciaCocinero2 = scanner.nextLine();
        System.out.print("Ingrese la especialidad del cocinero 2: ");
        String especialidadCocinero2 = scanner.nextLine();
        Cocinero cocinero2 = new Cocinero(nombreCocinero2, experienciaCocinero2, especialidadCocinero2);

        System.out.print("Ingrese el nombre del cocinero 3: ");
        String nombreCocinero3 = scanner.nextLine();
        System.out.print("Ingrese la experiencia del cocinero 3: ");
        String experienciaCocinero3 = scanner.nextLine();
        System.out.print("Ingrese la especialidad del cocinero 3: ");
        String especialidadCocinero3 = scanner.nextLine();
        Cocinero cocinero3 = new Cocinero(nombreCocinero3, experienciaCocinero3, especialidadCocinero3);

        // Mostrar Información
        cocinero1.mostrarInfo();
        cocinero2.mostrarInfo();
        cocinero3.mostrarInfo();

        scanner.close();
    }
}

