import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);
    }
}
