package npw;

import painter.SPainter;
import shapes.SCircle;
import shapes.SRectangle;

import javax.swing.*;
import java.awt.*;


public class RedCross {

    // THE SOLUTION TO THE BLUE DOT PROBLEM
    private void paintTheImage() {
        SPainter bruhmoment = new SPainter("Red Cross" ,600,600);
        SRectangle cross = new SRectangle(500,100);
        bruhmoment.setColor(Color.RED);
        bruhmoment.paint(cross);
        bruhmoment.tl();
        bruhmoment.paint(cross);
    }
    // REQUIRED INFRASTRUCTURE

    public RedCross() {
        paintTheImage();
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RedCross();
            }
        });
    }
}
