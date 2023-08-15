import java.util.List;

public class functionalProgram {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12, 9, 3, 1, 24));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // Convert numbers into a stream of numbers
        numbers.stream()
            .forEach(functionalProgram::print);
    }
}
