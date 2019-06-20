package Bank.Model;

import java.math.BigDecimal;

public interface BankTransaction {

    void payIntoAccount(BigDecimal howMuch);

    void withdrawFromAccount (BigDecimal howMuch);

    void transferIntoBasicBankAccount(BasicAccount basicAccount, BigDecimal howMuch);

    void transferIntoPremiumkAccount(PremiumAccount premiumAccount, BigDecimal howMuch);

}
