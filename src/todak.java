import java.util.Random;
public class todak{
    public static void main (String[] args){
        Random rand = new Random ();
        int dadu[] = new int [7]; 
    
    for(int roll=0; roll<20; roll++){
        ++dadu[1+rand.nextInt(6)];
    }
    System.out.println("number\tgiliran");

    for(int result=1; result<dadu.length; result++){
        System.out.println(result+"\t"+dadu[result]);
        }
    }
}
//result is statement (line 13)