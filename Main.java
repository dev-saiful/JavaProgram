
package OOP;


public class Main {
    public static void main(String[] args)
    {
//        Student st = new Student();
//        st.name = "Saiful";
//        st.age = 23;
//        st.id = 2001019037;
//        st.dept = "CSE";
//        
//        System.out.println("Student info : ");
//        System.out.println("Name : "+st.name + " Age : "+st.age+" ID : "+st.dept+st.id+" Department : "+st.dept);
        CreditCard  card1 = new  CreditCard(345);
        card1.setLimit(5000);
        card1.buyWithCredit(500);
        card1.buyWithCredit(1500);
      
        card1.buyWithCredit(15000);
        
        
    }
}
