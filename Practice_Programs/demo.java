//! Write a program to find the greatest of three numbers using if else statement.
// class demo {
//     public static void main(String[] args) {

//         int a = 20;
//         int b = 45;
//         int c = 30;

//         if (a > b && a > c) {
//             System.out.println(a + " is greater");
//         }
//         else if (b > a && b > c) {
//             System.out.println(b + " is greater");
//         }
//         else {
//             System.out.println(c + " is greater");
//         }
//     }
// }

//! Q2. Check whether a number is even or odd
// class demo{
//     public static void main(String[] args){
//        int num=60;
//         if(num%2==0){
//             System.out.println("It is even");
//         }
//         else{
//             System.out.println("it is odd");
//         }
//     }
// }

//! Reverse a number without converting it into a String.
// class demo{
//     public static void main(String[] args){
//         int num=12345;
//         int rev=0;
//         while(num!=0){
//             rev=rev*10+num%10;
//             num=num/10;
//         }
//         System.out.println("Reversed number is: "+rev);
//     }
// }
//! Q4. Check whether a number is palindrome or not
// class demo{
//     public static void main(String[] args){
//         int num=121;
//         int rev=0;
//         int temp=num;
//         while(num!=0){
//             rev=rev*10+num%10;
//             num=num/10;
//         }   
//         if(temp==rev){
//             System.out.println("It is a palindrome");
//         }
//         else{
//             System.out.println("It is not a palindrome");
//         }
//     }
// }