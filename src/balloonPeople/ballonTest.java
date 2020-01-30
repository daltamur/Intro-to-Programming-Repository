package balloonPeople;

import painter.SPainter;

public class ballonTest {
    public static void main(String[] args){
        balloonPerson test=new balloonPerson("Jerry",20,50);
        SPainter painter=new SPainter("Canvas",500,500);
        test.paint(painter);
    }
}
