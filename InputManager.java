import java.util.Scanner;

public enum InputManager {
    USER;

    public String getInput() {
        System.out.println("zmenit jazyk?");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


}
