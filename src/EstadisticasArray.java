/**
 * Programa que:
 * - Obtiene el valor máximo de un array de enteros
 * - Comprueba si dicho máximo aparece más de una vez
 * - Calcula la media del array
 * - Indica si la media es mayor o igual a 5
 */
public class EstadisticasArray {

    /**
     * Método principal del programa
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {

        // Array de números a analizar
        int[] numeros = {5, 7, 3, 7, 2, 9, 7};

        // Contador de repeticiones del valor máximo
        int contadorMaximo = 0;

        // Variable usada como indicador (1 = repetido, 0 = no repetido)
        int indicadorRepetido = 0;

        // Se inicializa el máximo con el primer elemento del array
        int maximo = numeros[0];

        // Bucle para encontrar el valor máximo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        // Bucle para contar cuántas veces aparece el máximo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maximo) {
                contadorMaximo++;
            }
        }

        // Si aparece más de una vez, se activa el indicador
        if (contadorMaximo > 1) {
            indicadorRepetido = 1;
        }

        // Mostrar si el máximo está repetido
        if (indicadorRepetido == 1) {
            System.out.println("El máximo está repetido\n");
        } else {
            System.out.println("El máximo no está repetido\n");
        }

        // Cálculo de la suma total de los elementos
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Cálculo de la media
        double media = (double) suma / numeros.length;
        System.out.println("La media es: " + media);

        // Comprobación de si la media es mayor o igual a 5
        if (media >= 5) {
            System.out.println("\nMedia mayor a 5, bien");
        } else {
            System.out.println("\nMedia inferior a 5, mal");
        }
    }
}