import java.util.Scanner;
public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        // Clase scanner que permite leer por consola
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: Iterativa (bucle)
        for (int i=0; i<letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: Iterativa (bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Ingresa una letra, por favor");

            // Usamos la clase scanner para leer una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control: Iterativa (bucle)
            for (int i=0; i<palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta! " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
                System.out.println("¡Qué pena te has quedado sin intentos! GAME OVER");
        }

        scanner.close();
    }
}
