import java.util.Scanner; 
class Employee 
{ 
    private int id; 
    private String name; 
    private double salary; 
    public Employee (int id, String name, double salary) 
    { 
        this.id = id; 
        this.name = name; 
        this.salary = salary; 
    } 
    public int 
    getId () 
    { 
        return id; 
    }    
    public String 
    getName () 
    { 
        return name; 
    } 
    public double 
    getSalary () 
    { 
        return salary; 
    } 
    public void 
    raiseSalary (double percent) 
    { 
        salary += salary * percent / 100.0; 
    } 
} 

public class EmployeeMain 
{ 
    public static void main (String[] args) 
    { 
        Scanner scanner = new Scanner (System.in); 
        System.out.println ("Enter Employee ID:"); 
        int id = scanner.nextInt (); 
        System.out.println ("Enter Employee Name:"); 
        scanner.nextLine (); // Consume newline left-over 
        String name = scanner.nextLine (); 
        System.out.println ("Enter Employee Salary:"); 
        double salary = scanner.nextDouble (); 
        Employee emp = new Employee (id, name, salary); 
        System.out.println ("Employee ID: " + emp.getId ()); 
        System.out.println ("Employee Name: " + emp.getName ()); 
        System.out.println ("Employee Salary: " + emp.getSalary ()); 
        System.out.println ("Enter raise percentage:"); 
        double percent = scanner.nextDouble (); 
        emp.raiseSalary (percent); 
        System.out.println ("Employee Salary after raise: " + emp.getSalary ()); 
        scanner.close (); 
    } 
} 