package Arrays;

import java.util.Scanner;

public class ArraySomaElementos {

    protected int[] arrayNumeros;

    public ArraySomaElementos(int[] arrayNumeros) {
        this.arrayNumeros = arrayNumeros;
    }

    public int[] getArrayNumeros() {
        return arrayNumeros;
    }

    public void iniciarJogo() {
        System.out.println("Vamos ao jogo da soma!\n-------------------\nIremos escolher 4 números inteiros e diferentes um do outro para começarmos a brincadeira\nO papel de vocês é adivinhar quanto vai ser o valor final! Preparados? Vocês só tem 1 chance\n\n-------------------");
    }

    public int somaDeElementos() {
        int soma = 0;

        for(int numero : arrayNumeros) {
            soma += numero;
        }
        return soma;
    }

    public void vamosConferir() {
        System.out.println("E aí, acertaram? Vamos conferir! ");

        //pedindo pro usuário digitar o número que ele achou somando
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me diz aí, qual é a soma dos números acima? Digite abaixo");
        int numeroJogado = scanner.nextInt();
        scanner.close();


        int resultado = somaDeElementos();
        if (numeroJogado == resultado){
            System.out.println("Parabéns! Você é rápido de conta, me ensina?");
        }else {
            System.out.println("Hummm... tenta contar de novo. Que tal usar os dedos?");
        }
    }

    public void resultado() {
        System.out.println("O resultado é: " + somaDeElementos());
    }

    public void agradecimentos() {
        System.out.println("-------------------\nObrigada por jogar!");
    }

    public static void main(String[] args) {
        // inicializando o array para passá-lo como o parâmetro que o construtor pede
        int[] arrayNumeros = {30, 15, 40, 12};

        ArraySomaElementos exercicio1 = new ArraySomaElementos(arrayNumeros);

        exercicio1.iniciarJogo();

        System.out.println("Os números escolhidos foram: ");
        for(int numero : arrayNumeros) {
            System.out.println(numero);
        }

        exercicio1.somaDeElementos();
        exercicio1.vamosConferir();

        exercicio1.resultado();
        exercicio1.agradecimentos();
    }
}


