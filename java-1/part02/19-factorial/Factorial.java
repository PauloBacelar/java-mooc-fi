
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 1;

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        for(int i = 2; i <= number; i++) {
            sum *= i;
        }
        
        System.out.println("Factorial: " + sum);
    }
}
