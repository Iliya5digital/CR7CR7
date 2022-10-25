import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        StringBuilder result = new StringBuilder(" ");
        for (int i = 1; i <n ; i++) {
            result.append(i + " ");
        }
        for (int i =n;i>=1;i-=1){
            result.append(i + " ");



        }
        System.out.print(result);
    }

}
