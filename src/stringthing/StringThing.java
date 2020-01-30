/*
 *This program will do a bit of character string processing
 */


package stringthing;

public class StringThing {

    public static void  main(String[] args){
        // Point A: create a print some strings that represent names
        String singer = "Holiday, Billie";
        String sculptor="Claudel, Camille";
        String painter="Picasso, Pablo";
        String dancer="Zotto, Osvaldo";
        String self="Altamura, Dominic";
        System.out.println("\nNames...");
        System.out.println(singer);
        System.out.println(sculptor);
        System.out.println(painter);
        System.out.println(dancer);
        System.out.println(self);

        // Point B: Compute and print the lengths of strings, without labels
        int singerLength=singer.length();
        int sculptorLength=sculptor.length();
        int painterLength=painter.length();
        int dancerLength=dancer.length();
        int selfLength=self.length();
        System.out.println("\nName Lengths...");
        System.out.println(singerLength);
        System.out.println(sculptorLength);
        System.out.println(painterLength);
        System.out.println(dancerLength);
        System.out.println(selfLength);

        // Point C: Compute and print the location of the comma within each string, no labels
        int singerCommaPosition=singer.indexOf(",");
        int sculptorCommaPosition=sculptor.indexOf(",");
        int painterCommaPosition=painter.indexOf(",");
        int dancerCommaPosition=dancer.indexOf(",");
        int selfCommaPosition=self.indexOf(",");
        System.out.println("\nComma Positions...");
        System.out.println(singerCommaPosition);
        System.out.println(sculptorCommaPosition);
        System.out.println(painterCommaPosition);
        System.out.println(dancerCommaPosition);
        System.out.println(selfCommaPosition);

        //Point D: Compute and print the five first names, with no labels
        String singerFirst=singer.substring(painterCommaPosition+1);
        String sculptorFirst=sculptor.substring(sculptorCommaPosition+1);
        String painterFirst=painter.substring(painterCommaPosition+1);
        String dancerFirst=dancer.substring(dancerCommaPosition+1);
        String selfFirst=self.substring(selfCommaPosition+1);
        System.out.println("\nFirst Names...");
        System.out.println(singerFirst);
        System.out.println(sculptorFirst);
        System.out.println(painterFirst);
        System.out.println(dancerFirst);
        System.out.println(selfFirst);


        //Point E: Compute and print the five last names, with no labels
        String singerLast=singer.substring(0,7);
        String sculptorLast=sculptor.substring(0,7);
        String painterLast=painter.substring(0,7);
        String dancerLast=dancer.substring(0,5);
        String selfLast =self.substring(0,8);
        System.out.println("\nLast names...");
        System.out.println(singerLast);
        System.out.println(sculptorLast);
        System.out.println(painterLast);
        System.out.println(dancerLast);
        System.out.println(selfLast);

        //Point F: Compute and print the first names, once again
        System.out.println("\nFirst Names, again...");
        System.out.println(firstName(singer));
        System.out.println(firstName(sculptor));
        System.out.println(firstName(painter));
        System.out.println(firstName(dancer));
        System.out.println(firstName(self));

        //Point G: Compute and print the last names, once again
        System.out.println("\nLast Names, again...");
        System.out.println(lastName(singer));
        System.out.println(lastName(sculptor));
        System.out.println(lastName(painter));
        System.out.println(lastName(dancer));
        System.out.println(lastName(self));

        //Point H: Compute and print the full names, natural style
        System.out.println("\nFull Names, Natural Style...");
        System.out.println(fullName(singer));
        System.out.println(fullName(sculptor));
        System.out.println(fullName(painter));
        System.out.println(fullName(dancer));
        System.out.println(fullName(self));
    }

    private static String fullName(String dsn) {
        int firstLength=dsn.indexOf(",");
        int wholeLength=dsn.length();
        String firstName=dsn.substring(firstLength+1,wholeLength);
        String lastName=dsn.substring(0,firstLength);
        String wholeName=firstName+" "+lastName;
        return wholeName;
    }

    private static String lastName(String directoryStyleName  ) {
        int firstLength=directoryStyleName.indexOf(",");
        String lastName=directoryStyleName.substring(0,firstLength);
        return lastName;
    }

    private static String firstName(String directoryStyleName) {
        int wholeLength=directoryStyleName.length();
        int firstLength=directoryStyleName.indexOf(",");
        String firstName=directoryStyleName.substring(firstLength+1,wholeLength);
        return firstName;




    }


}

