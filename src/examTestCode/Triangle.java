package examTestCode;

public class Triangle {
    //Instances
    private double sideA;
    private double sideB;
    private double sideC;

    //Constructors
    public Triangle(double sideLength){
        this.sideA=sideLength;
        this.sideB=sideLength;
        this.sideC=sideLength;
    }
    public Triangle (double sideA, double sideB, double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    //Method
    public double perimeter(){
        double perimeter=sideA+sideB+sideC;
        return perimeter;
    }

}
