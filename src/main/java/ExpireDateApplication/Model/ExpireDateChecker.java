package ExpireDateApplication.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExpireDateChecker {

    public void checkExpireDate(Product product){

        String dateOfProduct = product.getExpireDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate timeNow = LocalDate.now();
        LocalDate expireDateOfProduct = LocalDate.parse(dateOfProduct, formatter);

        if (expireDateOfProduct.isBefore(timeNow)){
            System.out.println("Produkt jest przeterminowany");
        }else {
            System.out.println("Product jest jeszcze zdatny do spożycia");
        }


    }

}
