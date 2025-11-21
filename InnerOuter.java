class Outer 
{ 
    void display() 
    { 
        System.out.println("Outer display"); 
    } 
 
    class Inner 
    { 
        void display() 
        { 
            System.out.println("Inner display"); 
        } 
    } 
} 
 
public class InnerOuter 
{ 
    public static void main(String[] args) 
    { 
        Outer outer = new Outer(); 
        Outer.Inner inner = outer.new Inner(); 
        outer.display(); // Calls the outer class display() 
        inner.display(); // Calls the inner class display() 
    } 
} 