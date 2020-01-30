package examTestCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exam2question3 {
    public static void main(String[] args){
        ArrayList<String>words=new ArrayList<>();
        words.add("MamaMia");
        words.add("Pina");
        words.add("Coladas");
        words.add("Bro");
        System.out.println("The amount of words is: "+ words.size());
        String first=words.get(0);
        System.out.println(first);
        String last=words.get(words.size()-1);
        System.out.println(last);
      //  System.out.println("Big names:");
        for (String x: words){
            if(x.length()>6){
                System.out.println(x);
            }

        }
      //  System.out.println("Short names: ");
        List<String> shortnames =words.stream()
                .filter(n->n.length()<5)
                .collect(Collectors.toList());

        for(String shortNames:shortnames){
            System.out.println(shortNames);

        }
    }

}
