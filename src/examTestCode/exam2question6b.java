package examTestCode;

import java.util.ArrayList;
import java.util.Scanner;

public class exam2question6b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        System.out.println("Which index in the array do you want printed?");
        String command = scanner.next();
        interpretPrintCommand(command, numbers);
    }

    public static void interpretPrintCommand(String command, int[] numbers) {
if (command.equalsIgnoreCase("First")){
            System.out.println(numbers[0]);
        } else if (command.equalsIgnoreCase("Last")) {
            System.out.println(numbers[numbers.length - 1]);
        } else{
            int commandNumber=Integer.valueOf(command);
            if (commandNumber <= numbers.length ){
                System.out.println(numbers[commandNumber - 1]);
            } else if(commandNumber<0){
           System.out.println("Index outside of array range...");
        } else{
                System.out.println("Index outside of array range...");
            }
        }

    }
}