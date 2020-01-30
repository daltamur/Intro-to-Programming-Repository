package retestCode;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args){
        String courseIdentifier="CSC212-800";
        String startTime="9:10 PM";
        int colon=startTime.indexOf(":");
        int space=startTime.indexOf(" ");
        String hourString=startTime.substring(0,colon);
        Scanner scanner=new Scanner(hourString);
        int hour=scanner.nextInt();
        String ampm=startTime.substring(space+1);
        Boolean earlyClass=(hour==8||hour==9)&&(ampm.equals("AM"));
        if(ampm.equals("AM")){
            System.out.println("Morning");
        }else{
            System.out.println("Afternoon");
        }
        System.out.println(hour+" "+ampm+" "+earlyClass);





    }

  //  private static Boolean method(int hour, String ampm) {
  //      return((hour==8||hour==9)&&(ampm.equals("AM")));
    //}
}
