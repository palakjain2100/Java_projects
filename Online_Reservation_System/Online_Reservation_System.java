import java.util.*;
public class Online_Reservation_System {
    private Map<String, String> customer;
    private Map<String, String> reservations;

    public Online_Reservation_System() {
        customer = new HashMap<>();
        reservations = new HashMap<>();
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println("****** WELCOME TO ONLINE RESERVATION SYSTEM ******");
            System.out.println("-----------------------------------------------------");
            System.out.println("Please Select One Options..." + "\n");
            System.out.println("1. Register ");
            System.out.println("2. Login ");
            System.out.println("3. Exit ");
            System.out.println("------------------------------------------------------");
            System.out.print("Please Select Any One Option From Above: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    register(sc);
                    break;
                case 2:
                    login(sc);
                    break;
                case 3:
                    System.out.println("------------------------------------------------------");
                    System.out.println("\n" + "Exiting...");
                    System.out.println("\n" + "------------------------------------------------------");
                    System.out.println("\n" + "Thank You.!!! Please Visit Again...");
                    System.out.println("\n" + "------------------------------------------------------");
                    return;
                default:
                    System.out.println("------------------------------------------------------");
                    System.out.println("\n" + "Invalid choice... Please Try again...");
                    break;
            }

            System.out.println();
        }
    }

    private void register(Scanner sc) {
        System.out.println("------------------------------------------------------");
        System.out.println("****** REGISTRATION PAGE ******");
        System.out.println("------------------------------------------------------");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        if (username.isEmpty()) {
            System.out.println("\n" + "Username cannot be empty...");
            return;
        }

        if (customer.containsKey(username)) {
            System.out.println("\n" + "Username already exists... Try again...");
            return;
        }

        System.out.print("Enter password: ");
        String password = sc.nextLine();
        if (password.isEmpty()) {
            System.out.println("\n" + "Password cannot be empty...");
            return;
        }

        customer.put(username, password);
        System.out.println("\n" + "Registration successful... You can now log in...");
    }

    private void login(Scanner sc) {
        System.out.println("------------------------------------------------------");
        System.out.println("****** LOGIN PAGE ******");
        System.out.println("------------------------------------------------------");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (customer.containsKey(username) && customer.get(username).equals(password)) {
            System.out.println("\n" + "Login successful...");
            reservationMenu(sc, username);
        } else {
            System.out.println("\n" + "Invalid username or password...");
        }
    }

    private void reservationMenu(Scanner sc, String username) {
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("****** HOME PAGE ******");
            System.out.println("------------------------------------------------------");
            System.out.println("Please Select One Options..." + "\n");
            System.out.println("1. Make a reservation ");
            System.out.println("2. Cancel a reservation ");
            System.out.println("3. View all Reservations ");
            System.out.println("4. Logout");
            System.out.println("------------------------------------------------------");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    makeReservation(sc, username);
                    break;
                case 2:
                    cancelReservation(sc, username);
                    break;
                case 3:
                    viewAllReservations();
                    break;
                case 4:
                    System.out.println("------------------------------------------------------");
                    System.out.println("\n" + "Logging out...");
                    return;
                default:
                    System.out.println("------------------------------------------------------");
                    System.out.println("\n" + "Invalid choice. Try again.");
                    break;
            }

            System.out.println();
        }
    }

    private void makeReservation(Scanner sc, String username) {
        System.out.println("------------------------------------------------------");
        System.out.print("Enter reservation details: ");
        String reservationDetails = sc.nextLine();

        if (reservations.containsKey(username)) {
            System.out.println("\n" + "You already have a reservation. Cancel it first to make a new one...");
            return;
        }

        reservations.put(username, reservationDetails);
        System.out.println("\n" + "Reservation created successfully...");
    }

    private void viewAllReservations() {
        System.out.println("------------------------------------------------------");
        System.out.println("****** VIEW ALL RESERVATIONS ******");
        System.out.println("------------------------------------------------------");

        for (String username : reservations.keySet()) {
            String reservationDetails = reservations.get(username);
            System.out.println(username + ": " + reservationDetails);
        }

        System.out.println();
    }

    private void cancelReservation(Scanner sc, String username) {
        if (reservations.containsKey(username)) {
            System.out.println("------------------------------------------------------");
            System.out.println("Your current reservation: " + reservations.get(username));
            System.out.print("Do you want to cancel this reservation? (Y/N): ");
            String confirmation = sc.nextLine();

            if (confirmation.equalsIgnoreCase("Y")) {
                reservations.remove(username);
                System.out.println("\n" + "Reservation cancelled successfully...");
            } else {
                System.out.println("\n" + "Reservation not cancelled...");
            }
        } else {
            System.out.println("\n" + "You don't have any reservations...");
        }
    }

    public static void main(String[] args) {
        Online_Reservation_System system = new Online_Reservation_System();
        system.execute();
    }
}
