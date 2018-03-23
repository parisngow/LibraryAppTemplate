import java.util.Scanner;

public class LibraryApp {
    private static Library library = new Library();
    private static Address address = new Address();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (;;) {
            System.out.println("What would you like to do? \n 1. List members \n 2. List books \n 3. Display library mailing address");
            String response = input.next();

            if (response.equals("1")) {
                System.out.println("Member List: ");
                for (int i = 0; i < library.members.length; i ++) {
                    System.out.println(i+1 + ". " + library.members[i]);
                }

            } else if (response.equals("2")) {
                System.out.println("Book List: ");
                for (int i = 0; i < library.books.length; i ++) {
                    System.out.println(i+1 + ". " + library.books[i]);
                }

            } else if (response.equals("3")) {
                System.out.println("The library mailing address is " + address);
                
            } else {
                System.out.println("Sorry, this option doesn't exist");
                
            }

        }
    }
}
