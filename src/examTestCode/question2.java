package examTestCode;

import shapes.SSquare;
import shapes.SCircle;
import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;
import painter.SPainter;

public class question2 {
    public static void main(String[] args) {
        SSquare bigOne=new SSquare(48.3);
        double yellowSquareDiagonal=((bigOne.side()-(5.4*2)));
        SCircle yellow =new SCircle((yellowSquareDiagonal/2));
        SSquare yellowSquare=yellow.inscribingSquare();
        double grayArea=(bigOne.area()-yellowSquare.area());
        System.out.println("The gray area in the image is "+grayArea);
        SPainter jerry=new SPainter("canvas",100,100);
        jerry.setColor(Color.GRAY);
        jerry.paint(bigOne);
        jerry.setColor(Color.YELLOW);
        jerry.setHeading(45);
        jerry.paint(yellowSquare);

    }
}
