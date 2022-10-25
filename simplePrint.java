public static int sum(int i1, int i2) {
 2 int result = 0;
 3 for (int i = i1; i <= i2; i++)
 4 result += i;
 5
 6 return result;
 7 }
 8
 9 public static void main(String[] args) {
10 System.out.println("Sum from 1 to 10 is " + sum(1, 10));
11 System.out.println("Sum from 20 to 37 is " + sum(20, 37));
12 System.out.println("Sum from 35 to 49 is " + sum(35, 49));
13 }
