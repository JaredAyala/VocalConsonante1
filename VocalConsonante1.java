import java.util.Scanner;

public class VocalConsonante1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        while (true) {
            System.out.print("Ingresa una letra (o 'q' para salir): ");
            letra = scanner.next().toLowerCase().charAt(0);

            if (letra == 'q') {
                System.out.println("Programa terminado.");
                break;
            }

            if (Character.isLetter(letra)) {
                if (esVocal(letra)) {
                    System.out.println(letra + " es una vocal.");
                } else {
                    System.out.println(letra + " es una consonante.");
                }
            } else {
                System.out.println("Por favor, ingresa una letra válida.");
            }
        }
    }

    public static boolean esVocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}

