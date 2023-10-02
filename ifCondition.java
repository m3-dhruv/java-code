import java.util.Scanner;

public class ifCondition{
    public static void main(String []args){
    int age;
    System.out.println("enter your age");
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();

    if(age>60){
        System.out.println("you are experienced!");
    }
    else if(age>45){
        System.out.println("you are semi-experienced!");
    }
    else if(age>36){
        System.out.println("you are semi semi experienced!");
    }
    else{
        System.out.println("you are not experienced!");
    }
}
}