import java.util.Scanner;

public class MatrixAddition 
{ 
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        
        int[][] matrix1 = new int[n][n]; 
        int[][] matrix2 = new int[n][n]; 
        int[][] sum = new int[n][n]; 
        
        // Input for first matrix
        System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scan.nextInt();
            }            
        } 

        // Input for second matrix
        System.out.println("Enter the elements of second matrix:");
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scan.nextInt();
            }            
        } 

        // Add the matrices 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                sum[i][j] = matrix1[i][j] + matrix2[i][j]; 
            } 
        } 
        
        // Print the result 
        System.out.println("\nSum of matrices is:"); 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                System.out.print(sum[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
}
