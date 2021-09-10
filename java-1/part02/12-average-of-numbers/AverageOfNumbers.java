
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            double number = Integer.valueOf(scanner.nextLine());
            
            if(number != 0) {
                count++;
                sum += number;
            } else {
                System.out.println("Average of the numbers: " + sum / count);
                break;
            }
        }
    }
}
