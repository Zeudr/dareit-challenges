import java.util.Scanner;

public class PersonService {

    protected String getUserValue(String text) {
        Scanner input = new Scanner(System.in);
        String s;

        do {
            System.out.println(text);
            s = input.nextLine();
        } while (s.equals(""));

        return s;
    }

}
