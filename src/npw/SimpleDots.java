package npw;

import painter.SPainter;
import shapes.SCircle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class SimpleDots {  private void paintTheImage(){
    //Get the input info
    int radius=getNumber("circle radius");
    int dotRadius=getNumber("dot radius");
    Color dotColor=ColorInput("Red, Green, or Blue Dots?");



    //Establish the painter
    SPainter painter=new SPainter("Circle of Squares", radius*2+50, radius*2+50);
    painter.setBrushWidth(3);
    SCircle circle=new SCircle(radius);
    SCircle dot=new SCircle(dotRadius);

    //Paint the squares
    paintCircleOfDots(painter,circle,dot, dotColor);
}

    private Color ColorInput(String dotColor) {
        Color color=new Color(0,0,0);
        String colorInput=JOptionPane.showInputDialog(null,dotColor);
        if (colorInput==null){
            color=Color.black;
        }
        else if (colorInput.equalsIgnoreCase("red")){
            color=Color.RED;
        }
        else if (colorInput.equalsIgnoreCase("blue")){
            color=Color.blue;
        }
        else if (colorInput.equalsIgnoreCase("green")){
            color=Color.GREEN;
        }
        return color;

    }

    private static int getNumber(String prompt) {
        String nss= JOptionPane.showInputDialog(null,prompt+"?");
        Scanner scanner=new Scanner(nss);
        return scanner.nextInt();
    }

    private void paintCircleOfDots(SPainter painter, SCircle circle, SCircle dot, Color color) {
        //Position the painter to begin the rows
        painter.mfd(circle.radius());
        painter.tr();
        //Paint the circle of squares
        double moved=0;
        while (moved<circle.diameter()){
            double chord=chordLength(circle.radius()-moved,circle);
            int dots=DotsOnLineCount(chord, dot.diameter());
            paintRow(painter, dot, dots, color);
            nextRow(painter,dot.diameter());
            moved=moved+dot.diameter();
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

    private int DotsOnLineCount(double lineLength, double sideLength) {
        int dots=((int)Math.ceil((lineLength-sideLength)/sideLength)+1);
        return dots;
    }

    //Assumes the painter is at the center of the row to paint, facing right.
    private void paintRow(SPainter painter, SCircle dot, int squaresToPaint, Color color) {
        //Move backward 1/2 the length we're painting to get ready to paint the row
        double centerOffset=((squaresToPaint*dot.diameter())/2)-dot.diameter()/2;
        painter.mbk(centerOffset);

        //Paint the row of squares
        int painted=0;
        while (painted<squaresToPaint){
            paintOneDot(painter,dot,color);
            painter.mfd(dot.diameter());
            painted=painted+1;
        }
        //Make the method invariant with respect to the painter position
        painter.mbk((centerOffset+dot.diameter()));
    }

    private void paintOneDot(SPainter painter, SCircle dot, Color color) {
        dot.s2();
        painter.setColor(color);
        painter.paint(dot);
        dot.x2();
    }



    private void nextRow(SPainter painter, double rowHeight) {
        painter.tr();
        painter.mfd(rowHeight);
        painter.tl();
    }

    public SimpleDots() {paintTheImage();}

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {new SimpleDots();}
        });
    }
}
