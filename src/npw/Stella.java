package npw;
import painter.SPainter;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Stella {
    public static void main(String[] args){
        SPainter painter=new SPainter("Canvas",800,800);
        Color color1=randomColor();
        Color color2=randomColor();
        double amountOfSquares=getNumber("How many squares are there");
        SSquare square=new SSquare(700);
        painter.paint(squares(painter,color1,color2,amountOfSquares,square));



    }

    private static SSquare squares(SPainter painter, Color color1, Color color2, double amountOfSquares, SSquare square) {
        double longestSide=700.0;
        double x=amountOfSquares;
        double sideLength=0;
        while (x>0){
                if (x>1) {
                    painter.setColor(color1);
                    sideLength = (longestSide * (x / amountOfSquares));
                    square = new SSquare(sideLength);
                    painter.paint(square);
                    painter.setColor(color2);
                    sideLength = (longestSide * ((x - 1) / amountOfSquares));
                    square = new SSquare(sideLength);
                    painter.paint(square);
                }
                else if(x==1){
                    painter.setColor(color1);
                    sideLength=longestSide*(1/amountOfSquares);
                    square=new SSquare(sideLength);
                    painter.paint(square);
                }

            x=x-2;
        }
        return square;
    }

    private static Color randomColor() {
        Random rgen=new Random();
        int r=rgen.nextInt(256);
        int g =rgen.nextInt(256);
        int b=rgen.nextInt(256);
        return new Color(r,g,b);
    }

    private static double getNumber(String s) {
        String squares= JOptionPane.showInputDialog(null,s+"?");
        Scanner scanner=new Scanner(squares);
        return scanner.nextDouble();
    }
}
