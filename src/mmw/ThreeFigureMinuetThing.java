/*
 * Nine note line created by joining three JSB minuet figures.
 */
package mmw;
import composer.SComposer;
import note.Note;
import note.SNote;

public class ThreeFigureMinuetThing {
    public static void main(String[] args) {
        SNote jerry=new SNote();
        jerry.text();
        jerry.play();jerry.lp();jerry.play();jerry.lp();jerry.play();jerry.rp(2);
        System.out.println(" ");
        jerry.s2();jerry.play();jerry.lp(1);jerry.play();jerry.lp();jerry.play();jerry.rp();jerry.play();jerry.x2();jerry.rp();jerry.play();
        System.out.println(" ");
        jerry.x3();jerry.play();


    }
}