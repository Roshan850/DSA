import java.util.*;


public class Recursion {
    public int sumofN(int n)
    {
        if (n <= 1) {
            return n;

        } else {
            return n + sumofN(n - 1);
        }
    }

    public boolean isArrSort(int arr[], int i){
        if (i== arr.length-1){
            return true;

        }
        if(arr[i] > arr[i+1]){
            return false;

        }
        return isArrSort(arr,i+1);

    }

    

    public static void main(String[] args)
    {
        // Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();
        // Recursion recursion = new Recursion(); // Create an instance of the class
        // Fibo f = new Fibo();
        // int s = recursion.sumofN(n); // Call the non-static method using the instance
        // System.out.println("Sum of first " + n + " natural numbers is: " + s);
        
        // System.out.println("Fibonacci of " + n + " is: " + f.Fibonacci(n));
        int arr[] = { 1, 2, 7, 4 };
        Recursion p = new Recursion();
        System.out.println(p.isArrSort(arr, 0));

        

    }
    
}
