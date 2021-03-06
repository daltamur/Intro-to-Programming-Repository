/*
This class serves to render images based on strings of As and Bs
this renderer is coded such that the rendering of each symbol is left unspecified. To complete the render, the methods thingA and thingB
must be specified. That is the job of the classes which extend this abstract class.
 */
package painters;

import java.awt.Color;
import painter.SPainter;
import java.util.Scanner;

public abstract class ABPainter {

    //The simple painter, with its canvas and everything else, is the sole variable of this class.

    protected SPainter painter;

    /**
     * Create an ABPainter, a painter which bases its work on strings of As and Bs. It is basically a simple painter
     * which processes the As and the Bs in the string, one at a time, by somehow graphically rendering them.
     * Painter P is the workhorse painter.
     */
    public ABPainter(SPainter p){
        painter=p;
        painter.setScreenLocation(25,25);
        painter.setVisible(true);
        painter.setColor(Color.BLACK);
    }

    /**
     * Paint an image by processing the given string of A and B symbols.
     * The line String is a string of As and Bs, presumably generated by some L-System.
     */

    public void paint(String line){
        Scanner symbolString=new Scanner(line);
        while (symbolString.hasNext() ){
            String symbol=symbolString.next();
            if(symbol.equals("A")){
                thingA();
            } else if(symbol.equals("B")){
                thingB();
            }
        }
    }
    /**
     * Reference to an encoding of what it means to render the A symbol graphically
     */
    public abstract void thingA();

    /**
     * Reference to an encoding of what it means to render the A symbol graphically
     */
    public abstract void thingB();
}
