public class Casting {
    public static void main(String[] args) {
        double x = 1.1;
        int y = (int)x + 2;
        System.out.println(y);

        String xString = "1";
        int z = Integer.parseInt(xString) + 2;
        System.out.println(z);
    }
}
