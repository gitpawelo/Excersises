package Email.Model;

import Email.Exception.BadEmailException;

public class User {

    private String email;

    public User(String email){
        this.email = email;
    }



    public String getEmail(){
        return email;
    }

    public void setEmail() throws BadEmailException{

        if (!(getEmail().contains("@"))){
            throw new BadEmailException("Podany email nie przeszedł walidacji");
        }else {
            System.out.println("Podany email: " + getEmail() + " przeszedł walidację");
        }

    }

}
