
package simplecalculator;
import java.util.Scanner;
/**
 *
 * @author Saiful
 */
public class SimpleCalculator {


    public static void main(String[] args) {
       int a,b,ch;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter for a =");
       a = sc.nextInt();
       System.out.println("Enter for b =");
       b = sc.nextInt();
       System.out.println("Choose: \n1.Addition\n2.Subtract\n3.Multiplication\n4.Division");
       System.out.println("Enter Your Choice");
       ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Addition = "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction = "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication = "+(a*b));
                break;
            case 4:
                System.out.println("Division = "+(a/b));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
    
}
