/*
 * A target you fucking amature
 */

package npw;

import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

public class Target {

    // Solution to target
    private void paintTheImage() {
        SPainter bruhmoment = new SPainter("Target" ,600,600);
        SCircle dot = new SCircle(200);
        bruhmoment.setColor(Color.RED);
        bruhmoment.paint(dot);
        dot.shrink(68);
        bruhmoment.setColor(Color.WHITE);
        bruhmoment.paint(dot);
        dot.expand(68);
        dot.shrink(134);
        bruhmoment.setColor(Color.RED);
        bruhmoment.paint(dot);
        dot.expand(134);
    }
    // REQUIRED INFRASTRUCTURE

    public Target() {paintTheImage();
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() { new Target();}
        });
    }
}



