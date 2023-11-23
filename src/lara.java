//pembelajaran: sum method in array

public class lara{
    public static void main (String[] args){
        int iffah[] = {67, 90, 45, 36, 76}; 
        simpleArray(iffah); 

        for(int y:iffah)
            System.out.println(y);
    }

    
    public static void simpleArray (int x[]) {
        for(int counter=0; counter<x.length; counter++)
            x[counter]+=5;    
    }
}