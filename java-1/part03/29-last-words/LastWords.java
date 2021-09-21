
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String message = scanner.nextLine();
            
            if(message.isEmpty()) {
                break;
            }
            
            String[] messages = message.split(" ");
            System.out.println(messages[messages.length - 1]);
        }
    }
}
