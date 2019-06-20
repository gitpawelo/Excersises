package Bank;

import Bank.Model.AccountOwner;
import Bank.Model.BasicAccount;
import Bank.Model.PremiumAccount;

import java.math.BigDecimal;

public class Main {

    public static void main (String[] args){

        AccountOwner accountOwner1 = new AccountOwner("JAN", "KOWALSKI", 1234);
        PremiumAccount premiumAccount1 = new PremiumAccount(new BigDecimal(10000), accountOwner1);

        AccountOwner accountOwner2 = new AccountOwner("JAN", "KOWALSKI", 1234);
        PremiumAccount premiumAccount2 = new PremiumAccount(new BigDecimal(10000), accountOwner2);

        AccountOwner accountOwner3 = new AccountOwner("JAN", "KOWALSKI", 1234);
        BasicAccount basicAccount1 = new BasicAccount(new BigDecimal(10000), accountOwner3);

        System.out.println(premiumAccount1.getBalance());

        premiumAccount1.payIntoAccount(new BigDecimal(12345.22));
        premiumAccount1.withdrawFromAccount(new BigDecimal(1234567));

        premiumAccount1.transferIntoBasicBankAccount(basicAccount1,new BigDecimal(7000));
        premiumAccount1.transferIntoPremiumkAccount(premiumAccount1, new BigDecimal(30000));

    }



}
