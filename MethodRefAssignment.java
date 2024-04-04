import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee{
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public boolean salaryRange(){
        return this.salary > 20000;
    }
    public int newSalary(){
        return this.salary + 500;
    }
}
public class MethodRefAssignment {

    public static void main(String[] args) {
        System.out.println("Filter the even number using method Reference");
        List<Integer> numbers = Arrays.asList(2,5,6,9,4);
        List<Integer> even = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        System.out.println("Filter the String without empty string and find the length and return the sum of all length using method Reference");
        List<String> fruits = Arrays.asList("apple","banana","","grapes","","oranges");
        fruits.stream().filter(Predicate.not(String::isEmpty)).map(String::length).reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println("Filter the Employee salary > 25000 and add +500 to them and then print the sum of all the reqd salary");
        List<Employee> emps = Arrays.asList(new Employee("Avinash", 30000), new Employee("Annu", 25000),new Employee("Akansha", 15000));
        emps.stream().filter(Employee::salaryRange).map(Employee::newSalary).reduce(Integer::sum).ifPresent(System.out::println);
    }
}
