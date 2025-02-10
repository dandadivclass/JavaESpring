package Arrays;

import java.util.Scanner;

public class ArrayAoContrario {

    int[] array = new int[5];

    public void inputUsuario(){

        System.out.println("Forneça 5 números inteiros para compor o Array.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posição " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

    }

    public void imprimindoAoContrario(){
        System.out.println("Imprimindo o array em ordem contrária: ");
        for (int i = array.length - 1; i >= 0; i--) {
            //aqui, ele pega o tamanho do array e a cada iteração, subtrai 1 do tamanho e imprime o seu valor do índice correspondente
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        ArrayAoContrario arraysExercicio4 = new ArrayAoContrario();

        arraysExercicio4.inputUsuario();
        arraysExercicio4.imprimindoAoContrario();
    }
}
