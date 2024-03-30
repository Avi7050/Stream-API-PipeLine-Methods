import java.util.*;

public class SortMethod {
    public static void main(String[] args) {
        String[] arr = {"raju","rani","ravi","dev","ratan","anu","sravya"};
        List<String> names = Arrays.asList(arr);
        
        System.out.println("*******Collections.sort() method in Ascending Order*******");
        Collections.sort(names);
        System.out.println(names);

        System.out.println("*******Collections.sort() method in Descending Order*******");
        Collections.sort(names.reversed());
        System.out.println(names);

        System.out.println("*******Collections.sort() method in Descending Order using comparator*******");
        Collections.sort(names,Comparator.reverseOrder());
        System.out.println(names);

        System.out.println("*******List.sort() method in Ascending Order*******");
        names.sort(((name1,name2) -> name1.compareTo(name2)));
        System.out.println(names);

        System.out.println("*******List.sort() method in Descending Order*******");
        names.sort(((name1,name2) -> -name1.compareTo(name2)));
        System.out.println(names);

        System.out.println("*******List.sort() method in Descending Order*******");
        names.sort(((name1,name2) -> name2.compareTo(name1)));
        System.out.println(names);

        System.out.println("*******stream API sorted method in Ascending Order*******");
        names.stream().sorted().forEach(name -> System.out.println(name));

        System.out.println("*******stream API sorted method in Descending Order*******");
        names.stream().sorted((name1,name2) -> name2.compareTo(name1)).forEach(name -> System.out.println(name));

        System.out.println("*******stream API sorted method in Ascending Order but filtering the names that start with 'r' *******");
        names.stream().filter(name -> name.startsWith("r")).sorted().forEach(name -> System.out.println(name));

        System.out.println("*******stream API sorted method in Descending Order but filtering the names that start with 'r' *******");
        names.stream().filter(name -> name.startsWith("r")).sorted((name1,name2) -> name2.compareTo(name1)).forEach(name -> System.out.println(name));

        System.out.println("*******Take List of Integes filter the data < 10 and multiply by 10 and print in descending order *******");
        
        List<Integer> numbers = List.of(5,4,3,7,8,23,34,45,67);
        numbers.stream().filter(number -> number > 10).map(number -> number * 10).sorted((number1,number2) -> number2.compareTo(number1)).forEach(number -> System.out.println(number));

    }
}
