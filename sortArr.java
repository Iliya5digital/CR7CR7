import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(numbers);

        int length = numbers.length;
        int[] revArr = new int[length];

        for (int j = 0; j < length; j++) {
            revArr[length - j - 1] = numbers[j];
        }

        String[] numbersAsStrings = new String[revArr.length];
        for (int i = 0; i < revArr.length; i++) {
            numbersAsStrings[i] = Integer.toString(revArr[i]);
        }
        String output = String.join(", ", numbersAsStrings);

        System.out.println(output);

    }
}