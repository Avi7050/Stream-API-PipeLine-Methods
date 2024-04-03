import java.util.List;
class Emp{
    int id;
    String name;
    int salary;
    Emp(){
    }
    Emp(int id, String name, int salary){
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
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public boolean checkSalary(){
        return this.salary > 5000;
    }

    public boolean checkName(){
        return this.name.startsWith("a");
    }
    
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = List.of("anu","ratan","","gyatri","addanki","","kriti");

        System.out.println("Print using forEach method");
        names.forEach(name -> System.out.println(name));

        System.out.println("\nPrint using Method Reference method");
        names.forEach(System.out::println);

        System.out.println("\nfilter the non-Empty Strings and Print using forEach method");
        names.stream().filter(name -> !name.isEmpty()).forEach(name -> System.out.println(name));

        System.out.println("\nfilter the Empty Strings and count using method ref");
        long count = names.stream().filter(String::isEmpty).count();
        System.out.println(count);

        List<Emp> emps = List.of(new Emp(1, " Aviansh", 10000),
                                    new Emp(2, "anu", 20000),
                                    new Emp(3, "sravya", 30000),
                                    new Emp(4, "anuradha", 4000));

        System.out.println("\nFilter the Employee whose salary > 5000: ");
        emps.stream().filter(Emp::checkSalary).forEach(System.out::println);

        System.out.println("\nFilter the Employee whose name start with 'a' : ");
        emps.stream().filter(Emp::checkName).forEach(System.out::println);
    }
}
