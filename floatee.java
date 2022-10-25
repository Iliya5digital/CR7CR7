import java.util.Scanner;
class FloatingNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            double eps = 0.000001;
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());

            if (Math.abs(a-b) < eps){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }
