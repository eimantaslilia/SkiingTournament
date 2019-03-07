import java.util.Scanner;

public class Input {
    Scanner reader;

    public Input() {
        reader = new Scanner(System.in);
    }
    public String command(){
        return reader.nextLine();
    }
}