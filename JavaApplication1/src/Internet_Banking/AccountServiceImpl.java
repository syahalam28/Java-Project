/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internet_Banking;

import java.math.BigDecimal;

/**
 *
 * @author Digital
 */
public class AccountServiceImpl implements AccountService {
//    Method 

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;

    }
    private AccountRepository accountRepository;

    public AccountRepository getAccountRepository() {

        return accountRepository;

    }

    @Override
    public void transferMoney(Long id, Long destinationId, BigDecimal Balance) {
        Account sourceAccount = accountRepository.find(id);
        Account destinationAccount = accountRepository.find(destinationId);

//        Transfer Logic Simple
//        Subtract (-) add (+)
        sourceAccount.setBalance(sourceAccount.getBalance().subtract(Balance));
        destinationAccount.setBalance(destinationAccount.getBalance().add(Balance));

        accountRepository.update(sourceAccount);
        accountRepository.update(destinationAccount);

    }

    @Override
    public Account getAccount(Long id) {
        return accountRepository.find(id);
    }

}
