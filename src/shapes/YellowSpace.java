package shapes;
import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

public class YellowSpace {
    public static void main(String[] args) {

        //Values
        int bigGraySideLength = 400;
        int distanceBtwnBigGrayAndYellowCorners = 60;
        int distanceBtwnSmallGraySquareAndYellowEdgeMdpnt = 30;
        int distanceBtwnSmallYellowAndSmallGray = 15;

        //Shapes
        int bigYellowCircleRadius = ((bigGraySideLength - (2 * distanceBtwnBigGrayAndYellowCorners)) / 2);
        SSquare bigGraySquare = new SSquare(bigGraySideLength);
        SCircle bigYellow = new SCircle(bigYellowCircleRadius);
        SSquare bigYellowSquare = bigYellow.inscribingSquare();
        double smallGrayCircleRadius = ((bigYellowSquare.side() - (2 * distanceBtwnSmallGraySquareAndYellowEdgeMdpnt)) / 2);
        SCircle smallGray = new SCircle(smallGrayCircleRadius);
        SSquare smallGraySquare = smallGray.inscribingSquare();
        double smallYellowCircleRadius = ((smallGraySquare.side() - (2 * distanceBtwnSmallYellowAndSmallGray)) / 2);
        SCircle smallYellow = new SCircle(smallYellowCircleRadius);
        SSquare smallYellowSquare = smallYellow.inscribingSquare();
        double totalYellowArea=((bigYellowSquare.area()-smallGraySquare.area())+smallYellowSquare.area());

        //Print Lines
        System.out.println("The area of the big gray square is "+ bigGraySquare.area()+ " mm^2");
        System.out.println("The area of the big yellow square is "+bigYellowSquare.area()+" mm^2");
        System.out.println("The area of the small gray square is "+smallGraySquare.area()+" mm^2");
        System.out.println("The area of the small yellow square is "+smallYellowSquare.area()+" mm^2");
        System.out.println("The total area of the yellow sections of the image is is "+totalYellowArea+" mm^2");





    }
    }
