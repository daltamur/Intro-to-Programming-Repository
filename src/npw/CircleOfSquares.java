/*
 *A program to paint, centered on the canvas, a circle of randomly colored, black-framed squares.
 */


package npw;
import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class CircleOfSquares {
    private void paintTheImage(){
        //Get the input info
        int radius=getNumber("circle radius");
        int side=getNumber("square side length");

        //Establish the painter
        SPainter painter=new SPainter("Circle of Squares", radius*2+50, radius*2+50);
        painter.setBrushWidth(3);
        SCircle circle=new SCircle(radius);
        SSquare square=new SSquare(side);

        //Paint the squares
        paintCircleOfSquares(painter,circle,square);
    }

    private static int getNumber(String prompt) {
        String nss=JOptionPane.showInputDialog(null,prompt+"?");
        Scanner scanner=new Scanner(nss);
        return scanner.nextInt();
    }

    private void paintCircleOfSquares(SPainter painter, SCircle circle, SSquare square) {
        //Position the painter to begin the rows
        painter.mfd(circle.radius());
        painter.tr();
        //Paint the circle of squares
        double moved=0;
        while (moved<circle.diameter()){
            double chord=chordLength(circle.radius()-moved,circle);
            int squares=squaresOnLineCount(chord, square.side());
            paintRow(painter, square, squares);
            nextRow(painter,square.side());
            moved=moved+square.side();
        }
        //Make the method invariant with respect to painter position
        painter.tl();
        painter.mfd(circle.radius());
    }

    private double chordLength(double yOffset, SCircle circle) {
        double xLength=Math.sqrt(Math.pow(circle.radius(), 2)-Math.pow(yOffset,2));
        double chordLength=xLength*2;
        return chordLength;
    }

    private int squaresOnLineCount(double lineLength, double sideLength) {
        int squares=((int)Math.ceil((lineLength-sideLength)/sideLength)+1);
        return squares;
    }

    //Assumes the painter is at the center of the row to paint, facing right.
    private void paintRow(SPainter painter, SSquare square, int squaresToPaint) {
        //Move backward 1/2 the length we're painting to get ready to paint the row
        double centerOffset=((squaresToPaint*square.side())/2)-square.side()/2;
        painter.mbk(centerOffset);

        //Paint the row of squares
        int painted=0;
        while (painted<squaresToPaint){
            paintOneSquare(painter,square);
            painter.mfd(square.side());
            painted=painted+1;
        }
        //Make the method invariant with respect to the painter position
        painter.mbk((centerOffset+square.side()));
    }

    private void paintOneSquare(SPainter painter, SSquare square) {
        painter.setColor(randomColor());
        painter.paint(square);
        painter.setColor(Color.BLACK);
        painter.draw(square);
    }

    private static Color randomColor() {
        Random rgen=new Random();
        int r=rgen.nextInt(256);
        int g =rgen.nextInt(256);
        int b=rgen.nextInt(256);
        return new Color(r,g,b);
    }

    private void nextRow(SPainter painter, double rowHeight) {
        painter.tr();
        painter.mfd(rowHeight);
        painter.tl();
    }

    public CircleOfSquares() {paintTheImage();}

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {new CircleOfSquares();}
        });
    }
}


