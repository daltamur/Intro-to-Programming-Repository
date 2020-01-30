/*
 *Program to paint a blue dot in the context of the Nonrepresentational Painting World, NPW
 */

package npw;

import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

public class BlueDot {

        // THE SOLUTION TO THE BLUE DOT PROBLEM
    private void paintTheImage() {
        SPainter bruhmoment = new SPainter("Blue Dot" ,600,600);
        SCircle dot = new SCircle(200);
        bruhmoment.setColor(Color.BLUE);
        bruhmoment.paint(dot);
    }
    // REQUIRED INFRASTRUCTURE

    public BlueDot() {
        paintTheImage();
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BlueDot();
            }
        });
    }
}
