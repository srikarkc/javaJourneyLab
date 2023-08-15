import java.util.List;

public class helloWorld {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12, 9, 3, 1, 24));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for(int num:numbers) {
            System.out.println(num);
        }
    }
}