import java.util.Scanner;

public class Base {
    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println("arg " + arg);

        }
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String text = scanner.next();

        System.out.println("Int " + i);
        System.out.println("Str " + text);
        System.err.println("error");

        System.out.println("ghjgh");
        System.out.printf("%+12.10f", Math.PI);
        scanner.close();
    }
}