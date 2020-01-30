/*
Subclass of the abstract ABPainter class rendering line images that look like ferns in terms of A and B symbols.
 */

package painters;

import java.awt.Color;
import painter.SPainter;

public class ABPainterALines extends ABPainter {
    /**
     * Create a specialization of an ABPainter which renders off looking ferns structures w/ red and blue limbs.
     */
    public ABPainterALines(SPainter painter){
        super(painter);
        painter.mbk(165);
    }

    static private double distance=90;
    static private int delta=45;

    /**
     * Draw a red branch, to the right, off of a bit of black trunk.
     */
    public void thingA(){
        painter.dfd(distance);
        painter.tr(delta);
        painter.setColor(Color.RED);
        painter.dfd(distance);
        painter.setColor(Color.BLACK);
        painter.mbk(distance);
        painter.tl(delta);
        painter.mbk(distance);
        painter.mfd(distance/10);
    }

    /**
     * Draw a blue branch, to the left, off of a bit of black trunk.
     */

    public void thingB(){
        painter.dfd(distance);
        painter.tl(delta);
        painter.setColor(Color.BLUE);
        painter.dfd(distance);
        painter.setColor(Color.BLACK);
        painter.mbk(distance);
        painter.tr(delta);
        painter.mbk(distance);
        painter.mfd(distance/10);
    }
}
