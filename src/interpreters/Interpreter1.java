/*
 *this interpreter is intended to paint different colored dots in a window.
 *
 * The Commands that the interpreter can recognize and respond to are:
 * -BLUE: Paint a blue dot
 * -RED: Paint a red dot
 * -HELP: Show a list of the commands in a dialog message box
 * -EXIT: Terminate the program
 */
package interpreters;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

public class Interpreter1 {

    private void interpreter() {

        //Create objects to think with...
        SPainter miro = new SPainter("Dot Thing", 400, 400);
        miro.setScreenLocation(0, 0);
        SCircle dot = new SCircle(180);

        //Repeatedly take a command from an input dialog box and interpret it...
        while (true) {
            String command = JOptionPane.showInputDialog(null, "Command?");
            if (command == null) {
                command = "exit";
            }//user clicked on cancel
            if (command.equalsIgnoreCase("blue")) {
                miro.setColor(Color.BLUE);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("red")) {
                miro.setColor(Color.RED);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("help")) {
                JOptionPane.showMessageDialog(null, "Valid commands are: " + "RED | BLUE | HELP | EXIT ");
                break;
            } else if (command.equalsIgnoreCase("exit")) {
                miro.end();
                System.out.println("Thanks for viewing the dots...");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Unrecognizable command: " + command.toUpperCase());
            }
        }
    }


//Infrastructure

    public Interpreter1() {
        interpreter();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Interpreter1();
            }
        });
    }

}


