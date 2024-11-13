import java.util.Scanner;
//Hola ATTE: Juan C RL
public class VocalConsonante1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter;

        while (true) {
            System.out.print("Ingresa una letra (o 'q' para salir): ");
            letter = scanner.next().toLowerCase().charAt(0);

            if (letra == 'q') {
                System.out.println("Programa terminado.");
                break;
            }

            if (Character.isLetter(letra)) {
                if (esVocal(letra)) {
                    System.out.println(letter + " es una vocal.");
                } else {
                    System.out.println(letter + " es una consonante.");
                }
            } else {
                System.out.println("Por favor, ingresa una letra válida.");
            }
        }
    }

    public static boolean esVocal(char letra) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}

