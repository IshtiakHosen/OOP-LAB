import java.util.Scanner;

public class QN3 {
    public static void main(String[] args) {

        String[] books = {"Enchanted Tales", "Fairy Tales", "Tales of a Honest boy", "Tooth Fairy", "Junglebook"};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the book you want to search for: ");
        String bookToSearch = input.nextLine();
       
        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(bookToSearch)) {
                System.out.println("Book found at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Book not found .");
        }
        
    }
}
