class MyPoint 
{ 
    private int x; 
    private int y; 
 
    public MyPoint() { 
        this(0, 0); 
    } 
 
    public MyPoint(int x, int y) { 
        this.x = x; 
        this.y = y; 
    } 
 
    public void setXY(int x, int y) { 
        this.x = x; 
        this.y = y; 
    } 
 
    public int[] getXY() { 
        return new int[] { x, y }; 
    } 
 
    public double distance(int x, int y) { 
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)); 
    }
 
    public double distance(MyPoint another) { 
        return Math.sqrt(Math.pow(this.x - another.x, 2) 
                         + Math.pow(this.y - another.y, 2)); 
    }
 
    public double distance() { 
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)); 
    }
 
    @Override 
    public String toString() { 
        return "(" + x + ", " + y + ")"; 
    } 
} 
 
public class TestMyPoint 
{ 
    public static void main(String[] args) 
    { 
        MyPoint point1 = new MyPoint();      
        MyPoint point2 = new MyPoint(3, 4);  
 
        point1.setXY(5, 6); 
 
        int[] coordinates = point2.getXY(); 
 
        System.out.println("Point 1: " + point1); 
        System.out.println("Point 2: " + point2); 
        System.out.println("Point 2 coordinates: (" + coordinates[0] + ", " + coordinates[1] + ")"); 
 
        // THIS PRINTS 0.0 (distance from Point1 to (5,6))
        System.out.println("Distance from Point 1 to (5, 6): " + point1.distance(5, 6)); 
 
        System.out.println("Distance from Point 2 to Point 1: " + point2.distance(point1)); 
        System.out.println("Distance from Point 2 to origin: " + point2.distance()); 
    } 
}
