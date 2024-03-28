import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
    int eid;
    String name;
    double esal;

    Employee(int eid, String name, double esal){
        this.eid = eid;
        this.name = name;
        this.esal = esal;
    }    
}
public class FilterEx2{
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee(1, "Avinash", 100000),
                            new Employee(2, "Akash", 20000),
                            new Employee(3, "Radhika", 30000),
                            new Employee(1, "Akash", 40000));

        System.out.println("*****Filter the Employee data that starts with 'A' and print it:***** ");
        emps.stream().filter(emp -> emp.name.startsWith("A")).forEach(emp -> System.out.println(emp.eid+" " +emp.name+" "+emp.esal));

        System.out.println("*****Filter the Employee data that starts with 'A' and collect in List format:***** ");
        List<Employee> eList = emps.stream().filter(emp -> emp.name.startsWith("A")).collect(Collectors.toList());
        eList.forEach(emp -> System.out.println(emp.eid+" " +emp.name+" "+emp.esal));

        System.out.println("*****Filter the Employee data having salary > 15000 and collect in List format:***** ");
        List<Employee> eList1 = emps.stream().filter(emp -> emp.esal > 25000).collect(Collectors.toList());
        eList1.forEach(emp -> System.out.println(emp.eid+" " +emp.name+" "+emp.esal));

        System.out.println("*****Filter the Employee data that starts with 'A' and collect in Set format:***** ");
        Set<Employee> eSet = emps.stream().filter(emp -> emp.name.startsWith("A")).collect(Collectors.toSet());
        eSet.forEach(emp -> System.out.println(emp.eid+" " +emp.name+" "+emp.esal));

        System.out.println("*****Filter the Employee data having id as '1' and collect in Set format:***** ");
        Set<Employee> eSet1 = emps.stream().filter(emp -> emp.eid == 1).collect(Collectors.toSet());
        eSet1.forEach(emp -> System.out.println(emp.eid+" " +emp.name+" "+emp.esal));

        System.out.println("*****Filter the Employee data and find the first element:***** ");
        Employee e1 = emps.stream().filter(emp -> emp.name.startsWith("A")).findFirst().get();
        System.out.println(e1.eid + " " + e1.name + " " + e1.esal);

        System.out.println("*****Filter the Employee data and get the specific third(3) element:***** ");
        Employee e3 = emps.stream().filter(emp -> emp.name.startsWith("A")).skip(2).findFirst().get();
        System.out.println(e3.eid + " " + e3.name + " " + e3.esal);

        System.out.println("*****Filter the Employee data having salary > 1500000 orElse print null:***** ");
        Employee ee = emps.stream().filter(emp -> emp.esal > 1500000).findFirst().orElse(null);
        if(ee != null)
            System.out.println(ee.eid + " " + ee.name + " " + ee.esal);
        else
            System.out.println(ee);
    }
}
