import java.util.Scanner;

public class kuih {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        donut sedap = new donut ();
        System.out.println ("Enter your boyfriend name: ");
        String temp = input.nextLine ();
        sedap.setName (temp);
        sedap.simpleMessage ();

    }

}