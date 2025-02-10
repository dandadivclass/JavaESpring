package Arrays;

import java.util.Scanner;

public class ArrayMediaElementos extends ArraySomaElementos {

    public ArrayMediaElementos(int[] arrayNumeros) {
        super(arrayNumeros);
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Vamos ao jogo da média!\n-------------------\nIremos escolher 5 números inteiros e diferentes um do outro para começarmos a brincadeira\nO papel de vocês é adivinhar quanto vai ser o valor da média final! Preparados? Vocês só tem 1 chance\n\n-------------------");
    }

    public int mediaDeElementos() {
        //pegando o total de elementos no array
        int length = arrayNumeros.length;
        int soma = 0;

        for(int numero : arrayNumeros) {
            soma += numero;
        }
        //dividindo o total de elementos pela soma dos elementos, trazendo assim a média de valor
        int media = soma / length;

        return media;
    }

    @Override
    public void vamosConferir() {
        System.out.println("E aí, acertaram? Vamos conferir! ");

        //pedindo pro usuário digitar o número que ele achou somando
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me diz aí, qual é a média dos números acima? Digite abaixo");
        int numeroJogado = scanner.nextInt();
        scanner.close();

        int resultado = mediaDeElementos();
        if (numeroJogado == resultado){
            System.out.println("Parabéns! Você é rápido de conta, me ensina?");
        }else {
            System.out.println("Hummm... tenta contar de novo. Que tal usar os dedos?");
        }
    }

    public void resultado() {
        System.out.println("O resultado é: " + mediaDeElementos());
    }

    @Override
    public void agradecimentos() {
        super.agradecimentos();
    }

    public static void main(String[] args) {
        int[] arrayNumeros2 = {23, 45, 89, 50, 12};

        ArrayMediaElementos arraysExercicio1Heranca = new ArrayMediaElementos(arrayNumeros2);

        arraysExercicio1Heranca.iniciarJogo();

        System.out.println("Os números escolhidos foram: ");
        for(int numero : arrayNumeros2) {
            System.out.println(numero);
        }

        arraysExercicio1Heranca.mediaDeElementos();
        arraysExercicio1Heranca.vamosConferir();
        arraysExercicio1Heranca.resultado();

        arraysExercicio1Heranca.agradecimentos();

    }

}
