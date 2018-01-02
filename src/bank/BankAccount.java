/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author 348676487
 */
public class BankAccount implements Account {

    private String name;
    private double balance;

    public BankAccount(String newName) {
        name = newName;
        balance = 0;
    }

    public BankAccount(String newName, double balance) {
        this.name = newName;
        this.balance = balance;
    }

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
