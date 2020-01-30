package retestCode;

import shapes.SCircle;

import java.util.ArrayList;
import java.util.List;

public class question3 {
    public static void main(String[] args){
        List<SCircle> bruh=new ArrayList<>();
        bruh.add(new SCircle(5));
        bruh.add(new SCircle(4));
        SCircle first=bruh.get(0);
        SCircle last=bruh.get(bruh.size()-1);
        bruh.add(0,new SCircle(2));
        List<SCircle> two=new ArrayList<>();
        for(SCircle die:bruh){
            if(die.radius()==2){
                two.add(die);
            }
        }


    }
}
