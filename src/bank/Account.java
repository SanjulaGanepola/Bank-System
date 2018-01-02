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
public interface Account {
    
    public void setName(String newName);
    
    public String getName();
            
    public void deposit(double amount);

    public void withdrawal(double amount);

    public double getBalance();

}
