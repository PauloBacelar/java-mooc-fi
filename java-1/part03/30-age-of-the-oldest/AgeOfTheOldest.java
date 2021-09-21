
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;

        while(true) {
            String data = scanner.nextLine();
            
            if(data.isEmpty()) {
                System.out.println("Age of the oldest: " + oldest);
                break;
            }
            
            int age = Integer.valueOf(data.split(",")[1]);
            if(age > oldest) {
                oldest = age;
            }
        }
    }
}
