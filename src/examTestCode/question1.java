package examTestCode;
import java.sql.SQLOutput;
import java.util.Scanner;
import shapes.SCircle;
import shapes.SRectangle;
import shapes.SSquare;
import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingUtilities;
import painter.SPainter;

public class question1 {
    public static void main(String [] args) {
        Scanner scanner=new Scanner(System.in);
        int he=scanner.nextInt();
        int we=scanner.nextInt();
        double dc=scanner.nextDouble();
        double hc=scanner.nextDouble();
        System.out.println("The height of the envelope= "+ he);
        System.out.println("The width of the envelope="+ we);
        double average=((he+we)/2);
        if (he>we){
            System.out.println(he);
        } else {
            System.out.println(we);
        }
        if(he>we){
            System.out.println(he);
            System.out.println(we);
        } else {
            System.out.println(we);
            System.out.println(he);
        }
        SRectangle envelope=new SRectangle(he,we);
        SCircle cc= new SCircle((envelope.diagonal()/2));
        SPainter jerry=new SPainter("canvas",500,500);
        jerry.setColor(Color.green);
        jerry.paint(cc);
        jerry.setColor(Color.black);
        jerry.paint(envelope);
        SCircle top=new SCircle((dc/2));
        SRectangle Side=new SRectangle(top.perimeter(),hc);
        double surfaceArea=((Side.area())+(2*top.area()));
        SSquare logo=top.inscribingSquare();
        double silverArea=((top.area()-logo.area()));
        System.out.println(silverArea);
        int crypto=(9-((8-6)+5));
        System.out.println(crypto);

    }
}
