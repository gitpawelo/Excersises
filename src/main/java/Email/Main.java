package Email;

import Email.Exception.BadEmailException;
import Email.Model.User;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("nowy.email@wp.pl");
        User user2 = new User("nowy.emailwp.pl");

        try {
            user2.setEmail();
        } catch (BadEmailException e) {
            System.out.println(e.getMessage());
        }

    }

}
