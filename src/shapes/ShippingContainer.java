
package shapes;
import java.util.Scanner;
import shapes.SRectangle;



public class ShippingContainer {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print("Input the height of the shipping container in feet:");
       int height=scanner.nextInt();
       System.out.print("Input the length of the shipping container in feet:");
       int length=scanner.nextInt();
       System.out.print("Input the width of the shipping container in feet: ");
       int width=scanner.nextInt();
       SRectangle face= new SRectangle(height,length);
       SRectangle key= new SRectangle(width,face.diagonal());
       double distance=key.diagonal();
       System.out.println("The longest the object can be when put in the container diagonally is "+distance+ " feet.");

    }


}
