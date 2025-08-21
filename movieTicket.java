import java.util.Scanner;
public class movieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String movieName = "";

        // Step 1: need to select one Movie from 3//
        System.out.println("Choose a movie:");
        System.out.println("1. Pushpa 2");
        System.out.println("2. Adhipurush");
        System.out.println("3. Love Today");
        System.out.print("Enter your choice (1-3): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                movieName = "Pushpa 2";
                break;
            case 2:
                movieName = "Adhipurush";
                break;
            case 3:
                movieName = "Love Today";
                break;
            default:
                System.out.println("Invalid movie choice.");
                return;
        }

        // Step 2: Select Show Timings//
        System.out.println("\nSelect show timing:");
        System.out.println("1. Morning (10:00 AM)");
        System.out.println("2. Afternoon (2:00 PM)");
        System.out.println("3. Evening (6:00 PM)");
        System.out.print("Enter your show timing (1-3): ");
        int timeChoice = sc.nextInt();
        String showTime = "";

        switch (timeChoice) {
            case 1:
                showTime = "Morning (10:00 AM)";
                break;
            case 2:
                showTime = "Afternoon (2:00 PM)";
                break;
            case 3:
                showTime = "Evening (6:00 PM)";
                break;
            default:
                System.out.println("Invalid show timing.");
                return;
        }

        // Step 3: select the age category//
        System.out.println("\nSelect age category:");
        System.out.println("1. Children (₹150)");
        System.out.println("2. Adult (₹250)");
        System.out.println("3. Senior Citizen (₹200)");
        System.out.print("Enter your category (1-3): ");
        int ageCategory = sc.nextInt();

        String category = "";
        int ticketPrice = 0;

        switch (ageCategory) {
            case 1:
                category = "Children";
                ticketPrice = 150;
                break;
            case 2:
                category = "Adult";
                ticketPrice = 250;
                break;
            case 3:
                category = "Senior Citizen";
                ticketPrice = 200;
                break;
            default:
                System.out.println("Invalid age category.");
                return;
        }

        // Step 4: how many tickets  do you need??//
        System.out.print("Enter number of people: ");
        int people = sc.nextInt();
        int total = ticketPrice * people;

        // Step 5: Apply  the discount if eligible//
        double discount = 0;
        if (total <= 2000) {
            discount = total * 0.10; // 10% discount
        }

        double amountPayable = total - discount;

        // Step 6: Print summary
        System.out.println("\n----- Ticket Summary -----");
        System.out.println("Movie: " + movieName);
        System.out.println("Show Time: " + showTime);
        System.out.println("Age Category: " + category);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of People: " + people);
        System.out.println("Total: " + total);
        System.out.println("Discount (10% if total >= 2000): " + discount);
        System.out.println("Amount Payable: " + amountPayable);

        sc.close();
    }
}
		