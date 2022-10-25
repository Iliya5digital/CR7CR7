import java.util.Arrays;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[] values = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isWave = false;

        for (int i = 1; i < values.length-1; i++) {
            int element=values[i];
            int previous=values[i-1];
            int next=values[i+1];
            if (i%2!=0){
                if ((element<previous) && (element<next)) {
                    isWave=true;
                }else{
                    isWave=false;
                    break;
                }
            }if(i%2==0){
                if ((element>previous)&&(element>next)) {
                    isWave=true;
                }else{
                    isWave=false;
                    break;
                }
            }

        }
        if(isWave){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
