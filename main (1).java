import java.util.Scanner;
import java.util.ArrayList;
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the marketplace!");
        System.out.println("1. add a service");
        System.out.println("2. Book a service");

        System.out.println("type your choice: (1 or 2)");
        int choice = input.nextInt();
        input.nextLine(); 
        
         if (choice == 1) {
            System.out.print("you choice to add a service! now enter service name: ");
             String servicename = input.nextLine();
              System.out.println("your services name is " + "\"" + servicename + "\"");
         } else if (choice == 2) {
            ArrayList<String> categories = new ArrayList<>();
            categories.add("Plumbing");
            categories.add("Tutoring");
            categories.add("Cleaning");
                  System.out.println("you chose to book a service!Available service categories:");
                             while (true) {
                            System.out.println("Available service categories:");
                             for (int i = 0; i < categories.size(); i++) {
                           System.out.println((i + 1) + ". " + categories.get(i));
                        }
                     
                    while (true) {
    System.out.print("Enter the number of the category you want to view: ");
    int categoryChoice = input.nextInt();  // Declare and assign here
    input.nextLine(); 

    if (categoryChoice == 1) {
        System.out.println("Plumbing:");
        System.out.println("1. fix leak");
        System.out.println("2. unclog toilet");
        break;  // valid input; exit inner loop
    } else if (categoryChoice == 2) {
        System.out.println("Tutoring:");
        System.out.println("1. math help");
        System.out.println("2. english help");
        break;
    } else if (categoryChoice == 3) {
        System.out.println("Cleaning:");
        System.out.println("1. room cleaning");
        System.out.println("2. full deep clean");
        break;
    } else {
        System.out.println("invalid.. pick a number from 1-3 please! ");
    }
}
}
}
}
}