interface Resizable 
{ 
    void resizeWidth (int width); 
    void resizeHeight (int height); 
} 
 
class Rectangle implements Resizable 
{ 
    private int width; 
    private int height; 
 
    // Constructor 
    public Rectangle (int width, int height) 
    { 
        this.width = width; 
        this.height = height; 
    } 

    @Override 
    public void 
    resizeWidth (int width) 
    { 
        this.width = width; 
    } 
    @Override 
    public void 
    resizeHeight (int height) 
    { 
        this.height = height; 
    } 
 
    // Additional method to get the dimensions 
    public void 
    getDimensions () 
    { 
        System.out.println ("Width: " + width + ", Height: " + height); 
    } 
} 
 
public class rect_resize 
{ 
    public static void main (String[] args) 
    {
        Rectangle rectangle = new Rectangle (5, 7); 
        System.out.println ("Original Dimensions:"); 
        rectangle.getDimensions (); 
 
        rectangle.resizeWidth (8); 
        rectangle.resizeHeight (10); 
        System.out.println ("\nResized Dimensions:"); 
            rectangle.getDimensions (); 
    } 
} 