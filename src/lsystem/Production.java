/*This class is used by the L-System class in order to help represent the productions of the system.
It stores the left hand side of the production as a symbol and the right hand side as a sequence of symbols, representing...
...everything in terms of character strings
 */
package lsystem;

public class Production {

    //Instance variables:the left hand side and right hand side of the production.

    private String symbol;
    private String sequence;

    //Create and L-System production by providing its left-hand side and right-hand side..
    //Symbol is the left hand side of the production
    //Sequence is the right hand side of the production
    public Production(String symbol, String sequence){
        this.symbol=symbol;
        this.sequence=sequence;
    }

    //Referencer for the left hand side of the production
    //Returns the left hand side.

    public String symbol(){
        return symbol;
    }

    //Referencer for right hand side
    //Returns the right hand side

    public String sequence(){
        return sequence;
    }

    //Compute a simple text rep. of the L-System production.
    //Returns the text rep. of the production.
    public String toString(){
        return symbol+"---> "+sequence;
    }
}
