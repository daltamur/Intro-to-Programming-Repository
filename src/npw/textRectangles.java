package npw;

import java.util.Scanner;

public class textRectangles {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many columns?");
        int columns=scanner.nextInt();
        System.out.println("How many rows?");
        int rows=scanner.nextInt();
        drawRectangle(rows, columns);

    }

    private static void drawRectangle(int rows, int columns) {
        int i=1;
        while (i<=rows) {
            drawOneRow(columns);
            i=i+1;
        }
    }

    private static void drawOneRow(int columns) {
        String characterz = "";
        for (int i = 1; i <= columns; i++) {
            characterz += "*";
        }
        System.out.println(characterz);
    }


}
