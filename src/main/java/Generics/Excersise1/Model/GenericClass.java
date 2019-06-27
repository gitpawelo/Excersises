package Generics.Excersise1.Model;

public class GenericClass<T> {

    private T name;


    public void getGenericClassName(T name){
        System.out.println(name.getClass().getSimpleName());
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
