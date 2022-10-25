import java.util.Scanner;
class Program {
    static void Main(string[] args) {
        Scanner sc =new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int n3 = 1;
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            System.out.println(1 + " ");
        }
        for (int i = n; i > 1; --i) {
            int num = n1 + n2 + n3;
            System.out.println(num + " ");
            n1 = n2;
            n2 = n3;
            n3 = num;
        }
    }
}