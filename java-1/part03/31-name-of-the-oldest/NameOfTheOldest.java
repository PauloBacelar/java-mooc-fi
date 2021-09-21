
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = -1;
        
        while(true) {
            String data = scanner.nextLine();
            
            if(data.isEmpty()) {
                System.out.println("Name of the oldest: " + oldestName);
                break;
            }
            
            String name = data.split(",")[0];
            int age = Integer.valueOf(data.split(",")[1]);
            
            if(age > oldestAge) {
                oldestName = name;
                oldestAge = age;
            }
        }
    }
}
