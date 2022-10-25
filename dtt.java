import java.util.Scanner;
class Add{ 
    Scanner scan =new Scanner(System.in);
    
    public static void main(String[] args){ 
        Scanner scan =new Scanner(System.in);
        String command =scan.nextLine();
        String input =scan.nextLine();
        switch (command){
            case "int":
                int number = Integer.parseInt(input);
               add(number);
                break;
            case "real":
                double num = Double.parseDouble(input);
                add (num);
                break;
            case "string":
                add (input); 
                break;
        }
        
              

} 

private static void add(int number){
     
                
                number*=2;
                System.out.println(number);
    
    
}  
private static void add(double num){
    
    num*=1.50;
    System.out.printf("%.2f",num);
    
}  
private static void add(String input){
        
 
        System.out.printf("$%s$",input);
}

}  

