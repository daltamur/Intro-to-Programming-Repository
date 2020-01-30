package npw;
import painter.SPainter;
import shapes.SRectangle;

import java.awt.*;
import java.util.Random;

public class Invention2 {
    public static void main(String[] args){
        int x;
        Random width=new Random();
        int y;
        int z=0;
        SPainter painter=new SPainter("Messy Papers",800,800);
        while (z<=50){
            x=randomNumber();
            y=randomNumber();
            SRectangle rectangle=new SRectangle(x,y);
            painter.setColor(randomColor());
            if(rectangle.area()>180000){
                painter.setColor(randomColor());
                painter.setHeading(randomHeading());
            } else if(rectangle.area()<2000000){
                painter.setHeading(0);
            };
            painter.paint(rectangle);
            painter.move();
            z=z+1;
        }

    }

    private static double randomHeading() {
        Random heading=new Random();
        double i=heading.nextInt(360);
        return i;

    }

    private static int randomNumber() {
        Random number=new Random();
        int x=number.nextInt(600);
        return x;
    }

    private static Color randomColor() {
        Random rgen=new Random();
        int r=rgen.nextInt(256);
        int g =rgen.nextInt(256);
        int b=rgen.nextInt(256);
        return new Color(r,g,b);
    }
}
