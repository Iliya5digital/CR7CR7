import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        int sum=0;
        int maxNum =Integer.MIN_VALUE;
        int minNum =Integer.MAX_VALUE;
        for (int i=1;i<=n;i++){
             int input =Integer.parseInt(scan.nextLine()) ;
             sum+=input;
             if(input>= maxNum){
                 maxNum=input;
             }
             if(input<=minNum){
                minNum=input;
             }
        }
        double average = (double) sum / n;
        System.out.printf("min = %d%n",minNum);
        System.out.printf("max = %d%n",maxNum);
        System.out.printf("sum = %d%n",sum);
        System.out.printf("avg = %.2f%n",average);



    }
}
