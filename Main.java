package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add Member");
            System.out.println("2. Add Staff Member");
            System.out.println("3. Add Subscription");
            System.out.println("4. Book a Reading Session");
            System.out.println("5. View Members");
            System.out.println("6. View Staff Members");
            System.out.println("7. View Subscriptions");
            System.out.println("8. View booked reading sessions");
            System.out.println("9. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter member name:");
                    String name = sc.nextLine();
                    System.out.println("Enter member email:");
                    String email = sc.nextLine();
                    Member member = new Member(name, email);
                    DB.addMember(member);
                    break;
                case 2:
                    System.out.println("Enter Staff Member Name:");
                    String trainerName = sc.nextLine();
                    System.out.println("Enter Staff Member specialization:");
                    String specialization = sc.nextLine();
                    Staff staff = new Staff(trainerName, specialization);
                    DB.addStaff(staff);
                    break;
                case 3:
                    System.out.println("Enter member ID for Library subscription:");
                    int memberId = sc.nextInt();
                    sc.nextLine(); // consume the newline character
                    System.out.println("Enter Library subscription type:");
                    String type = sc.nextLine();
                    System.out.println("Enter start date (YYYY-MM-DD):");
                    String startDate = sc.nextLine();
                    System.out.println("Enter end date (YYYY-MM-DD):");
                    String endDate = sc.nextLine();
                    Subscription subscription = new Subscription(memberId, type, startDate, endDate);
                    DB.addSubscription(subscription);
                    break;
                case 4:
                    System.out.println("Enter reading session name:");
                    String reading_session = sc.nextLine();
                    System.out.println("Enter reading session schedule (e.g., 10:00 AM - 11:00 AM):");
                    String schedule = sc.nextLine();
                    System.out.println("Enter staff ID:");
                    int staffID = sc.nextInt();
                    Book r_s = new Book(reading_session, schedule, staffID);
                    DB.add_r_s(r_s);
                    break;
                case 5:
                    System.out.println("Members:");
                    DB.getAllMembers().forEach(m -> System.out.println(m.getName()));
                    break;
                case 6:
                    System.out.println("Staff members:");
                    DB.getAllStaff().forEach(t -> System.out.println(t.getName()));
                    break;
                case 7:
                    System.out.println("Subscriptions:");
                    DB.getAllSubscriptions().forEach(s -> System.out.println(s.getType()));
                    break;
                case 8:
                    System.out.println("Reading Sessioons:");
                    DB.getAll_r_s().forEach(g -> System.out.println(g.getName()));
                    break;
                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}

