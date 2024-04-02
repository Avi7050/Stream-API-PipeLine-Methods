import java.util.*;

class Emp{
    Integer id;
    String name;
    Double salary;

    public Emp(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
public class SortingObj {
    public static void main(String[] args) {
        // Using List.sort();
        List<Emp> emps = Arrays.asList(new Emp(1, "Avinash", 100000.00),
                                new Emp(2, "Akash", 30000.00),
                                new Emp(3, "Akansha", 40000.00),
                                new Emp(4, "Ratan", 50000.00),
                                new Emp(5, "David", 60000.00));

        System.out.println("Sorting using list.sort method based on salary in asc order");
        emps.sort((e1,e2) -> e1.salary.compareTo(e2.salary));
        emps.forEach(emp -> System.out.println(emp));

        System.out.println("Sorting using list.sort method based on Name in desc order");
        emps.sort((e1,e2) -> e2.name.compareTo(e1.name));
        emps.forEach(emp -> System.out.println(emp));

        System.out.println("Sorting using stream.sorted method based on salary in asc order");
        emps.stream().filter(emp -> emp != null).filter(emp -> emp.salary >= 60000).sorted((e1,e2) -> e1.salary.compareTo(e2.salary)).forEach(emp -> System.out.println(emp));

        System.out.println("Sorting using stream.sorted method based on salary in desc order");
        emps.stream().filter(emp -> emp != null).filter(emp -> emp.salary >= 60000).sorted((e1,e2) -> e2.salary.compareTo(e1.salary)).forEach(emp -> System.out.println(emp));
    }
}
