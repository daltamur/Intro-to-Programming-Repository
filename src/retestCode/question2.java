package retestCode;

import shapes.SRectangle;

public class question2 {
    public static void main(String [] args){
        SRectangle[] rects=new SRectangle[3];
        rects[0]=new SRectangle(5,5);
        rects[1]=new SRectangle(1,2);
        rects[2]=new SRectangle(3,4);
        System.out.println(rects[0]+" "+rects[1]+" "+rects[2]);
        SRectangle first=rects[0];
        System.out.println(first);
        SRectangle last=rects[rects.length-1];
        System.out.println(last);
        SRectangle third=rects[2];
        System.out.println(third);
        System.out.println(third.diagonal());
        int i=0;
        while(i<rects.length){
            SRectangle rectangle=rects[i];
            rectangle.shrink(2,2);
            i=i+1;
        }
        System.out.println(rects[0]+" "+rects[1]+" "+rects[2]);


    }
}
