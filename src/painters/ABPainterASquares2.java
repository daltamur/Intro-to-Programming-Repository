/**
 * Subclass of the ABPainter Class rendering images based on squares kinda looking like melting towers in terms of the symbols A and B.
 */
package painters;

import painter.SPainter;
import shapes.SSquare;

import java.awt.*;
import java.util.Random;

public class ABPainterASquares2 extends ABPainter {

    /**
     * Create a specialization of an ABPainter which renders odd looking tower-like structures in red and blue.
     * SPainter painter is the work horse painter.
     */
    public ABPainterASquares2(SPainter painter){
        super(painter);
        painter.mbk(20);
        painter.tl(3);
    }

    static private double distance=6;
    static private int delta=2;
    static private Random random =new Random();
    SSquare square=new SSquare(150);

    /**
     * Drawing a red square and adusting its position and shrinking it and altering its position and heading.
     */
    public void thingA(){
        painter.setColor(Color.RED);
        painter.paint(square);
        painter.mfd(distance);
        square.shrink(delta);
        painter.tl(4);
    }

    /**
     * Same thing as above but the square is blue.
     */
    public void thingB(){
        painter.setColor(Color.BLUE);
        painter.paint(square);
        painter.mfd(distance);
        square.shrink(delta);
        painter.mfd(6);
    }
}
