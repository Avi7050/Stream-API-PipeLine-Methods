import java.util.List;

public class ReduceEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,32,43,76,13,56,98);

        System.out.println(" Filter the even number and multiply by 10 and print the sum: ");
        int result = numbers.stream().filter(number -> number % 2 == 0).map(number -> number * 10).reduce((number1,number2) -> number1 + number2).get();
        System.out.println(result);

        List<String> names = List.of("raju","rani","devi","ravi","ratan","sravya");
        System.out.println(" Filter the names start with 'r' and length == 4 and add 'Soft' to the names print all: ");
        String reduceName = names.stream().filter(name -> name.startsWith("r") && name.length() == 4).map(name -> name + "soft").reduce((name1,name2) -> name1 + name2).get();
        System.out.println(reduceName);
    }
}
