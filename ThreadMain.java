class MyRunnable implements Runnable 
{ 
    @Override 
    public void run() 
    { 
        try 
        { 
            System.out.println(Thread.currentThread().getName()+ " is running."); 
            Thread.sleep(500); 
        } 
        catch (InterruptedException e) 
        { 
            System.out.println("Thread interrupted: " + e.getMessage()); 
        } 
    } 
} 
 
public class ThreadMain 
{ 
    public static void main(String[] args) 
    { 
        int numThreads = 5; 
        for (int i = 0; i<numThreads; i++) 
        { 
            Thread thread = new Thread(new MyRunnable()); 
            thread.start(); 
        } 
    } 
} 