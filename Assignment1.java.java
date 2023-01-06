import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student email is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String studentEmail = scan.nextLine();
        

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Phone Number: ");
        String phoneNum = scanner.nextLine();

        Pattern patt = Pattern.compile("\\+63+\\d{10}");
        Matcher mat = patt.matcher(phoneNum);

        boolean mAtch = mat.matches();

        if (mAtch) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }

        Scanner scnnr = new Scanner(System.in);
        System.out.print("Birthday: ");
        String birthDay = scnnr.nextLine();

        Pattern pat = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher mtch = pat.matcher(birthDay);

        boolean matched = mtch.matches();

        if (matched) {
            System.out.println("valid birthday");
        } else {
            System.out.println("invalid birthday");
        }
    }
}