package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOcorrenciaNumeros {
    int[] array = {1, 1 , 1, 5, 8, 10, 15, 15, 16, 78};

//    public void lendoElementos(){
//        System.out.println("Números no Array: ");
//        System.out.println(Arrays.toString(array));
//    }

    public String ocorrenciaNumeros(int numero1) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Forneça 1 número inteiro, vamos calcular quantas vezes ele aparece no Array! ");
//        int numeroSelecionado = scanner.nextInt();
//        scanner.close();

        int contagem = 0;
        for (int numeros : array){
            if (numeros == numero1) {
                contagem++;
            }
        }

        int[] arrayNumero = new int[contagem];
        int index = 0;
        for (int numero : array){
            if (numero == numero1){
                arrayNumero[index] = numero;
                index++;
            }
        }

        System.out.println("Array do número que você escolheu: " + Arrays.toString(arrayNumero));

        //ao utilizar o String.format, o retorno é visível na integração com o front end, já que o sout imprime apenas no terminal
        return String.format(
                "O número %d aparece %d vezes no Array! Array do número selecionado: %s",
                numero1, contagem, Arrays.toString(arrayNumero)
        );
    }

    public static void main(String[] args) {

        ArrayOcorrenciaNumeros arrayExercicio6 = new ArrayOcorrenciaNumeros();
        String resultado = arrayExercicio6.ocorrenciaNumeros(1);
        System.out.println(resultado);
    }
}
