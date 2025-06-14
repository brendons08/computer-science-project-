// Brendon Stabel


import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the marketplace!\n");
        System.out.println("1. add a service");
        System.out.println("2. Book a service");

        System.out.println("\ntype your choice: (1 or 2)\n");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
           if (choice == 1) {
            System.out.print("\nYou chose to add a service! Now enter service name: ");
             String servicename = input.nextLine();

                System.out.print("\nNow enter the category name for your service: ");
             String categoryName = input.nextLine();

    System.out.println("\nService \"" + servicename + "\" has been added to the category \"" + categoryName + "\".");
}
        } else if (choice == 2) {
            ArrayList<String> categories = new ArrayList<>();
            categories.add("Plumbing");
            categories.add("Tutoring");
            categories.add("Cleaning");

            ArrayList<String> cart = new ArrayList<>(); 
            
            while (true) {
                
                System.out.println("\nAvailable service categories:");
                for (int i = 0; i < categories.size(); i++) {
                    System.out.println((i + 1) + ". " + categories.get(i));
                }
                System.out.println("0. Quit booking");

                
                System.out.println("\nEnter the number of the category you want to view : \n");
                int categoryChoice = input.nextInt();
                input.nextLine();

                
                if (categoryChoice == 0) {
                    System.out.println("\nBooking finished. Your cart contains:");
                    if (cart.isEmpty()) {
                        System.out.println("No services booked.");
                    } else {
                        for (String service : cart) {
                            System.out.println("- " + service);
                        }
                    }
                    System.out.println("Thank you for booking!");
                    break;
                }

                ArrayList<String> services = new ArrayList<>();
                if (categoryChoice == 1) {
                    System.out.println("\nPlumbing services:");
                    services.add("fix leak");
                    services.add("unclog toilet");
                } else if (categoryChoice == 2) {
                    System.out.println("\nTutoring services:");
                    services.add("math help");
                    services.add("english help");
                } else if (categoryChoice == 3) {
                    System.out.println("\nCleaning services:");
                    services.add("room cleaning");
                    services.add("full deep clean");
                } else {
                    System.out.println("\nInvalid choice.. pick a number from 1-3 please!");
                    continue; 
                }

                
                for (int i = 0; i < services.size(); i++) {
                    System.out.println((i + 1) + ". " + services.get(i));
                }

                
                System.out.print("\nSelect a service number to add to your cart: \n");
                int serviceChoice = input.nextInt();
                input.nextLine();

                
                if (serviceChoice < 1 || serviceChoice > services.size()) {
                    System.out.println("Invalid service number, try again.");
                    continue; 
                }

                
                String selectedService = services.get(serviceChoice - 1);
                if (cart.contains(selectedService)) {
                    System.out.println("\nService \"" + selectedService + "\" is already in your cart.");
                } else {
                    cart.add(selectedService);
                    System.out.println("Added \"" + selectedService + "\" to your cart.");
                }

                
                System.out.println("\nYour cart contains:");
                for (String service : cart) {
                    System.out.println("- " + service);
                
                     System.out.println("1. Choose another service");
                     System.out.println("2. Remove a service from cart");
                    System.out.println("0. End booking session");
                    System.out.print("Enter your choice: ");
                 int actionChoice = input.nextInt();
                    input.nextLine();

                    if (actionChoice == 1) {
                    continue; // go back to categories
                 } else if (actionChoice == 2) {
                      if (cart.isEmpty()) {
                        System.out.println("Your cart is empty, nothing to remove.");
                      continue;
              }

                    System.out.println("\nWhich service would you like to remove?");
                     for (int i = 0; i < cart.size(); i++) {
                      System.out.println((i + 1) + ". " + cart.get(i));
              }
                     System.out.print("Enter the number of the service to remove: ");
                     int removeChoice = input.nextInt();
                     input.nextLine();

                    if (removeChoice < 1 || removeChoice > cart.size()) {
                    System.out.println("Invalid choice. Try again.");
                     } else {
                    String removed = cart.remove(removeChoice - 1);
                          System.out.println("Removed \"" + removed + "\" from your cart.");
        }

                    } else if (actionChoice == 0) {
                 System.out.println("\nBooking finished. Your cart contains:");
                     if (cart.isEmpty()) {
                          System.out.println("No services booked.");
                      } else {
                       for (int i = 0; i < cart.size(); i++) {
                        System.out.println((i + 1) + ". " + cart.get(i));
            }
        }
                        System.out.println("Thank you for booking!");
                       break;
                        } else {
                         System.out.println("Invalid option. Please enter 0, 1, or 2.");
    }
                }

                
            }
        }
    }
}

