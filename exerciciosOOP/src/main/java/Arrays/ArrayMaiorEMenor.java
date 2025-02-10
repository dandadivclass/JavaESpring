package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayMaiorEMenor {
    private int[] colecaoNumeros = new int[15];


    public void pedindoOsNumeros() {
        System.out.println("Olá! Esse é o SmallestAndBiggest, para começar o jogo, escreva abaixo 15 números inteiros! Se quiser, pode repetir os valores, mas para deixar a brincadeira legal, escreva pelo menos um diferente.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < colecaoNumeros.length; i ++) {
            System.out.print("Forneça o número da posição " + (i + 1) + " da lista: ");
            colecaoNumeros[i] = scanner.nextInt();
        }
    }

    public void imprimindoNumeros() {
        System.out.println("Os números inseridos foram:");
//        for (int numeros : colecaoNumeros) {
//            System.out.println(Arrays.toString(colecaoNumeros));
//        }
        System.out.println(Arrays.toString(colecaoNumeros));
    }

    public void maiorEMenor(){

        int min = Arrays.stream(colecaoNumeros).min().getAsInt();
        int max = Arrays.stream(colecaoNumeros).max().getAsInt();

        System.out.println("O maior número na lista é: " + max);
        System.out.println("O menor número na lista é: " + min);
    }

//    public void maiorEMenorDois() {
//
//        int max = colecaoNumeros[0];
//        int min = colecaoNumeros[0];
//
//        for (int num : colecaoNumeros) {
//            max = Math.max(max, num);
//            min = Math.min(min, num);
//        }
//
//        System.out.println("Maior número: " + max);
//        System.out.println("Menor número: " + min);
//    }

    public static void main(String[] args) {
        ArrayMaiorEMenor arraysExercicio2 = new ArrayMaiorEMenor();

        arraysExercicio2.pedindoOsNumeros();
        arraysExercicio2.maiorEMenor();
//        arraysExercicio2.maiorEMenorDois();
        System.out.println("---------------");
        arraysExercicio2.imprimindoNumeros();
    }
}
