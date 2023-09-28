import java.util.*;

public class mulFunction {

    public static int calMultiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("sum of two number is : " + calMultiply(a, b));
        }
    }
}
