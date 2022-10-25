import java.util.Scanner;
public class SortThreeNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int biggest = 0;
        int smallest = 0;
        int medium = 0;

        if (a >= b && a >= c) {
            biggest = a;
            if (b >= c) {
                medium = b;
                smallest = c;
            } else {
                medium = c;
                smallest = b;
            }
        } else if (b >= a && b >= c) {
            biggest = b;
            if (a >= c) {
                medium = a;
                smallest = c;
            } else {
                medium = c;
                smallest = a;
            }
        } else if (c >= a && c >= b) {
            biggest = c;
            if (a >= b) {
                medium = a;
                smallest = b;
            } else {
                medium = b;
                smallest = a;
            }
        }
        System.out.printf("%d%n %d%n %d%n",biggest,medium,smallest);
    }
}
