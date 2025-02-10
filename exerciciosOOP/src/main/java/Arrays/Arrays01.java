package Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        //declarando o array e o seu tamanho
        int[] idades = new int[3];

        //inserindo objetos do tipo int em cada índice do array
        idades[0] = 21;
        idades[1] = 30;
        idades[2] = 45;

        for (int i = 0; i < idades.length; i++) {
            //laço for, para cada idade no array idades, imprima no console o seus valores
            System.out.println(idades[i]);
        }

        for (int idade : idades){
            //foreach, para cada idade no array idades, imprima no console o seus valores
            System.out.println(idade);
        }

        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;


        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Número: " + numbers[i]);
        }

        for(int number : numbers) {
            System.out.println("Número: " + number);
        }

        //acessando os valores do array
        System.out.println("Escolha entre: " + numbers[3] + " e " + numbers[6]);

        //alterando um valor
        numbers[0] = 0;
        System.out.println("Agora a lista começa com o número: " + numbers[0]);

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Número: " + numbers[i]);
        }

        System.out.println(numbers.length);

        //Cria uma cópia superficial do array
        int[] cloneNumbers = numbers.clone();
        for (int clone : cloneNumbers) {
            System.out.println(clone);
        }
        System.out.println(cloneNumbers[5]);

        //comparando se os arrays são o mesmo objeto
        System.out.println("A cópia é o mesmo objeto: " + (cloneNumbers == numbers));


        //Obtém a classe do array   Saída: [I (significa array de int)
        System.out.println(numbers.getClass().getName());
        System.out.println(numbers.getClass());

    }
}


