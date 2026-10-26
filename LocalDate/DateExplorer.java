import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateExplorer {
    private LocalDate date;
    public DateExplorer(LocalDate date) {   //constructor
        this.date = date;
    }
    public void displayMonth() {
        Month month = date.getMonth();
        System.out.println("Month: " + month);
        System.out.println("Month number: " + month.getValue());
    }
    public void displayYear() {
        int year = date.getYear();
        System.out.println("Year: " + year);
        if (date.isLeapYear()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public void displayDayOfWeek() {
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day of the week: " + day);
    }
    public void lookBackMonths(int months) {
        LocalDate pastDate = date.minusMonths(months);
        System.out.println(months + " months before: " + pastDate);
    }
    public void displayFullDate() {
        System.out.println("Date: " + date);
        displayMonth();
        displayYear();
        displayDayOfWeek();
    }
    public void showMenu(Scanner sc) {
        int choice;

        do {
            System.out.println("\n===== Date Explorer =====");
            System.out.println("1. Display Month");
            System.out.println("2. Display Year and Leap Year");
            System.out.println("3. Display Day of Week");
            System.out.println("4. Look Back by Months");
            System.out.println("5. Display All Date Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Enter a valid menu number: ");
                sc.next();
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayMonth();
                    break;

                case 2:
                    displayYear();
                    break;

                case 3:
                    displayDayOfWeek();
                    break;

                case 4:
                    System.out.print("Enter number of months to look back: ");

                    while (!sc.hasNextInt()) {
                        System.out.print("Enter a valid number of months: ");
                        sc.next();
                    }

                    int months = sc.nextInt();

                    if (months < 0) {
                        System.out.println("Please enter zero or a positive number.");
                    } else {
                        lookBackMonths(months);
                    }
                    break;

                case 5:
                    displayFullDate();
                    break;

                case 6:
                    System.out.println("Exiting Date Explorer. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 to 6.");
            }

        } while (choice != 6);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a date (yyyy-MM-dd): ");
            String input = sc.nextLine();

            LocalDate enteredDate = LocalDate.parse(input);

            DateExplorer explorer = new DateExplorer(enteredDate);
            explorer.showMenu(sc);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date! Please use yyyy-MM-dd format.");
        } finally {
            sc.close();
        }
    }
}
