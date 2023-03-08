
import java.util.Formatter;
import java.util.Scanner;


public class FileWrite {
    public static void main(String[] args) {
        String name="";
        int id=0;
        try{
            Formatter formatter = new Formatter("D:\\/Person/Student.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("How many students?");
            int num = input.nextInt();
            for(int i=0;i<num;i++)
            {
                System.out.println("Enter student id , name");
                id = input.nextInt();
                name = input.next();
                formatter.format("%s\n%s\r\r", id,name);
            }
            
            formatter.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
