import java.io.IOException;
public class TestThrow1 {
    public static void validate(int age) {
        if(age < 18)
        {
            throw new ArithmeticException("Person is not eligilbe");
            
        }
        else
        {
            System.out.println("Person is eligible to vote");
        }
    }
    
    void m() throws IOException{
        throw new IOException("device Error");
    }
    
    void n() throws IOException{
        m();
    }
    
    void p()
    {
        try{
            n();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled");
        }
    }
}
