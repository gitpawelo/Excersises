package Bank;

import Bank.Model.AccountOwner;
import Bank.Model.BasicAccount;
import Bank.Model.PremiumAccount;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void shouldPayIntoAccount() {
        //given
        AccountOwner accountOwner = new AccountOwner("Jan", "Kowalski", 1234);
        BasicAccount bankAccount = new BasicAccount(new BigDecimal(10000), accountOwner);
        //when
        bankAccount.payIntoAccount(new BigDecimal(3000));
        //then
        assertTrue(bankAccount.getBalance().equals(new BigDecimal(13000)));
    }

    @Test
    public void shouldPayIntoPremiumAccount() {
        //given
        AccountOwner accountOwner = new AccountOwner("Jan", "Nowak", 1478);
        PremiumAccount premiumAccount = new PremiumAccount(new BigDecimal(10000), accountOwner);
        //when
        premiumAccount.payIntoAccount(new BigDecimal(12345));
        //then
        assertTrue(premiumAccount.getBalance().equals(new BigDecimal(22345)));

    }

    @Test
    public void shouldWithdrawalFromAccount() {
        //given
        AccountOwner accountOwner = new AccountOwner("Jan", "Nowak", 7894);
        BasicAccount basicAccount = new BasicAccount(new BigDecimal(10000), accountOwner);
        //when
        basicAccount.withdrawFromAccount(new BigDecimal(10000));
        //then
        assertTrue(basicAccount.getBalance().equals(new BigDecimal(0)));

    }

    @Test
    public void shouldNotWithdrawalFromAccount() {
        //given
        AccountOwner accountOwner = new AccountOwner("Jan", "Nowak", 7894);
        BasicAccount basicAccount = new BasicAccount(new BigDecimal(10000), accountOwner);
        //when
        basicAccount.withdrawFromAccount(new BigDecimal(10001));
        //then
        assertFalse(basicAccount.getBalance().equals(new BigDecimal(-1)));

    }

    @Test
    public void shouldTransferFromBasicAccToBasicAcc() {
        //given
        AccountOwner accountOwner = new AccountOwner("Jan", "Nowak", 7896);
        BasicAccount basicAccount = new BasicAccount(new BigDecimal(10000), accountOwner);
        BasicAccount basicAccount1 = new BasicAccount(new BigDecimal(10000), accountOwner);
        //when
        basicAccount.transferIntoBasicBankAccount(basicAccount1, new BigDecimal(10000));
        //then
        assertTrue(basicAccount.getBalance().equals(new BigDecimal(0)) && basicAccount1.getBalance().equals(new BigDecimal(20000)));

    }

    @Test
    public void shouldTransferFromBasicAccToPremiumAcc() {
        //given
        AccountOwner accountOwner = new AccountOwner("Jan", "Nowak", 7896);
        BasicAccount basicAccount = new BasicAccount(new BigDecimal(10000), accountOwner);
        PremiumAccount premiumAccount = new PremiumAccount(new BigDecimal(10000), accountOwner);
        //when
        basicAccount.transferIntoPremiumkAccount(premiumAccount, new BigDecimal(10000));
        //then
        assertTrue(basicAccount.getBalance().equals(new BigDecimal(0)) && premiumAccount.getBalance().equals(new BigDecimal(20000)));


    }

    @Test
    public void shouldTakeDebet() {
        //given
        AccountOwner accountOwner = new AccountOwner("Jan", "Nowak", 7896);
        PremiumAccount premiumAccount = new PremiumAccount(new BigDecimal(10000), accountOwner);
        //when
        premiumAccount.takeDebit(new BigDecimal(19000));
        //then
        assertTrue(premiumAccount.getBalance().equals(new BigDecimal(-9000)));

    }

    @Test
    public void shouldTakeNoMoreThanMaxDebet() {
        AccountOwner accountOwner = new AccountOwner("Jan", "Nowak", 7896);
        PremiumAccount premiumAccount = new PremiumAccount(new BigDecimal(10000), accountOwner);
        //when
        premiumAccount.takeDebit(new BigDecimal(21000));
        //then
        assertTrue(premiumAccount.getBalance().equals(new BigDecimal(10000)));
    }

}




