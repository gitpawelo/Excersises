package Generics.Excersise3.GenClass;

public class TwoGen<T,S> {

    private T inGen;
    private S strGen;

    public TwoGen(T object1, S object2){
        this.inGen = object1;
        this.strGen = object2;
    }

    public T getInGen(){
        return inGen;
    }

    public S getStrGen(){
        return strGen;
    }

    public void showTypes(){
        System.out.println("Typem generycznym T jest teraz: " + inGen.getClass().getSimpleName());
        System.out.println("Typem generycznym S jest teraz: " + strGen.getClass().getSimpleName());

    }


}
