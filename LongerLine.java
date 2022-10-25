// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.lang.*;
class LongerLine {
    private static double lineLength (double x1, double y1, double x2, double y2)
        {
            return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        }
 
       private  static double distanceToCenter(double x, double y)
        {
            return Math.sqrt(Math.pow((0 - x), 2) + Math.pow((0 - y), 2));
        }
 
        private static void printClosestPointFirst(double x1, double y1, double x2, double y2)
        {
            if (distanceToCenter(x1, y1) > distanceToCenter(x2, y2))
            {
                System.out.print("(" + x2 + ", " + y2 + ")");
                System.out.println("(" + x1 + ", " + y1 + ")");
            }
            else
            {
                System.out.print("(" + x1 + ", " + y1+")");
                System.out.println("(" + x2 + ", " + y2 + ")");
            }
        }
 
        private static void printLongerLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
        {
            if (lineLength(x1, y1, x2, y2) >= lineLength(x3, y3, x4, y4))
            {
                printClosestPointFirst(x1, y1, x2, y2);
            }
            else if (lineLength(x1, y1, x2, y2) < lineLength(x3, y3, x4, y4))
            {
                printClosestPointFirst(x3, y3, x4, y4);
            }
        }
    public static void main(String[] args) {
       
            Scanner scan=new Scanner(System.in);
            double point1X = Double.parseDouble(scan.nextLine());
            double point1Y = Double.parseDouble(scan.nextLine());
            double point2X = Double.parseDouble(scan.nextLine());
            double point2Y = Double.parseDouble(scan.nextLine());
            double point3x = Double.parseDouble(scan.nextLine());
            double point3Y = Double.parseDouble(scan.nextLine());
            double point4X = Double.parseDouble(scan.nextLine());
            double point4Y = Double.parseDouble(scan.nextLine());
 
            printLongerLine(point1X, point1Y, point2X, point2Y, point3x, point3Y, point4X, point4Y);
        
    }
}