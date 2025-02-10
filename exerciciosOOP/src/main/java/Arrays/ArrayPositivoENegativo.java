package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPositivoENegativo {
    int[] array = new int[20];

    public void inputUsuario(){
        System.out.println("Forneça 20 números inteiros para criar o array");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            System.out.println("Posição " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Números adicionados: ");
        System.out.println(Arrays.toString(array));
    }

    public void numerosPositivos(){
        int positivos = 0;

        for (int npositivos : array) {
            if (npositivos >= 0){
                positivos++;
            }
        }

        System.out.println("A quantidade de números positivos é: " + positivos);
    }

    public void numerosNegativos() {
        int negativos = 0;

        for (int nnegativos : array){
            if(nnegativos < 0){
                negativos++;
            }
        }

        System.out.println("A quantidade de números negativos é: " + negativos);
    }

    public void contandoNumeros(){
        int negativos = 0;
        int positivos = 0;

        for (int numero : array){
            if (numero >= 0){
                positivos++;
            }else {
                negativos++;
            }
        }

        System.out.println("A quantidade de números positivos é: " + positivos);
        System.out.println("A quantidade de números negativos é: " + negativos);

    }
    public static void main(String[] args) {
        ArrayPositivoENegativo arrayExercicio5 = new ArrayPositivoENegativo();

        arrayExercicio5.inputUsuario();
        //arrayExercicio5.numerosPositivos();
        //arrayExercicio5.numerosNegativos();
        arrayExercicio5.contandoNumeros();
    }
}
