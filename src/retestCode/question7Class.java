package retestCode;

public class question7Class {
    //Instances
    private int edge1;
    private int edge2;

    //Constructor
    public question7Class(int edge1,int edge2) {
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    //Methods
    public String toString(){
        String representation="["+edge1+"|"+edge2+"]";
        return representation;
    }

    public int min(){
        if(edge1<edge2){
            return edge1;
        }else{
            return edge2;
        }
    }

    public void display(){
        String character="*";
        System.out.println("["+character.repeat(edge1)+" | "+character.repeat(edge2)+"]");
    }
}
