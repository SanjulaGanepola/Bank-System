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
public class TrustAccount extends BankAccount {

   
    public TrustAccount(String newName){
        super(newName);
    }

    public TrustAccount(String newName, double balance) {
        super(newName, balance);
    }
}