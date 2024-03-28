import java.util.*;
import java.util.stream.Collectors;
class Employee {
    int id;
    String name;
    double salary;
    public Employee(){}
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
public class MapMethodEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9);

        System.out.println("Using map method: ");
        numbers.stream().map(number -> number + 10).forEach(number -> System.out.println(number));

        System.out.println("Using map method and filter the even number and add 10 to each element: ");
        numbers.stream().filter(number -> number % 2 == 0).map(number -> number + 10).forEach(number -> System.out.println(number));

        System.out.println("Using map method and filter the Even number and add 10 to each element and collect as List Format: ");
        List<Integer> evenList = numbers.stream().filter(number -> number % 2 == 0).map(number -> number + 10).collect(Collectors.toList());
        System.out.println(evenList);

        System.out.println("Using map method and filter the Odd number and add 10 to each element and collect as Set Format: ");
        Set<Integer> oddSet = numbers.stream().filter(number -> number % 2 != 0).map(number -> number + 10).collect(Collectors.toSet());
        System.out.println(oddSet);

        List<Employee> emps = Arrays.asList(new Employee(1, "Akash", 10000),
                                            new Employee(2, "Avinash", 100000),
                                            new Employee(3, "Aryan", 15000),
                                            new Employee(4, "Ratan", 20000),
                                            new Employee(5, "Komal", 30000));

        System.out.println("Using map method and filter the Employee Data and add soft to name and print only names: ");
        emps.stream().filter(emp -> emp.getName().startsWith("A")).map(emp -> emp.getName() + " Soft ").forEach(emp -> System.out.println(emp));

        System.out.println("Using map method and filter the Employee Data whose salary > 20000 and add 2000 to them and collect in List format: ");
        List<Employee> empMap = emps.stream().filter(emp -> emp.getSalary() > 20000).map(emp -> {emp.setSalary(emp.getSalary() + 2000); return emp;}).collect(Collectors.toList());
        empMap.forEach(emp -> System.out.println(emp));

        System.out.println("Using map method and filter the Employee Data whose salary > 20000 and add soft to name and collect in List format: ");
        List<Employee> empMap1 = emps.stream().filter(emp -> emp.getSalary() > 20000).map(emp -> {emp.setName(emp.getName() + " Great ");return emp;}).collect(Collectors.toList());
        empMap1.forEach(emp -> System.out.println(emp));
    }
}
