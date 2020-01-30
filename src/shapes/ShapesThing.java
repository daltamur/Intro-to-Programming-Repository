/*
 *Practice using computations to find the geometric values of shapes within java...
 */


package shapes;

import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SSquare;

public class ShapesThing {
    public static void main(String[] args) {
        SSquare square=new SSquare(400);
        System.out.println("square= " +square.toString());
        System.out.println(("area of square= "+square.area()));
        System.out.println("perimeter of square= "+square.perimeter());
        System.out.println(("diagonal of square=" +square.diagonal()));
        SCircle disk=square.inscribingCircle();
        System.out.println("disk= " + disk.toString());
        System.out.println("area of disk= " + disk.area());
        System.out.println("perimeter of disk= " + disk.perimeter());
        SSquare diamond=disk.inscribingSquare();
        System.out.println("diamond= " +diamond.toString());
        System.out.println("area of the diamond= " +diamond.area());
    }
}
