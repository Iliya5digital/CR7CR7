import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size()-1; i++) {
            //make two variables
            double currentNum= numbersList.get(i);
            double nextNum =numbersList.get(i+1);
            if(currentNum == nextNum){
                numbersList.set(i,currentNum + nextNum);
                numbersList.remove(i+1);

            }
        }
        System.out.println(joinItems(numbersList," "));


    }
    
    public static String joinItems(List<Double>list,String delimeter) {
        DecimalFormat df =new DecimalFormat("0.#");
        String result =" ";
        for (double item:list) {
            String numDf =df.format(item) + delimeter;
            result+=numDf;
            
        }
        return result;
    }
}