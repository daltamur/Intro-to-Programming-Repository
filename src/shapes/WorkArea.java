package shapes;
import shapes.SCircle;
import shapes.SRectangle;
import shapes.SSquare;
import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;


public class WorkArea {
    public static void main(String[] args) {
        //values
        int deskDepth= 24;
        int deskWidth= 36;
        double bookLength=8.5;
        int bookWidth=11;
        double cupRadius= 1.35;
        int plateRadius= 8;

        //Objects:
        SRectangle deskArea= new SRectangle(deskDepth,deskWidth);
        SRectangle books= new SRectangle(bookLength,bookWidth);
        SCircle cup= new SCircle(cupRadius);
        SCircle plate= new SCircle(plateRadius);
        SSquare coaster= new SSquare(2*cup.radius());

       //Math
        double objectArea=((3*plate.area())+(2* books.area())+(3*coaster.area()));
        double remainingArea=(((deskArea.area())-(objectArea)));


        System.out.println("The remaining area of the desk is "+remainingArea+" in.^2");



    }

}
