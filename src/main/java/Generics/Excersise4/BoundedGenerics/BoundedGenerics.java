package Generics.Excersise4.BoundedGenerics;

public class BoundedGenerics<T extends Number> {

    private T number;

    public BoundedGenerics(T obj) {
        this.number = obj;
    }

    public T getNumber() {
        return number;
    }

    public double reciprocal(){
        return 1 / number.doubleValue();
    }

    public double fraction(){
        return number.doubleValue() - number.intValue();
    }

}
