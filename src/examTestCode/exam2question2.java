package examTestCode;

public class exam2question2 {
    public static void main(String[] args){
        double[] array=new double[5];
        array[0]=-1.0;
        array[1]=0;
        array[2]=4.3;
        array[3]=-9.8;
        array[4]=2.2;
        int two=2;
        String f=String.valueOf(two);
        System.out.println(f);

        System.out.println("Array length:"+array.length);
        double first=array[0];
        double last=array[array.length-1];
        for(double x: array){
            if(x>-1){
                System.out.println(x);
            }


        }

    }
}
