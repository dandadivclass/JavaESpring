package testesAulas;

import testesAulas.entities.enums.OrderStatus;

import java.util.Date;

public class MainTwo {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Leo", "Bob"};

        for (int i = 0; i<vect.length; i++) {
            System.out.println(vect[i]);
        }

        // para cada objeto "obj" contido em vect, faça:
        // o laço For Each simplifica o percurso entre as coleções

        for (String obj : vect) {
            System.out.println(obj);
        }

        /* ******************************************************** */

        String[] nomes = {"Ana", "Pedro", "Maria"};

        // Imprimindo todos os nomes (forEach)
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Imprimindo os nomes em ordem inversa (for tradicional)
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        /* ******************************************************** */

        int[] numeros = {1, 2, 3, 4, 5};

        // Dobrando cada valor do array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2; // Multiplica cada elemento por 2
        }

        // Imprimindo o array modificado
        for (int numero : numeros) {
            System.out.println(numero);
        }

        /* ******************************************************** */

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        // convertendo String para ENUM
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);



    }
}
