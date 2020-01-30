/*
General L-System class representing it int erms of its name, axiom, and production set.
 */


package lsystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LSystem {
    //Instance variables: The axiom and productions are protected so that they can be directly referenced from subclasses.
    //It will be up to the subclasses to fully instantiate the L-Systems by instantiating their axiom and productions instance variables.
    private String name;
    protected String axiom;
    protected List<Production> productions;

    //Create an L-System by giving it just its name. In the constructor of the subclass the axiom and the productions will be provided.
    //@param name is the name of the L-System
    public LSystem(String name){
        this.name=name;
    }

    //Compute a textual rep. of the L-System.
    //@return the text rep. of the L-System.

    public String toString(){
        return "Name= "+name+"\n"+
                "Axiom="+axiom+"\n"+
                "Productions...\n"+textRepresentation(productions);
    }

    private String textRepresentation(List<Production> productions) {
        String text="";
        for (Production p: productions){
            text=text+p.toString()+"\n";
        }
        return text;
    }

    //Compute the generation of the L-System indicated by the given value.
    //Generation number indicates the generation produced
    //the generation of the L-System indicated by parameter

    protected String generation(int generationNumber){
        LinkedList<String>generations=new LinkedList<String>();
        String generation=axiom;
        generations.add(generation);
        for (int i=1; i<=generationNumber;i++){
            generation=next(generation);
            generations.add(generation);
        }
        return generations.getLast();
    }

    //Produce/display some desired number of generations of the L-System.
    //The user is asked for the number.

    protected void generate(){
        System.out.print("How many generations? ");
        Scanner scanner=new Scanner(System.in);
        int nrOfGenerations=scanner.nextInt();
        LinkedList<String> generations=new LinkedList<String>();
        String generation=axiom;
        System.out.println("generation 0= "+generation);
        generations.add(generation);
        for(int i=1;i<=nrOfGenerations;i++){
            generation=next(generation);
            generations.add(generation);
            System.out.println("generation "+i+" = "+generation);
        }
    }

    private String next(String generation) {
    String result="";
    Scanner scanner=new Scanner(generation);
    while(scanner.hasNext() ){
        String symbol=scanner.next();
        Production production=find(symbol, productions);
        result=result+production.sequence()+" ";
    }
    return  result.trim();
    }

    private Production find(String symbol, List<Production> productions) {
        for (Production production: productions){
            if(production.symbol().equalsIgnoreCase(symbol)){
                return production;
            }
        }
        return null;
    }
}
