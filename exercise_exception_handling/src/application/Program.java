package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        Double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(balance, holder, number, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        Double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", account.getBalance());

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}