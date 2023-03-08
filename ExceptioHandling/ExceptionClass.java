package ExceptioHandling;

import java.util.*;

public class ExceptionClass {

    public static void main(String[] args) {
        try{
            int num1, num2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter Num 2 : ");
        num2 = sc.nextInt();
        res = num1/num2;
        System.out.println("Result : "+res);
        }
        catch(ArithmeticException err)
        {
            System.out.println(err);
        }
        catch(InputMismatchException err2)
        {
            System.out.println(err2);
        }
        catch(Exception err)
        {
            System.out.println(err);
        }
        
    }
}
