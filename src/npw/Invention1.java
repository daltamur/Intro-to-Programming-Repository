package npw;

import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import java.awt.*;
import java.util.Random;

import static java.awt.Color.*;

public class Invention1 {
    public static void main(String[] args) {
        SPainter painter = new SPainter("Canvas", 800, 800);
        SCircle outerCircle = new SCircle(300);
        SSquare outerSquare = outerCircle.circumscribingSquare();
        outerCircle.x2();
        painter.setColor(black);
        painter.paint(outerCircle);
        outerCircle.s2();
        int x = 0;
        int y=0;
        while (y<=360) {
            if (y < 120) {
                painter.setColor(blue);
                painter.paint(outerCircle);
            } else if (y <= 240) {
                outerCircle.s2();
                painter.setColor(green);
                painter.paint(outerCircle);
                outerCircle.x2();
            } else if (y > 240) {
                outerCircle.s3();
                painter.setColor(red);
                painter.paint(outerCircle);
                outerCircle.x3();
            }
            y = y + 1;
        }

        while (x <= 180) {
            if (x <= 60) {
                painter.setColor(red);
                painter.draw(outerSquare);
                painter.setHeading(x+2);
            } else if (x <= 120) {
                outerSquare.s2();
                painter.setColor(green);
                painter.draw(outerSquare);
                painter.setHeading(x+2);
                outerSquare.x2();
            } else if (x > 120) {
                outerSquare.s3();
                painter.setColor(blue);
                painter.draw(outerSquare);
                painter.setHeading(x+2);
                outerSquare.x3();
            }
            x=x+1;

        }
    }
}
