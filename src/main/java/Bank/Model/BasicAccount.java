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

    @Override
    public String toString() {
        return "BasicAccount{" +
                "balance=" + balance +
                ", accountOwner=" + accountOwner +
                '}';
    }
}
