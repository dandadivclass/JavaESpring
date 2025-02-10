package testesAulas;
import testesAulas.ComStatic;
import testesAulas.SemEstatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(ComStatic.nome);
        System.out.println(ComStatic.getNome());

        ComStatic.nome = "Teste";
        ComStatic.getNome();

        SemEstatic semEstatic = new SemEstatic();
        semEstatic.setNome("Dandis");
        System.out.println(semEstatic.nome);
        System.out.println(c);


        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit y/n");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }else {
            account = new Account(number, holder);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        /* ********************************* */
        int n = sc.nextInt();
        double[] vector = new double[n];

        for (int i = 0; i<vector.length; i++) {
            vector[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i<n; i++){
            sum += vector[i];
        }
        double average = sum / vector.length;

        System.out.printf("Average height: %.2f%n", average);
        /*  ********************************* */

        /*  ********************************* */

        int p = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double soma = 0;
        for (int i = 0; i<n; i++){
            soma =+ vect[i].getPrice();
        }

        double avg = soma / vect.length;

        System.out.printf("Average price: %.2f%n", avg);

        /*  ********************************* */

    }

    // método não estático não é lido pelo método estático, pois não sabe para qual objeto aponta
    public static double retornaNumero(){
        return 1.14;
    }

    static double c = retornaNumero();

}
