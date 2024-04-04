import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
    }
}