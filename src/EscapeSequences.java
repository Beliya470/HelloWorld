public class EscapeSequences {
    public static void main(String[] args) {
        String message = "Hello \"Mosh\"";
        String path = "C:\\Windows\\System32";
        String newLine = "Hello\nWorld";
        String tab = "Hello\tWorld";

        System.out.println(message);
        System.out.println(path);
        System.out.println(newLine);
        System.out.println(tab);
    }
}
