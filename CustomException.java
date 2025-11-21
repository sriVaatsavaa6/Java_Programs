// Custom Exception Class 
class DivisionByZeroException extends Exception 
{ 
    public DivisionByZeroException (String message) { super (message); } 
} 
public class CustomException 
{ 
    public static void main (String[] args) 
    { 
        int dividend = 10; 
        int divisor = 0; 
        try 
        { 
            if (divisor == 0) 
            { 
                throw new DivisionByZeroException("Cannot divide by zero"); 
            } 
            int result = dividend / divisor; 
            System.out.println ("Result: " + result); 
        } 
        catch (DivisionByZeroException e) 
        { 
            System.out.println ("Exception: " + e.getMessage ()); 
        } 
        finally 
        { 
            System.out.println ("Finally block executed"); 
        } 
    } 
} 