package retestCode;

public class question7test {
    public static void main(String[] args) {
        question7Class dora = new question7Class(2, 5);
        question7Class dirk = new question7Class(0, 4);
        System.out.println("dora= "+dora.toString());
        System.out.println("dirk= "+dirk.toString());
        System.out.println("min for dora:"+dora.min());
        System.out.println("min for dirk: "+dirk.min());
        dora.display();
        dirk.display();
    }
}
