/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Internet_Banking;

import java.math.BigDecimal;

/**
 *
 * @author Digital
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccountRepository accountRepository = new AccountRepositoryImpl();
        AccountServiceImpl accountService = new AccountServiceImpl();
        accountService.setAccountRepository(accountRepository);

        System.out.println("Before Money Transfer");
        System.out.println("Account Name : " + accountService.getAccount(1L).getName());
        System.out.println("Account 1 Balance Rp, " + accountService.getAccount(1L).getBalance());
        System.out.println("Account 2 Balance Rp, " + accountService.getAccount(2L).getBalance());

        accountService.transferMoney(1L, 2L, new BigDecimal(4000));
        System.out.println("After Money Transfer");
        System.out.println("Account Name : " + accountService.getAccount(1L).getName());
        System.out.println("Account 1 Balance Rp, " + accountService.getAccount(1L).getBalance());
        System.out.println("Account 2 Balance Rp, " + accountService.getAccount(2L).getBalance());

    }

}
