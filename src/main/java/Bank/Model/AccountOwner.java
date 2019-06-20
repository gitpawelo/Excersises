package Bank.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AccountOwner {

    private String name, surname;
    private int age;
    private boolean premiumAccount;

}
