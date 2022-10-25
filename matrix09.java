import java.util.Scanner;
public class Problem09 {
    public static <n> void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());

        for ( int i = 1; i <= n; i++) {
            String result = " ";
            for (int j = 1; j <= n; j++) {
                result += (i + j - 1);
            }
            System.out.println(result);
          }
       }



    }


