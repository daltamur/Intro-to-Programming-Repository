package examTestCode;

public class exam2question1 {
    public static void main(String [] args){
        String animal1="bearsrcewl";
        String animal2="eagle";

        String first=animal1.substring(0,1);
        System.out.println(first);
        String last=animal2.substring(animal2.length()-1);
        System.out.println(last);
        double nrofwords=2.0;
        double average=((animal1.length())+(animal2.length()))/nrofwords;
        System.out.println(animal2.indexOf("a"));
        System.out.println(average);
        System.out.println(last);
        String animal;
        if (animal1.length()>animal2.length()){
            animal=animal1;
        } else {
            animal=animal2;
        } System.out.println(animal);
        int before1=animal.indexOf("a");
        String before=animal.substring(0,before1);
        System.out.println(before);
        String after=animal.substring(before1+1);
        System.out.println(after);
        System.out.println(before+" "+after);


    }
}
