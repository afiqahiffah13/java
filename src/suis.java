public class suis { //this is class
    public static void main (String[] args){ //this public main
        int x=69;
        int y=89;
        int z=79;
        int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);

        System.out.println("The largest numbers is: "+largestNumber);
    }
}

//"the largest number is" = function