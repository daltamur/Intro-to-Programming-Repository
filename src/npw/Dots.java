package npw;

import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

public class Dots {


    // THE SOLUTION TO THE BLUE DOT PROBLEM
    private void paintTheImage() {
        SPainter bruhmoment = new SPainter("Dots" ,1000,1000);
        SCircle dot = new SCircle(50);
        paintCyanDot(bruhmoment,dot);
        paintBlueDotOne(bruhmoment,dot);
        paintBlueDotTwo(bruhmoment,dot);
        paintBlackDotOne(bruhmoment,dot);
        paintBlackDotTwo(bruhmoment,dot);
        paintRedDotOne(bruhmoment,dot);
        paintRedDotTwo(bruhmoment,dot);
        paintGreenDotOne(bruhmoment,dot);
        paintGreeDotTwo(bruhmoment,dot);



    }

    private void paintCyanDot(SPainter bruhmoment, SCircle dot) {
        bruhmoment.setColor(Color.CYAN);
        bruhmoment.paint(dot);
    }

    private void paintBlueDotOne(SPainter bruhmoment, SCircle dot) {
        bruhmoment.setColor(Color.BLUE);
        dot.setRadius(92);
        bruhmoment.mfd(200);
        bruhmoment.paint(dot);
        bruhmoment.mbk(200);
    }

    private void paintBlueDotTwo(SPainter bruhmoment, SCircle dot) {
        bruhmoment.mbk(200);
        bruhmoment.paint(dot);
        bruhmoment.mfd(200);
    }

    private void paintBlackDotOne(SPainter bruhmoment, SCircle dot) {
        bruhmoment.setColor(Color.BLACK);
        dot.setRadius(34);
        bruhmoment.mlt(84);
        bruhmoment.mfd(62);
        bruhmoment.paint(dot);
        bruhmoment.mrt(84);
        bruhmoment.mbk(62);


    }

    private void paintBlackDotTwo(SPainter bruhmoment, SCircle dot) {
        bruhmoment.mrt(84);
        bruhmoment.mfd(62);
        bruhmoment.paint(dot);
        bruhmoment.mlt(84);
        bruhmoment.mfd(62);
    }

    private void paintRedDotOne(SPainter bruhmoment, SCircle dot) {
        bruhmoment.setColor(Color.RED);
        dot.setRadius(23);
        bruhmoment.mrt(84);
        bruhmoment.mbk(200);
        bruhmoment.paint(dot);
        bruhmoment.mlt(84);
        bruhmoment.mfd(200);
    }

    private void paintRedDotTwo(SPainter bruhmoment, SCircle dot) {
        bruhmoment.mlt(84);
        bruhmoment.mbk(200);
        bruhmoment.paint(dot);
        bruhmoment.mrt(84);
        bruhmoment.mfd(200);
    }

    private void paintGreenDotOne(SPainter bruhmoment, SCircle dot) {
       bruhmoment.setColor(Color.GREEN);
        dot.setRadius(75);
        bruhmoment.mlt(250);
        bruhmoment.paint(dot);
        bruhmoment.mrt(250);
    }

    private void paintGreeDotTwo(SPainter bruhmoment, SCircle dot) {
        bruhmoment.mrt(250);
        bruhmoment.paint(dot);
        bruhmoment.mlt(250);
    }


    // REQUIRED INFRASTRUCTURE

    public Dots() {
        paintTheImage();
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Dots();
            }
        });
    }
}
