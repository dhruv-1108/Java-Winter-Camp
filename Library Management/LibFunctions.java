import java.util.*;
public class LibFunctions extends LibraryFunctions {

    public LibFunctions()
    {
        // to invoke the parent constructor of Library Functions !
        super();
    }

    public void viewBooks(){
       System.out.println("Available books are:");
       System.out.println("The legend of Tarzan");
       System.out.println("Romeo and Juliet");
       System.out.println("DSA and Java");
       System.out.println("Do Epic Shit");
       System.out.println(super.book1);
       System.out.println(" ");
    }

    // Compile time Polymorphism
    public void returnBook(){
       System.out.println("Name the book you want to return:");
       Scanner sc= new Scanner(System.in);
       String s= sc.nextLine();
       System.out.println(s + " returned!");
       System.out.println(" ");
    }

    public void returnBook(String name)
    {
        System.out.println(name + " returned!");
    }

    public void issueBook(){
        System.out.println("Enter the book name you want to issue");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s + " issued!");
        System.out.println("Thank you for coming to Jamnadas Library!");
        System.out.println(" ");
    };
}
