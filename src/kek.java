
//lesson: variable length arguements 
//kita nak tambah average tapi without letakkan length yang fix
public class kek{
    public static void main(String[] args){
        System.out.println(average(45, 76, 84));

    }
    public static int average(int...numbers){
        int total = 0;
        for(int x:numbers)
            total+=x;
            return total/numbers.length;
        }
    }


// args boleh tukar nama apa apa strings 

//sum=0;
//for (int x =0; x=number.length; x++){
   // total = sum/number.length; 
//}

