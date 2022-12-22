import java.util.*;
public class LibraryManagement {
    // To use 'this' keyword !  
    String libName = "Jamnadas";
    public LibraryManagement()
    {
        System.out.println("Welcome to " + this.libName + " library");
        System.out.println(" ");
        System.out.println("****************************************");
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // To call the default constructor !
        LibraryManagement n = new LibraryManagement();

        LibraryFunctions lb= new LibFunctions();
        
        int choice = 0;
        do{
            System.out.println("1.View Books");
            System.out.println("2. Return Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Exit:");
            System.out.println(" ");
            System.out.print("Enter your choice: ");

            // Exception Handling !!
            try{
                choice= sc.nextInt();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

            switch (choice){
                case 1:
                    lb.viewBooks();
                    break;
                
                case 2:
                    lb.returnBook();
                    lb.returnBook("Champak");
                    break;
                case 3:
                    lb.issueBook();
            }
            

        }while(choice!=4);
    }
}
