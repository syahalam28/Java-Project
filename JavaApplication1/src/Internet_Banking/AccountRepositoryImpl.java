/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internet_Banking;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Digital
 */
public class AccountRepositoryImpl implements AccountRepository {

// HashMap : Static Data
    private Map<Long, Account> accountMap = new HashMap<Long, Account>();

    {
//    Instance Of Class 
//    Object

        Account account1 = new Account();
        Account account2 = new Account();

        account1.setId(1L);
        account1.setName("Izaaz Azaam Syahalam");
        account1.setAccountNumber("5180411386");
        account1.setBalance(new BigDecimal(11000000));

        account2.setId(2L);
        account2.setName("Catrinadia Christie");
        account2.setAccountNumber("5180411386");
        account2.setBalance(new BigDecimal(5000000));

//        Insert Data To HashMap Using Function accountMap put
        accountMap.put(account1.getId(), account1);
        accountMap.put(account2.getId(), account2);

    }

    @Override
    public void update(Account account) {
//        accountMap Insert/Update data to Account Class by Id  
        accountMap.put(account.getId(), account);
    }

    @Override
    public Account find(Long id) {

        return accountMap.get(id);

    }

}
