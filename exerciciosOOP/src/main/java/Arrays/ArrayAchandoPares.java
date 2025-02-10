package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayAchandoPares {
    int[] numeros = new int[10];

    public int[] getNumeros() {
        return numeros;
    }

    public void lendoNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Forneça 10 números para compor o array!");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número da posição " + (i + 1));
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Os números escolhidos foram: " + Arrays.toString(numeros));
    }

    public int[] achandoPares() {
        int pares = 0;

        // Contar a quantidade de números pares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            }
        }

        // Criar um array do **tamanho** exato para os pares
        int[] arrayPares = new int[pares];
        int index = 0;

        // **Preencher** o array com os números pares corretamente
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                arrayPares[index] = numero;
                index++;
            }
        }

        return arrayPares;
    }


    public void imprimindoPares() {
        int[] arrayPares = achandoPares();

        System.out.println("Os números pares são:");

        if (arrayPares.length == 0) {
            System.out.println("Nenhum número par encontrado.");
        } else {
            for (int numeroPar : arrayPares) {
                System.out.println(numeroPar);
            }
        }
    }


    public static void main(String[] args) {
        ArrayAchandoPares arrayExercicio3 = new ArrayAchandoPares();

        arrayExercicio3.getNumeros();

        arrayExercicio3.lendoNumeros();
        arrayExercicio3.achandoPares();
        arrayExercicio3.imprimindoPares();
    }
}
