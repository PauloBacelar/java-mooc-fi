
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthSum = 0, count = 0;
        String longestName = "";
        
        while(true) {
            String data = scanner.nextLine();
            
            if(data.isEmpty()) {
                System.out.println("Longest name: " + longestName);
                System.out.println("Average of birth years: " + birthSum * 1.0 / count);
                break;
            }
            
            String name = data.split(",")[0];
            birthSum += Integer.valueOf(data.split(",")[1]);
            count++;
            
            if(name.length() > longestName.length()) {
                longestName = name;
            }
            
        }
    }
}
