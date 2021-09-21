
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1) {
                break;
            }
            
            numbers.add(number);
        }
        
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            System.out.println("Passou");
        }
        
        System.out.println("Average: " + (sum * 1.0 / numbers.size()));
    }
}
