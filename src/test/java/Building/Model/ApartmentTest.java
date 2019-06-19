package Building.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApartmentTest {

    @Test
    public void shouldGiveResult300() {
        //given
        Apartment apartment = new Apartment(10.0, 10.0, 10.0, 2);
        //when
        apartment.area();
        //then
        assertTrue(apartment.area() == 300);
    }

    @Test
    public void shouldGiveResult100() {
        //given
        Apartment apartment = new Apartment(10, 10, 10, 0);
        //when
        apartment.area();
        //then
        assertTrue(apartment.area() == 100);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldGiveArithmeticExceptionOnWrongParametresOnBuilding() throws ArithmeticException {

        new Building(10, 50, 0, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldGiveArithmeticExceptionOnWrongParametresOnSkycrapper() throws ArithmeticException{

        new Skycrapper(200, 0, 100, 30);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldGiveArithmeticExceptionOnWrongParametresOnApartment() throws ArithmeticException{

        new Apartment(9,0,0,2);
    }


}


