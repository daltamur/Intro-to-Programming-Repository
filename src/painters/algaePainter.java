package painters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.SwingUtilities;

import lsystem.LSystem;
import lsystem.Production;
import painter.SPainter;
import painters.ABPainter;
import painters.ABPainterACircles;
import painters.ABPainterASquares;
import painters.ABPainterALines;

public class algaePainter extends LSystem {

    public algaePainter(){
        super("Algae");
        axiom="A";
        productions=productions();
        interpreter();
    }

    private List<Production> productions(){
        Production p1=new Production("A", "A B");
        Production p2=new Production("B","A");
        ArrayList<Production> productions=new ArrayList<>();
        productions.add(p1);
        productions.add(p2);
        return productions;
    }

    private void interpreter(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Algae>>> ");
        String line=scanner.next();
        if(line.equalsIgnoreCase("exit")){
            System.exit(0);
        }else if(line.equalsIgnoreCase("generate")){
            generate();
        }else if(line.equalsIgnoreCase("paint")){
            paint();
        }else if(line.equalsIgnoreCase("dispose")){
            painter.end();
        }else if(line.equalsIgnoreCase("help")){
            help();
        }else if(line.equalsIgnoreCase("display")){
            System.out.print(toString());
        }else{
            System.out.println("Sorry, I don't recognize the command '"+line+"'.");
        }
        interpreter();
    }

    private static void help(){
        System.out.println("HELP- display this help menu to the standard output stream");
        System.out.println("DISPLAY-display the Algae L-System, vocabulary and axiom and productions");
        System.out.println("GENERATE-generate some number of generations, as specified by the user.");
        System.out.println("PAINT-paint a rendering of some generation pf the algae system");
        System.out.println("DISPOSE- get rid of the canvas on which the rendering was painted");
        System.out.println("EXIT-leave the program");
    }
    private SPainter painter;
    private void paint(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Which player (ALines, ACircles, or ASquares?)");
        String thePainter=scanner.next();
        System.out.print("Generation number?");
        int generationNumber=scanner.nextInt();
        painter=new SPainter("Canvas",500,800);
        ABPainter generate=new ABPainterALines(painter);//Arbitrary
        if(thePainter.equalsIgnoreCase("ALines")){
            generate=new ABPainterALines2(painter);
        }else if(thePainter.equalsIgnoreCase("ACircles")){
            generate=new ABPainterACircles2(painter);
        }else if(thePainter.equalsIgnoreCase("ASquares")){
            generate=new ABPainterASquares2(painter);
        }
        generate.paint(generation(generationNumber));
    }

    //Next lines set up the infrastructure and gets things started
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new algaePainter();
            }
        });
    }
}
