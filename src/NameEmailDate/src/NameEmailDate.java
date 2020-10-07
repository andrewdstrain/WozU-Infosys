import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class NameEmailDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Date: ");
        String dateString = scanner.nextLine();
        scanner.close();

        LocalDate date;

        try {
            date = LocalDate.parse(dateString);
        } catch (DateTimeParseException ex) {
            System.err.println("Wrong date format, " + name + ". Please try again.");
            return;
        }

        System.out.println("Hello, " + name + ". I will send the email to " + email + " on " + date + ".");
    }
}
