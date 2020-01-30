package retestCode;

public class question6b {
    public static void main(String[] args){
        Double[] array=new Double[3];
        array[1]=2.0;
        array[2]=3.0;
        array[0]=1.0;
        System.out.println(array[0]+" "+array[1]+" "+array[2]);
        int one=0;
        int two=1;
        swap(array, one, two);
        System.out.println(array[0]+" "+array[1]+" "+array[2]);
    }

    private static void swap(Double[] array, int one, int two) {
        double valueOne=array[one];
        double valueTwo=array[two];
        array[one]=valueTwo;
        array[two]=valueOne;
    }
}
