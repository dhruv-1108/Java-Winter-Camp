import java.util.*;

public class LibraryFunctions {
    // Use of super keyword !
    String book1 = "Atomic Habits";

    public LibraryFunctions(){
        System.out.println("These are the available options");
    }

    public void viewBooks(){};
    public void returnBook(){};

    public void returnBook(String name){};

    // this will be overridden in sub class !
    public void issueBook(){
        System.out.println("Enter the book name you want to issue");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s + " issued!");
    };
}
