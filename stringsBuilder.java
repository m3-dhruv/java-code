//import java.util.*;

public class stringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        // insert at index 0
        sb.insert(0, 'T');
        System.out.println(sb);

        sb.insert(3, 'n');
        System.out.println(sb);

        // delete m 
        sb.delete(1, 2);
        System.out.println(sb);

        // insert in last
        sb.append(" Stark");
        System.out.println(sb);

        // length 
        System.out.println(sb.length());
        
    }
}
