package npw;

import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AlternateBalloons {

    //Required Infrastructure
    public AlternateBalloons() {
        paintTheImage();
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AlternateBalloons();
            }
        });
    }

    //The painter doing its thing
    private void paintTheImage() {
        SPainter painter=new SPainter("Balloons",600,600);
        paintSky(painter); //ask Intellij to gernerate the stub
        int nrOfBalloons=300;
        paintBalloons(painter, nrOfBalloons);
    }

    private void paintSky(SPainter painter) {
        painter.setColor(Color.BLUE);
        SSquare sky=new SSquare(2000);
        painter.paint(sky);
    }

    private void paintBalloons(SPainter painter, int nrOfBalloons) {
        int i=1;
        while(i<=nrOfBalloons) {
            paintOneBalloon(painter);
            i=i+1;

        }
    }

    private void paintOneBalloon(SPainter painter) {
        Random rgen=new Random();
        int rn=rgen.nextInt(5);
        if (rn==0){
            painter.setColor(Color.RED);
        } else if(rn==1){
            painter.setColor(Color.ORANGE);
        } else if (rn==2) {
            painter.setColor(Color.YELLOW);
        } else if (rn==3) {
            painter.setColor(Color.GREEN);
        } else if (rn==4) {
            painter.setColor(Color.WHITE);
        } else if (rn==5) {
            painter.setColor(Color.CYAN);
        }
        painter.move();
        int balloonRadius=30;
        SCircle balloon=new SCircle(balloonRadius);
        painter.paint(balloon);
        painter.setColor(Color.BLACK);
        painter.draw(balloon);
    }
}

