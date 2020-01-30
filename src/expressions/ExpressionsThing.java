/*
*A program used to practice use of arithmetic expression and problem solving within Java
*/

package expressions;

public class ExpressionsThing {
    public static void main(String[] args) {
        double one= 3.14*5+5;
        double two=3.14*(5+5);
        double three= (3.14* (5+5));
        System.out.println("one= "+ one);
        System.out.println("two= " + two);
        System.out.println("three= "+ three);
        //one is incorrect, three is fully parenthesized...
        int four=(2*3);
        System.out.println("four= "+four);
        double five=(55/2);
        System.out.println("five "+five);
        double six=(65/3);
        System.out.println("six=" +six);
        double seven=((five)+(six));
        System.out.println("seven= "+seven);
        double eight=(3.14*(11.3*11.3));
        System.out.println("eight= "+eight);
        double nine=(27.7*27.7);
        System.out.println("nine= "+nine);
        double ten=(((eight)+(nine))/2);
        System.out.println("ten= "+ten);
        double eleven=(243.5*.17);
        System.out.println("eleven="+eleven);
        int twelve=(3/3);
        System.out.println("twelve= "+twelve);
        int thirteen=((7-2)-4);
        System.out.println("thirteen= "+thirteen);
        int fourteen=((7+9)/(3+1));
        System.out.println("fourteen= "+fourteen);
        int fifteen=(((8+4)-(6-4))/2);
        System.out.println("fifteen= "+fifteen);


    }
}
