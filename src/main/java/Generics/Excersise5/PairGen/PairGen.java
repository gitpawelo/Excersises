package Generics.Excersise5.PairGen;


public class PairGen<T, V extends T> {

    private T num1;
    private V num2;

    public PairGen(T obj1, V obj2){
        this.num1 = obj1;
        this.num2 = obj2;
    }

    public T getNum1(){
        return num1;
    }
    public V getNum2(){
        return num2;
    }

    public void showTypes(){
        System.out.println("Parametr T jest teraz: " + num1.getClass().getSimpleName());
        System.out.println("Parametr V jest teraz: " + num2.getClass().getSimpleName());
    }

}
