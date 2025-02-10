package Arrays;
import java.util.*;

public class Arrays2 {

    public static void main(String[] args) {
        int[] litros = new int[5];

        litros[0] = 20;
        litros[1] = 153;
        litros[2] = 44;
        litros[3] = 103;
        litros[4] = 50;

        //Ordena o array em ordem crescente
        Arrays.sort(litros);
        System.out.println(Arrays.toString(litros));

        //Preenche o array com um valor específico
        Arrays.fill(litros, 0);
        System.out.println(Arrays.toString(litros)); // Saída: [0, 0, 0, 0]

        //Copia o array total ou parcialmente
        int[] copy = Arrays.copyOf(litros, litros.length); // Cópia completa
        int[] range = Arrays.copyOfRange(litros, 1, 3); // Cópia do índice 1 ao 2

        System.out.println("Cópia completa: ");
        System.out.println(Arrays.toString(copy));

        System.out.println("Cópia do índice 1 ao 2: ");
        System.out.println(Arrays.toString(range));

        //Busca um elemento em um array *ordenado*
        int[] arr = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(arr, 3); // Retorna 2 (índice do valor 3)
        int index2 = Arrays.binarySearch(arr, 4);
        System.out.println(index);
        System.out.println(index2);

        //Compara o conteúdo de dois arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2)); // Saída: true

        int[] array1 = {5, 6, 7};
        int[] array2 = {88, 4, 1};
        System.out.println(Arrays.equals(array1, array2));


        //preencha os elementos de um array

        Scanner scanner = new Scanner(System.in);

        // Solicitar o tamanho do array
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        // Criar o array com o tamanho especificado
        int[] numeros = new int[tamanho];

        // Preencher o array com entradas do usuário
        System.out.println("Preencha o array com números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibir os números inseridos
        System.out.println("Os números inseridos foram:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();

        //método do Stream que pula o índice selecionado e também, os índices antecessores
        int [] array = { 0, 1, 15, 3, 4, 5, 6, 7 ,8 };
        Arrays.stream(array).skip(2).forEach(System.out::println);

    }

}
