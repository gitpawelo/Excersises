package Generics.Excersise2.GenClass;

public class GenClass<T> {

    private T object;

    public GenClass(T o){
        this.object = o;
    }

    public T getObject() {
        return object;
    }

    public void showType(){
        System.out.println("Typem T jest teraz: " + object.getClass().getSimpleName());
    }
}
