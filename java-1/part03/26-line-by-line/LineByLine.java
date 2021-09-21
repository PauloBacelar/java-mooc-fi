
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String message = scanner.nextLine();
            
            if(message.isEmpty()) {
                break;
            }
            
            String[] messages = message.split(" ");
            for(int i = 0; i < messages.length; i++) {
                System.out.println(messages[i]);
            }
        }
        
    }
}
