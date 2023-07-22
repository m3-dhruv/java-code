import java.util.*;

public class function {

    public static void printMyName(String name) {
        System.out.print(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); // call a function
    }
}
