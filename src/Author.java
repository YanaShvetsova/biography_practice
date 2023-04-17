import java.util.ArrayList;
import java.util.List;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    public Author (String firstName, String lastName, String country, boolean isAlive){
        this.firstName=firstName;
        this.lastName= lastName;
        this.country = country;
        this.isAlive=isAlive;
        //this.age=age;
        //this.listOfBooks=listOfBooks; ???

    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    public String firstName,lastName,country;
    public int age;
    public boolean isAlive;
    public ArrayList<Book> listOfBooks;


    /*
    Override toString() method here that returns Author object information
     */

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
