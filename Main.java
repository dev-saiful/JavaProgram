
import ExceptioHandling.Box;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[2] = 6;
            System.out.println(arr[2]);
            Scanner sc = new Scanner(System.in);
            double h, w, d;
            h = sc.nextDouble();
            w = sc.nextDouble();
            d = sc.nextDouble();
            Box box1 = new Box(h, w, d);
            box1.result();
        } catch (ArithmeticException err1) {
            System.out.println(err1);
        } catch (InputMismatchException err2) {
            System.out.println(err2);
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println(err);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
