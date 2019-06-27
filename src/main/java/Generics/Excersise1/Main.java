package Generics.Excersise1;

/*
Utwórz klasę generyczną NazwaKlasy<T> z metodą public void wypiszNazwęKlasy(T obiekt). Nazwę klasy możesz pobrać za
pomocą metody obiekt.getClass().getSimpleName().
 */

import Generics.Excersise1.Model.GenericClass;

public class Main {

    public static void main(String[] args) {

        GenericClass<String> genericClass = new GenericClass<String>();

        genericClass.getGenericClassName("Hello");

    }

}
