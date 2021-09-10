
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, odd = 0, even = 0;
        
        System.out.println("Give numbers:");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + (sum * 1.0) / count);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                
                break;
            } else {
                sum += number;
                count++;
                
                if(number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
    }
}
