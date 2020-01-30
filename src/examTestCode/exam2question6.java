package examTestCode;

import java.util.ArrayList;

public class exam2question6 {
    public static void main(String[] args){
        String a="john";
        String b="david";
        String c="steve";
        ArrayList<String> List= new ArrayList<> (littleList(a,b,c));
        System.out.println(List.get(0));
        System.out.println(List.get(1));
        System.out.println(List.get(2));

    }

    private static ArrayList<String>  littleList(String a, String b, String c) {
        ArrayList<String> words=new ArrayList<>();
        words.add(a);
        words.add(b);
        words.add(c);
        return words;
    }


}
