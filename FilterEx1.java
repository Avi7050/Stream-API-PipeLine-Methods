import java.util.*;
import java.util.stream.Collectors;

class FilterEx1{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("devi","raju","rani","ravi","radha","krishna","king","queen");
        System.out.println("Filter the name starts with 'r' and print the names: ");
        names.stream().filter(name -> name.startsWith("r")).forEach(name -> System.out.println(name));

        System.out.print("Filter the name starts with 'r' and length == 4 and take it in list format: ");
        List<String> listOfNames = names.stream().filter(name -> name.startsWith("r") && name.length() == 4).collect(Collectors.toList());
        System.out.println(listOfNames);

        System.out.print("Filter the name starts with 'r' and length == 4 and take it in set format: ");
        Set<String> setOfNames = names.stream().filter(name -> name.startsWith("r") && name.length() == 4).collect(Collectors.toSet());
        System.out.println(setOfNames);

        System.out.print("Filter the name starts with 'r' and count: ");
        long count = names.stream().filter(name -> name.startsWith("r")).count();
        System.out.println(count);

        System.out.print("Filter the name starts with 'k' and find the first element: ");
        String firstName = names.stream().filter(name -> name.startsWith("k")).findFirst().get();
        System.out.println(firstName);

        System.out.print("Filter the name starts with 'k' and find the third element: ");
        String thirdElement = names.stream().filter(name -> name.startsWith("r")).skip(2).findFirst().get();
        System.out.println(thirdElement);
    }
}