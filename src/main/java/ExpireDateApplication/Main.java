package ExpireDateApplication;
/*
Mamy dwa produkty. Data waznosci pierwszego to 12/07/2017, drugiego to 21/08/2017. Sprawdz czy ktorys z nich jest przeterminowany.
Uzyj metody isAfter. Potrzebne klasy :SprawdzacWaznosci (z metoda public void czy Nieprzeterminowany (Produkt  produkt)
i Produkt z polami String nazwa i String dataWaznosci
*/

import ExpireDateApplication.Model.ExpireDateChecker;
import ExpireDateApplication.Model.Product;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("jogobella", "12/12/2020");
        ExpireDateChecker expireDateChecker = new ExpireDateChecker();

        expireDateChecker.checkExpireDate(product1);



    }
}
