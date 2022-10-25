import java.util.Arrays;
import java.util.Scanner;


public class TitleSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            char[] currentWord = scan.nextLine().toCharArray();
            char[] copyOfTitle =title.toCharArray();
            boolean contains = true;
            int index = 0;
            for (char letter : currentWord) {
                for (int j = index; j < copyOfTitle.length; j++) {
                    if (letter == copyOfTitle[j]) {
                        index = j;
                        copyOfTitle[j] = ' ';
                        contains = true;
                        break;
                    } else {
                        contains = false;
                    }
                }
            }

            title = contains ? String.valueOf(copyOfTitle).replaceAll("\\s","") : title;
            System.out.println(contains ? title : "No such title found!");
        }
    }
}