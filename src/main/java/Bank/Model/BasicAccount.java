package Bank.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicAccount implements BankTransaction {

    private BigDecimal balance;
    private AccountOwner accountOwner;


    @Override
    public void payIntoAccount(BigDecimal howMuch) {
        System.out.println("Wpłacasz " + howMuch + "PLN na konto.");
        balance = getBalance().add(howMuch);
        System.out.printf("Na Twoim koncie jest teraz %s\n", balance);
    }

    @Override
    public void withdrawFromAccount(BigDecimal howMuch) {
        System.out.println("Chcesz wypłacić " + howMuch + "PLN z konta. Trwa sprawdzanie dostępnych środków...");
        if (getBalance().compareTo(howMuch)<0){
            System.out.println("Masz za mało pieniędzy na wypłatę " + howMuch + " PLN. Możesz wypłacić nie więcej niż " + getBalance() + " PLN.");
        }else{
            setBalance(getBalance().subtract(howMuch));
            System.out.println("Wyplaciles " + howMuch + " PLN z konta. Pozostało Ci " + getBalance() + " PLN.");
        }
    }

    @Override
    public void transferIntoBasicBankAccount(BasicAccount basicAccount, BigDecimal howMuch) {
        System.out.println("Chcesz wypłacić " + howMuch + "PLN z konta. Trwa sprawdzanie dostępnych środków...");
        if (getBalance().compareTo(howMuch)<0){
            System.out.println("Masz za mało pieniędzy na wypłatę " + howMuch + " PLN. Nie możesz przelać więcej niż " + getBalance() + " PLN.");
        }else{
            setBalance(getBalance().subtract(howMuch));
            basicAccount.setBalance(basicAccount.getBalance().add(howMuch));
            System.out.println("Przelałeś " + howMuch + " ze swojego konta. Na Twoim koncie pozostało " + getBalance() + "PLN.\n" +
                    "Na koncie na które przelałeś pieniądze jest " + basicAccount.getBalance() + "PLN.");
        }
    }

    @Override
    public void transferIntoPremiumkAccount(PremiumAccount premiumAccount, BigDecimal howMuch) {
        System.out.println("Chcesz wypłacić " + howMuch + "PLN z konta. Trwa sprawdzanie dostępnych środków...");
        if (getBalance().compareTo(howMuch)<0){
            System.out.println("Masz za mało pieniędzy na wypłatę " + howMuch + " PLN. Nie możesz przelać więcej niż " + getBalance() + " PLN.");
        }else{
            setBalance(getBalance().subtract(howMuch));
            premiumAccount.setBalance(premiumAccount.getBalance().add(howMuch));
            System.out.println("Przelałeś " + howMuch + " ze swojego konta. Na Twoim koncie pozostało " + getBalance() + "PLN.\n" +
                    "Na koncie na które przelałeś pieniądze jest " + premiumAccount.getBalance() + "PLN.");
        }
    }

}
