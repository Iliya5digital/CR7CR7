public class TestVoidMethod {
 2 public static void main(String[] args) {
 3 System.out.print("The grade is ");
 4 printGrade(78.5);
 5
 6 System.out.print("The grade is ");
 7 printGrade(59.5);
 8 }
 9
10 public static void printGrade(double score) { 
11 if (score >= 90.0) {
12 System.out.println('A');
13 }
14 else if (score >= 80.0) {
15 System.out.println('B');
16 }
17 else if (score >= 70.0) {
18 System.out.println('C');
19 }
20 else if (score >= 60.0) {
21 System.out.println('D');
22 }
23 else {
24 System.out.println('F');
25 }
26 }
27 } 
