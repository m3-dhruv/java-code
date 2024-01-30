class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getsalary() {
        return salary;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee tony = new Employee();
        Employee thor = new Employee();

        tony.id = 13;
        tony.salary = 30;
        tony.name = "tony stark";

        thor.id = 15;
        thor.salary = 19;
        thor.name = "mr thor";

        tony.printDetails();
        thor.printDetails();
        int salary = thor.getsalary();
        System.out.println("my salary "+salary);

        // System.out.println(tony.id);
        // System.out.println(tony.name);

    }
}
