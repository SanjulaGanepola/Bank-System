/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author 348676487
 */
public class BankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);

        System.out.println("Enter an initial value for the bank:");
        double initial = s.nextDouble();
        s.nextLine();

        BankAccount bank = new BankAccount("Bank", initial);

        System.out.println("Enter a bank name:");
        bank.setName(s.nextLine());

        System.out.println(bank.getName() + " bank was opened with $" + bank.getBalance());

        System.out.println("Enter an amount to deposit in the bank:");
        bank.deposit(s.nextDouble());

        System.out.println("Enter an amount to withdraw from the bank:");
        bank.withdrawal(s.nextDouble());

        System.out.println("The bank balance is: $" + bank.getBalance());

        System.out.println("Enter an initial value for the trust account:");
        double trustinitial = s.nextDouble();
        s.nextLine();

        TrustAccount trust = new TrustAccount("", trustinitial);

        System.out.println("Enter a trust account name:");
        trust.setName(s.nextLine());

        System.out.println(trust.getName() + " trust account was opened with $" + trust.getBalance());

        System.out.println("Enter an amount to deposit in the bank:");
        trust.deposit(s.nextDouble());

        System.out.println("Enter an amount to withdraw from the bank:");
        trust.withdrawal(s.nextDouble());

        System.out.println("The trust account balance is: $" + trust.getBalance());

    }
}
