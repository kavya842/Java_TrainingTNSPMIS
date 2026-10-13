// package interfaces;
// class exception{
//     public static void main(String[] args){
//         int a=10;
//         int b=0;
//         try{
//             int result=a/b;
//             System.out.println(result);
        
//         }
//         catch(ArithmeticException e){
//             System.out.println("you cannot divide with 0");
//         }
//         }
//     }
    
//! ArithmeticException
//! Trying to divide an integer by zero.
//! 10 / 0

//! - NullPointerException
//! Trying to access a method or field through a null reference.
//! String name = null;
//! • Calling an instance method on a null object (e.g., str.length() when str
//! is null).
// !• Accessing or modifying a field of a null object (e.g., user.name).
//! • Taking the length of a null array or accessing its slots.

//! - ArrayIndexOutOfBoundsException
//! Trying to access an array index that doesn't exist.
//! int[] nums = {1, 2}; then nums[5] 


//!Ex1:-
// package interfaces;
// class exception{
//     public static void main(String[] args){
//         try{
//             int num = 10 / 0;
//             System.out.println(num);
//         } catch (ArithmeticException e) {
//             System.out.println("you cannot divide with 0");
//             System.out.println("error type of message is: " + e.getMessage());
//         }
//     }
// }

// !EX2:-
// package interfaces;
// class exception{
//     public static void main(String[] args){
//         try{
//             int[] numbers={60,70,80};
//             System.out.println(numbers[4]);
//              int result=10/0;
//             System.out.println(result);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Invalid Array Index");
//         }
//         catch(ArithmeticException e){
//             System.out.println("you cannot divide with 0");
//         }
//     }
// }

// Ex3:-

// package interfaces;
// class exception{
//     public static void main(String[] args){
//
//! finally block is used to execute important code such as closing connection, stream etc. It is executed whether an exception is handled or not.
//         try{
//             int res=10/0;
//             System.out.println(res);
//         }
//         catch(ArithmeticException e){
//             System.out.println("you cannot divide with 0");
//         }
//         finally{
//             System.out.println("This is finally block");
//         }
//     }
// }


//! throw and throws keyword in java
package interfaces;

import java.util.Scanner;

class exception{
    public static void main(String[] args){
        System.out.print("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age:" + age);
    }
}