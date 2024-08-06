public class MathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        result = (int)Math.ceil(1.1);
        System.out.println(result);

        result = (int)Math.floor(1.1);
        System.out.println(result);

        result = Math.max(1, 2);
        System.out.println(result);

        result = Math.min(1, 2);
        System.out.println(result);

        double random = Math.random() * 100;
        System.out.println(random);
    }
}
