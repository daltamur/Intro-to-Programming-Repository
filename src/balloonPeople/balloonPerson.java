package balloonPeople;

import painter.SPainter;
import shapes.SCircle;

import java.awt.*;
import java.util.Random;

public class balloonPerson {
   //Instance Variables
    private String name;
    private int age;
    private int height;
    private Color color;

    //Constructor
    public balloonPerson(String name, int age, int height){
        this.name=name;
        this.age=age;
        this.height=height;
        this.color=randomColor();
    }

    private Color randomColor() {
        Random rgen=new Random();
        int r=rgen.nextInt(256);
        int g=rgen.nextInt(256);
        int b=rgen.nextInt(256);
        Color color=new Color(r,g,b);
        return color;
    }

    //Methods
    public String toString(){
        String representation=("Name: "+name+" age:"+age+" height:"+height+" color:"+color);
        return representation;
    }
    public void paint(SPainter painter){
        painter.setColor(color);
        SCircle circle=new SCircle(10);
        painter.mbk(height/4);
        painter.mlt(5);
        painter.paint(circle);
        painter.mrt(10);
        painter.paint(circle);
        painter.mlt(5);
        painter.mfd(height/4);
        circle=new SCircle(5);
        painter.paint(circle);
        painter.mlt(4);
        painter.mfd(4);
        painter.paint(circle);
        painter.mbk(4);
        painter.mrt(8);
        painter.mfd(4);
        painter.paint(circle);
        painter.mbk(4);
        painter.mlt(4);
        painter.mfd(height/2);
        circle=new SCircle(15);
        painter.paint(circle);


    }
}
