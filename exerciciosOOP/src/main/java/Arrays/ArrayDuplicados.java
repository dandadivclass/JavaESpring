package Arrays;

import java.util.Scanner;

public class ArrayDuplicados {
    int[] array = new int[10];

    public void inputUsuario(){
        System.out.println("Forneça 10 números para compor um array:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            System.out.println("Número da posição " + (i + 1 ) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public void calculandoDuplicados() {
        int contagem = 0;

        for (int i = 0; i < array.length; i++) {
            // verificando se o elemento já foi contado como duplicado
            boolean duplicado = false;

            // comparando o elemento atual com os elementos anteriores
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (duplicado) {
                contagem++;
            }
        }

        System.out.println("Duplicados: " + contagem);
    }


    public static void main(String[] args) {
        ArrayDuplicados arrayExercicio7 = new ArrayDuplicados();
        arrayExercicio7.inputUsuario();
        arrayExercicio7.calculandoDuplicados();
    }
}
