import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String lineInput = scan.nextLine();
        while (!lineInput.equals("end")) {
            String[] commandArr = lineInput.split(" ");
            String command = commandArr[0];
            switch (command) {
                case "Contains":
                    int testNum = Integer.parseInt(commandArr[1]);
                    if (numbersList.contains(testNum)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandArr[1].equals("even")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 == 0) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                    }else if (commandArr[1].equals("odd")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 != 0) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();

                    break;
                case "Get sum":
                    int sum=0;
                    for (int i = 0; i <numbersList.size() ; i++) {
                        sum+= numbersList.get(i);
                    }
                    System.out.println(sum );
                    break;
                case "Filter":
                    String outputFilter = "";
                    int num = Integer.parseInt(commandArr[2]);
                    if (commandArr[1].equals("<")) {
                        for (Integer aList : numbersList) {
                            if (aList < num) {
                                outputFilter += String.valueOf(aList) + " ";

                            }
                        }
                        System.out.println(outputFilter);
                    } else if (commandArr[1].equals(">")) {
                        for (Integer aList : numbersList) {
                            if (aList > num) {
                                outputFilter += String.valueOf(aList) + " ";

                            }
                        }
                        System.out.println(outputFilter);
                    } else if (commandArr[1].equals(">=")) {
                        for (Integer aList : numbersList) {
                            if (aList >= num) {
                                outputFilter += String.valueOf(aList) + " ";

                            }
                        }
                        System.out.println(outputFilter);
                    } else if (commandArr[1].equals("<=")) {
                        for (Integer aList : numbersList) {
                            if (aList <= num) {
                                outputFilter += String.valueOf(aList) + " ";

                            }
                        }
                        System.out.println(outputFilter);
                    }
                        break;

                    }


                    lineInput = scan.nextLine();
            }

        }

    }


