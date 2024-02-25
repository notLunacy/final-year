import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Random number
        Random rdm = new Random();
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Final question
        System.out.println("Want to know the year you're going to die? yes or no: ");
        String yesOrNo = scanner.nextLine();

        // Result
        int result = yesOrNo.equals("yes") ? rdm.nextInt(2060 - 2024 + 1) + 2024 : (yesOrNo.equals("no")) ? -1 : 0;

        // System out
        if (yesOrNo.equals("yes")) {
            System.out.println("You'll die in " + result);
        } else if (yesOrNo.equals("no")) {
            System.out.println("You've been saved from the curse!");
        } else {
            System.out.println("Invalid response!");
        }

    }
}
