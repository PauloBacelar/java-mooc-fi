
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        
        while(true) {
            double number = Integer.valueOf(scanner.nextLine());
            
            if(number > 0) {
                sum += number;
                count++;
            } else if(number == 0) {
                if(count == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(sum / count);
                }
                
                break;
            }
        }
    }
}
