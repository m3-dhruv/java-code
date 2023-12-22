public class Method_overloading {

    static void foo(){
        System.out.println("Good morning");
    }
    static void foo(int a){
        System.out.println("Good morning " + a);

    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a +" "+ b);
    }

    public static void main(String[] args) {
    foo();
    foo(10);
    foo(10, 100);

    }
    
}