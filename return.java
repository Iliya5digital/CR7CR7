public class ReturningMultipleValues {
   static int[] calculate(int a, int b){
      int[] result = new int[4];
      result[0] = a + b;
      result[1] = a - b;
      result[2] = a * b;
      result[3] = a / b;
      return result;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a: ");
      int a = sc.nextInt();
      
      System.out.println("Enter the value of b: ");
      int b = sc.nextInt();
      int[] result = calculate(a, b);
      
      System.out.println("Result of addition: "+result[0]);
      System.out.println("Result of subtraction: "+result[1]);
      System.out.println("Result of multiplication: "+result[2]);
      System.out.println("Result of division: "+result[3]);
   }
}