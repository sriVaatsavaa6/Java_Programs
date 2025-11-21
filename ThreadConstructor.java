class MyThread extends Thread 
{ 
    MyThread (String name) 
    { 
        super (name); // Call the base class constructor with thread 
        start (); // Start the thread 
    } 
 
    public void 
    run () 
    { 
        try 
        { 
            for (int i = 5; i > 0; i--) 
            { 
                System.out.println (getName () + ": " + i); 
                Thread.sleep (1000); 
            } 
        } 
        catch (InterruptedException e) 
        { 
            System.out.println (getName () + " interrupted."); 
        } 
        System.out.println (getName () + " exiting."); 
    } 
} 
 
public class ThreadConstructor 
{ 
    public static void main (String[] args) 
    { 
        new MyThread ("Child Thread");  
        try 
        { 
            for (int i = 5; i > 0; i--) 
            { 
                System.out.println ("Main Thread: " + i); 
                Thread.sleep (2000); 
            } 
        } 
 
        catch (InterruptedException e) 
        { 
            System.out.println ("Main Thread interrupted."); 
        } 
        System.out.println ("Main Thread exiting."); 
    } 
} 