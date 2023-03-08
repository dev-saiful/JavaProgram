
import java.io.File;
import java.util.Scanner;


public class FileRead {
    public static void main(String[] args) {
        try{
        File file = new File("D:\\/Person/Student.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNext())
        {
            int id = sc.nextInt();
            String name = sc.next();
            System.out.println("id : "+id+" name : "+name);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
