package Bank.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PremiumAccount implements BankTransaction {

    private BigDecimal balance;
    private AccountOwner accountOwner;
    private BigDecimal debit;


    public void takeDebit(BigDecimal howMuch){

    }

    @Override
    public void payIntoAccount(BigDecimal howMuch) {
        System.out.println("Wpłacasz " + howMuch + "zł na konto.");
        balance = getBalance().add(howMuch);
        System.out.printf("Na Twoim koncie jest teraz %s", balance);
    }

    @Override
    public void withdrawFromAccount(BigDecimal howMuch) {

    }

    @Override
    public void transferIntoBasicBankAccount(BasicAccount basicAccount, BigDecimal howMuch) {

    }

    @Override
    public void transferIntoPremiumkAccount(PremiumAccount premiumAccount, BigDecimal howMuch) {

    }
}
