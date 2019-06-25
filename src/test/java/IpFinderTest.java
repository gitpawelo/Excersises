package IpFinder;

import IpFinder.Model.IpFinder;
import org.junit.Test;

import static org.junit.Assert.*;

public class IpFinderTest {

    @Test
    public void shouldShowTrueForValidIpInWholeSentence(){
        //given
        IpFinder ipFinder = new IpFinder();
        //when
        ipFinder.hasIp("Serwer gry dostępny jest pod adresem 10.234.20.90 - miłej zabawy!");
        //then
        assertTrue(ipFinder.hasIp("Serwer gry dostępny jest pod adresem 10.234.20.90 - miłej zabawy!") == true);
    }

    @Test
    public void shouldShowFalseBecauseIpIsNotValid(){
        //given
        IpFinder ipFinder = new IpFinder();
        //when
        ipFinder.hasIp("Adres domeny mojafirma.com to 23.340.45.900");
        //then
        assertTrue(ipFinder.hasIp("Adres domeny mojafirma.com to 23.340.45.900") == false);
    }

    @Test
    public void shouldShowFalseBecauseIpIsNotValid2(){
        //given
        IpFinder ipFinder = new IpFinder();
        //when
        ipFinder.hasIp("Współrzędne to 90.3454 stopnie na północ");
        //then
        assertFalse(ipFinder.hasIp("Współrzędne to 90.3454 stopnie na północ") == true);
    }

    @Test
    public void shouldShowFalseBecauseNoIpInSentence(){
        //given
        IpFinder ipFinder = new IpFinder();
        //when
        ipFinder.hasIp("Tu nie ma nawet żadnych cyfr!");
        //then
        assertFalse(ipFinder.hasIp("Tu nie ma nawet żadnych cyfr!") == true);
    }

    @Test
    public void shouldShowTrueBecauseIpIsValid1(){
        //given
        IpFinder ipFinder = new IpFinder();
        //when
        ipFinder.hasIp("192.168.78.23");
        //then
        assertTrue(ipFinder.hasIp("192.168.78.23") == true);
    }

    @Test
    public void shouldShowTrueBecauseIpIsValid2(){
        //given
        IpFinder ipFinder = new IpFinder();
        //when
        ipFinder.hasIp("10.155.10.12");
        //then
        assertTrue(ipFinder.hasIp("10.155.10.12") == true);
    }

    @Test
    public void shouldShowTrueBecauseIpIsValid3(){
        //given
        IpFinder ipFinder = new IpFinder();
        //when
        ipFinder.hasIp("2.2.1.1");
        //then
        assertTrue(ipFinder.hasIp("2.2.1.1") == true);
    }

    @Test
    public void shouldShowTrueBecauseIpIsNowValid(){
        //given
        IpFinder ipFinder = new IpFinder();
        //when
        ipFinder.hasIp("357.2.1.1");
        //then
        assertTrue(ipFinder.hasIp("357.2.1.1") == true);
    }
}
