import java.util.Scanner;

public class SMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pushTimes = Integer.parseInt(scanner.nextLine());
        String msg = " ";

        for (int i = 0; i < pushTimes; i++) {
            String input = scanner.nextLine();

            int numberOfDigits = input.length();
            char buttonNumber = input.charAt(0);
            switch (buttonNumber) {
                case '2':
                    if (numberOfDigits == 1) {
                        msg += "a";
                    } else if (numberOfDigits == 2) {
                        msg += "b";
                    } else if (numberOfDigits == 3) {
                        msg += "c";
                    }
                    break;
                case '3':
                    if (numberOfDigits == 1) {
                        msg += "d";
                    } else if (numberOfDigits == 2) {
                        msg += "e";
                    } else if (numberOfDigits == 3) {
                        msg += "f";
                    }
                    break;
                case '4':
                    if (numberOfDigits == 1) {
                        msg += "g";
                    } else if (numberOfDigits == 2) {
                        msg += "h";
                    } else if (numberOfDigits == 3) {
                        msg += "i";
                    }
                    break;
                case '5':
                    if (numberOfDigits == 1) {
                        msg += "j";
                    } else if (numberOfDigits == 2) {
                        msg += "k";
                    } else if (numberOfDigits == 3) {
                        msg += "l";
                    }
                    break;
                case '6':
                    if (numberOfDigits == 1) {
                        msg += "m";
                    } else if (numberOfDigits == 2) {
                        msg += "n";
                    } else if (numberOfDigits == 3) {
                        msg += "o";
                    }
                    break;
                case '7':
                    if (numberOfDigits == 1) {
                        msg += "p";
                    } else if (numberOfDigits == 2) {
                        msg += "q";
                    } else if (numberOfDigits == 3) {
                        msg += "r";
                    } else if (numberOfDigits == 4) {
                        msg += "s";
                    }
                    break;
                case '8':
                    if (numberOfDigits == 1) {
                        msg += "t";
                    } else if (numberOfDigits == 2) {
                        msg += "u";
                    } else if (numberOfDigits == 3) {
                        msg += "v";
                    }
                    break;
                case '9':
                    if (numberOfDigits == 1) {
                        msg += "w";
                    } else if (numberOfDigits == 2) {
                        msg += "x";
                    } else if (numberOfDigits == 3) {
                        msg += "y";
                    } else if (numberOfDigits == 4) {
                        msg += "z";
                    }
                    break;
                default:
                   if (buttonNumber =='0'){
                       msg +=" ";
                   }
                    break;

            }

        }
        System.out.println(msg);
    }
}