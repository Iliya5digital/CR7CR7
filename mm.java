import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int count = 0;
        while (!input.contains("end")) {
            String[] inputArr = input.split(" ");
            int firstIndex = Integer.parseInt(inputArr[0]);
            int secondIndex = Integer.parseInt(inputArr[1]);

            boolean isNotValid = firstIndex == secondIndex || firstIndex < 0 || secondIndex < 0
                    || firstIndex > elementList.size() - 1 || secondIndex > elementList.size() - 1;

            count++;

            if (isNotValid && elementList.size() > 0) {

                String elementToAdd = "-" + count + "a";

                elementList.add(elementList.size() / 2, elementToAdd);
                elementList.add(elementList.size() / 2, elementToAdd);


                System.out.println("Invalid input! Adding additional elements to the board");

            } else  if (elementList.size() == 0) {


                System.out.printf("You have won in %d turns!", count - 1);
                return;
            } else {
                if (elementList.get(firstIndex).equals(elementList.get(secondIndex))) {
                    String elementForRemove = elementList.get(firstIndex);
                    elementList.remove(elementForRemove);
                    elementList.remove(elementForRemove);
                    System.out.printf("Congrats! You have found matching elements - %s!%n", elementForRemove);
                } else {
                    System.out.println("Try again!");
                }
            }


            input = scanner.nextLine();
        }


        if (input.contains("end") && elementList.size() != 0) {
            System.out.println("Sorry you lose :(");
            //System.out.println(elementList.toString().replaceAll("[\\]\\[,]", ""));
            System.out.println(String.join(" ",elementList));
        }

    }
}