import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = SafeInput.getNonZeroLenString(console, "Enter your name");
        System.out.println("You entered: " + input);
    }
}
