package Bank;

import Bank.Model.AccountOwner;
import Bank.Model.PremiumAccount;

import java.math.BigDecimal;

public class Main {

    public static void main (String[] args){

        AccountOwner accountOwner1 = new AccountOwner("JAN", "KOWALSKI", 1234);
        PremiumAccount premiumAccount1 = new PremiumAccount(new BigDecimal(10000), accountOwner1);

        AccountOwner accountOwner2 = new AccountOwner("JAN", "KOWALSKI", 1234);
        PremiumAccount premiumAccount2 = new PremiumAccount(new BigDecimal(10000), accountOwner1);

        System.out.println(premiumAccount1.getBalance());

        premiumAccount1.payIntoAccount(new BigDecimal(12345.22));
        premiumAccount1.withdrawFromAccount(new BigDecimal(1234567));
    }



}
