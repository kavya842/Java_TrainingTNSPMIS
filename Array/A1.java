//! Array in java
// An array stores multiple values of the same data type in a single variable.
import java.util.*;
public class A1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        sc.close();
    }
}