package ExpireDateApplication.Model;

public class Product {

    private String name;
    private String expireDate;

    public Product (String name, String expireDate){
        this.name = name;
        this.expireDate = expireDate;
    }

    public String getName(){
        return name;
    }

    public String getExpireDate(){
        return expireDate;
    }

}
