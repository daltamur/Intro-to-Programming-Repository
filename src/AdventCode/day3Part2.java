package AdventCode;

import java.util.ArrayList;
import java.util.List;

public class day3Part2 {
    public static void main(String[] args){
        ArrayList<Integer> inputs= new ArrayList<>(List.of(1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,9,19,1,19,5,23,1,13,23,27,1,27,6,31,2,31,6,35,2,6,35,39,1,39,5,43,1,13,43,47,1,6,47,51,2,13,51,55,1,10,55,59,1,59,5,63,1,10,63,67,1,67,5,71,1,71,10,75,1,9,75,79,2,13,79,83,1,9,83,87,2,87,13,91,1,10,91,95,1,95,9,99,1,13,99,103,2,103,13,107,1,107,10,111,2,10,111,115,1,115,9,119,2,119,6,123,1,5,123,127,1,5,127,131,1,10,131,135,1,135,6,139,1,10,139,143,1,143,6,147,2,147,13,151,1,5,151,155,1,155,5,159,1,159,2,163,1,163,9,0,99,2,14,0,0));
        int position=0;
        int data1=0;
        int data2=0;
        while (data1<=99) {
            inputs.set(1,data1);
            inputs.set(2,data2);
            while(data2<=99) {
                //So in the data 2 loop you have to reset the counter for position and reset the list as well and this was probably the more confusing part but other than that not much to be done...
                while (position < inputs.size() - 1) {
                    if (inputs.get(position) == 1) {
                        int value1 = inputs.get((position + 1));
                        int operation1 = inputs.get(value1);
                        int value2 = inputs.get((position + 2));
                        int operation2 = inputs.get(value2);
                        int value3 = inputs.get((position + 3));
                        int sum = operation1 + operation2;
                        inputs.set(value3, sum);
                    } else if (inputs.get(position) == 2) {
                        int Value1 = inputs.get((position + 1));
                        int Operation1 = inputs.get(Value1);
                        int Value2 = inputs.get((position + 2));
                        int Operation2 = inputs.get(Value2);
                        int Value3 = inputs.get((position + 3));
                        int product = Operation1 * Operation2;
                        inputs.set(Value3, product);
                    } else if (inputs.get(position) == 99) {
                        break;
                    }
                    position=position+4;
                }
                if(inputs.get(0)==19690720){
                    break;
                }else{
                    inputs.clear();
                    inputs.addAll(List.of(1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,9,19,1,19,5,23,1,13,23,27,1,27,6,31,2,31,6,35,2,6,35,39,1,39,5,43,1,13,43,47,1,6,47,51,2,13,51,55,1,10,55,59,1,59,5,63,1,10,63,67,1,67,5,71,1,71,10,75,1,9,75,79,2,13,79,83,1,9,83,87,2,87,13,91,1,10,91,95,1,95,9,99,1,13,99,103,2,103,13,107,1,107,10,111,2,10,111,115,1,115,9,119,2,119,6,123,1,5,123,127,1,5,127,131,1,10,131,135,1,135,6,139,1,10,139,143,1,143,6,147,2,147,13,151,1,5,151,155,1,155,5,159,1,159,2,163,1,163,9,0,99,2,14,0,0));
                    position=0;
                }
                data2++;
                inputs.set(1,data1);
                inputs.set(2,data2);
            }
            if(inputs.get(0)==19690720){
                break;
            }
            data1++;
            inputs.set(1,data1);
            data2=0;
            inputs.set(2,data2);
            }


        for(int x:inputs){
            System.out.print(x+", ");
        }

    }
}
