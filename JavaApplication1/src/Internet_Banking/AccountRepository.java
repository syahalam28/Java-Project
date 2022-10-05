/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Internet_Banking;

/**
 *
 * @author Digital
 */
public interface AccountRepository {
    public void update(Account account);
    public Account find(Long id);
    
    
}
