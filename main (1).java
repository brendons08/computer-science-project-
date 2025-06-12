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
                     int number = 1;
                     for (String category : categories) {
                    System.out.println(number + ". " + category);
                     number++;
                     }
                     
                      System.out.print("Enter the number of the category you want to view: ");
            


              
         }  
         }
    }

  