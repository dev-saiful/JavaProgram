
import java.io.File;


public class FileCreate {
    public static void main(String[] args) {
        File dir = new File("D:\\/Person");
        dir.mkdir();
        File file1 = new File(dir+"/Student.txt");
        File file2 = new File(dir+"/teacher.txt");
        try{
            file1.createNewFile();
            file2.createNewFile();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
