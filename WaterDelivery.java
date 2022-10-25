import java.util.Scanner;

public class waterDelivery {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int  numLittleBottles = Integer.parseInt(scan.nextLine());
        int  numBigBottles = Integer.parseInt(scan.nextLine());
        int  capasityTruck = Integer.parseInt(scan.nextLine());
        int bigBottles = numBigBottles;
        while((bigBottles * 5) >  capasityTruck) {
            bigBottles--;
        }
        int neededLittleB = capasityTruck - (bigBottles * 5);
        if(numLittleBottles < neededLittleB)
        {
            System.out.println(-1);
        }
        else {
            System.out.println(neededLittleB);
        }

    }
}