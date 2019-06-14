package Classes;

public class Adult {

    int age;


    public Adult(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "age=" + age +
                '}';
    }
}
