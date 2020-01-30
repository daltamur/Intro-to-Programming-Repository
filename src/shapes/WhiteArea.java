package shapes;
import shapes.SCircle;
import shapes.SRectangle;
import shapes.SSquare;
import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;

public class WhiteArea {
    public static void main(String[] args) {

        // Values
       double edgeLength=.75;
       double dotDiameter = (edgeLength*.125);

       //Shapes
       SSquare dieFace=new SSquare(edgeLength);
       SCircle dieDot= new SCircle(dotDiameter/2);

       //Math
       double totalDieArea=dieFace.area()*6;
       double totalDotArea=dieDot.area()*21;
       double totalWhiteArea=(totalDieArea-totalDotArea);

       //Print Statement
        System.out.println("Each face of the die has an area of "+dieFace.area()+ " mm^2");
        System.out.println("Each dot has an area of "+dieDot.area()+" mm^2");
        System.out.println("The total area of the die is "+totalDieArea+" mm^2");
        System.out.println("The total area of the dots is "+ totalDotArea+" mm^2");
        System.out.println("The remaining area of the die when the area of the dots is taken away from it is "+totalWhiteArea+ " mm^2");







    }
}
