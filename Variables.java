import java.util.Scanner;

public class Variables {
    public static void main (String[] args) {

      //VARIABLES

        String name = "tony stark";
        int age = 48;
        double prize = 25.25;
        int a = 10;
        int b = 25;

     // change the value
        a = 15;
        name = "iron man";

        int sum = a + b ;
        System.out.println(sum); 

      //INPUT   
        Scanner sc = new Scanner(System.in);
        String namee = sc.nextLine();
        System.out.println(namee);

    }
}