package examTestCode;

public class TriangleUsage {
    public static void main(String[] args){
        Triangle triangle=new Triangle(15,40,60);
        Triangle equilateral=new Triangle(15);

        System.out.println( "Perimeter of triangle" + triangle.perimeter()+ " Equilateral triangle: "+equilateral.perimeter());
    }
}
