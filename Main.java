

public class Main {
    public static void main(String[] args) {
        TestThrow1.validate(18);
        System.out.println("Rest of the code....");
        TestThrow1 obj  = new TestThrow1();
        obj.p();
        System.out.println("Normal Flow");
    }

   
}
