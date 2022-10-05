/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Internet_Banking;

import java.math.BigDecimal;

/**
 *
 * @author Digital
 */
public interface AccountService {
//    AccountService Class Is A Services
//    Make A Program's Logic Like Transfer and Get Account Number
    
//    Make A Prosedural Method For Transfer Money
    public void transferMoney(Long id, Long destinationId, BigDecimal Balance);
    
//    Make Function Method For Get Account From Account Class
//    So Thats way Using Account,Cause Account is A Class 
    public Account getAccount(Long id);
    
}
