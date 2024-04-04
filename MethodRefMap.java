import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int newAge(){
        return this.age + 2;
    }
}
public class MethodRefMap{
    public static List<Integer> stringToInt(List<String> numbers){
        return numbers.stream().map(Integer::valueOf).collect(Collectors.toList());
    }

    public static List<Integer> stringLength(List<String> names){
        return names.stream().map(String::length).collect(Collectors.toList());
    }

    public static List<String> stringToUpperCase(List<String> namess){
        return namess.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Numbers in String format to Integer format ");
        List<String> numbers = Arrays.asList("1","2","3","4","5");
        List<Integer> intNumbers = stringToInt(numbers);
        System.out.println(intNumbers);

        System.out.println("Given List of each String's length in List format ");
        List<String> names = Arrays.asList("Avinash","Anu","rani","arshi","sunaina");
        List<Integer> namesLength = stringLength(names);
        System.out.println(namesLength);

        System.out.println("Given List of each String's case to UpperCase in List format ");
        List<String> namess = Arrays.asList("Avinash","Anu","rani","arshi","sunaina");
        List<String> namessInUCase = stringToUpperCase(namess);
        System.out.println(namessInUCase);

        System.out.println("Given Person Object, just add +2 in the age ");
        List<Person> persons = Arrays.asList(new Person("Avinash", 27), new Person("Resham", 26));
        persons.stream().map(Person::newAge).forEach(System.out::println);

        System.out.println("Take Integers and print total, max, min ");
        List<Integer> num = Arrays.asList(2,4,5,6,8,9);
        int total = num.stream().reduce(Integer::sum).get();
        System.out.println("Total: " + total);

        int min = num.stream().reduce(Integer::min).get();
        System.out.println("min: " + min);

        int max = num.stream().reduce(Integer::max).get();
        System.out.println("max: " + max);
    }
}