public class lunch{
    public static void main(String[] args){
        nasiayam goreng = new nasiayam();
        System.out.println(goreng.toMilitary());  //00:00:00
        System.out.println(goreng.toTime());      //12:00:00
        
        
        goreng.setTime(16,36,0);
        System.out.println(goreng.toMilitary());
        System.out.println(goreng.toTime());

    }
}
