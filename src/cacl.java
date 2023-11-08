 import java.util.Scanner;
 
 public class cacl {

    public static void main(String[] args) {
        
    Scanner calculator = new Scanner(System.in);
    int n1,n2,answer;

    System.out.println("enter first number: ");
    n1=calculator.nextInt();
    System.out.println("enter second number: ");
    n2=calculator.nextInt();

    answer = n1-n2;
    System.out.println(answer);

    }
    
}
    

