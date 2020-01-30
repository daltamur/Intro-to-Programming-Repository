package retestCode;

public class Question6a {
    public static void main(String[] args){
        String one="dogggggggg";
        String two="hmmmm";
        System.out.println(shorter(one, two));
    }

    private static String shorter(String one, String two) {
        String shorter;
        if(one.length()<two.length()){
            shorter=one;
        }else{
            shorter=two;
        }
        return shorter;
    }
}
