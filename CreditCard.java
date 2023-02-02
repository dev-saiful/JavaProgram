
package OOP;

public class CreditCard{
    private double limit;
    private int number;
    private double balance;
    public final static double  MAX_LIMIT = 2000;
    public CreditCard(int number)
    {
        this.number = number;
    }
    public void setLimit(double limit)
    {
       
        if(limit <= MAX_LIMIT)
        {
            this.limit=limit;
        }
        else
        {
            return;
        }
    }
    
    public boolean buyWithCredit(double amount)
    {
        if((balance+amount)>limit)
        {
            return false;
        }
        balance = balance + amount;
        return true;
    }
    
    public void creditSettle(double amount)
    {
        balance = balance - amount;
    }
    
}
