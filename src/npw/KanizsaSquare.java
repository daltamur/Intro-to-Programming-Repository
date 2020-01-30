/*
 *Program to paint a blue dot in the context of the Nonrepresentational Painting World, NPW
 */

package npw;

import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

public class KanizsaSquare {

    // THE SOLUTION TO THE BLUE DOT PROBLEM
    private void paintTheImage() {
        SPainter bruhmoment = new SPainter("Kanizsa Square" ,400,400);

        SCircle dot = new SCircle(75);
        paintBlueCircle(bruhmoment,dot);
        paintRedCircle(bruhmoment,dot);
        paintGreenCircles(bruhmoment,dot);

        SSquare square= new SSquare(200);
        paintWhiteSquare(bruhmoment,square);


    }

    private void paintWhiteSquare(SPainter bruhmoment, SSquare square) {
        bruhmoment.setColor(Color.WHITE);
        bruhmoment.paint(square);

    }

    private void paintGreenCircles(SPainter bruhmoment, SCircle dot) {
        bruhmoment.setColor(Color.GREEN);
        bruhmoment.mfd(100);
        bruhmoment.mrt(100);
        bruhmoment.paint(dot);
        bruhmoment.mbk(200);
        bruhmoment.mlt(200);
        bruhmoment.paint(dot);
        bruhmoment.mrt(100);
        bruhmoment.mfd(100);

    }
    private void paintRedCircle(SPainter bruhmoment, SCircle dot) {
        bruhmoment.setColor(Color.RED);
        bruhmoment.mbk(100);
        bruhmoment.mrt(100);
        bruhmoment.paint(dot);
        bruhmoment.mlt(100);
        bruhmoment.mfd(100);

    }

    private void paintBlueCircle(SPainter bruhmoment, SCircle dot) {
        bruhmoment.setColor(Color.BLUE);
        bruhmoment.mlt(100);
        bruhmoment.mfd(100);
        bruhmoment.paint(dot);
        bruhmoment.mbk(100);
        bruhmoment.mrt(100);
    }
    // REQUIRED INFRASTRUCTURE

    public KanizsaSquare() {
        paintTheImage();
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new KanizsaSquare();
            }
        });
    }
}