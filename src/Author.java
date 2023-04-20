import java.util.List;
import java.util.Scanner;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    // Create 6 args custom constructor here
    public Author(String firstName, String lastName, String country, boolean isAlive,
                  int age, List<Book> listOfBooks){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.listOfBooks = listOfBooks;
    }

//    public Author(){
//        Scanner input = new Scanner(System.in);
//        System.out.println();
//    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    String firstName;
    String lastName;
    String country;
    boolean isAlive;
    int age;
    List<Book> listOfBooks;


    /*
    Override toString() method here that returns Author object information
     */

    @Override
    public String toString() {
        String output = "\nAuthor's information = ";
        if (age == 0) {
            output += "Author{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", country='" + country + '\'' +
                    ", isAlive=" + isAlive +
                    '}';
        } else {
            output += "Author{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", country='" + country + '\'' +
                    ", isAlive=" + isAlive +
                    ", age=" + age +
                    '}';
        }
        output += "\nAuthor's books are as listed below:";

        for (Book book : listOfBooks) {
            output += book;
        }

        return output;
    }
}