/*
Subclass of ABPainter that renders "dots images" that look kinda like cones in terms of the symbols A and B
 */
package painters;

import java.awt.Color;
import java.util.Random;
import painter.SPainter;
import shapes.SCircle;

public class ABPainterACircles extends ABPainter{

    /**
     * Create the painter to make the dots
     */
    public ABPainterACircles(SPainter painter){
        super(painter);
        painter.mbk(60);
    }
    static private double distance=4;
    static private int delta=1;
    static private Random random=new Random();
    static private SCircle dot=new SCircle(160);

    /**
     * Draw a red dot, adjust the position of the painter, and shrink the dot
     */

    public void thingA(){
        painter.setColor(Color.RED);
        painter.paint(dot);
        painter.mfd(distance);
        dot.shrink(delta);
    }

    /**
     * Draw a blue dot, adjust the position of the painter, and shrink the dot.
     */
    public void thingB(){
        painter.setColor(Color.BLUE);
        painter.paint(dot);
        painter.mfd(distance);
        dot.shrink(delta);
    }
}
