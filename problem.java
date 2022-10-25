import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //your code here
        float num1 =Float.parseFloat(scanner.nextLine());
        float num2 =Float.parseFloat(scanner.nextLine());
        float num3 =Float.parseFloat(scanner.nextLine());
		multi(num1,num2,num3);
        
        
    }
  private static void multi (float num1,float num2, float num3){
     float product =num1*num2*num3;
        if (product < 0){
            System.out.println("negative");
        } else if (product >0){
            System.out.println("positive");

        } else if(product ==0){
            System.out.println("zero");
        }
        
  }
}