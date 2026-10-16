//!Lambda
//A lambda expression is a feature introduced in Java 8 that provides a short and concise way to implement the abstract method of a functional interface without creating a separate class.

//! Normal implementation	                                                           Lambda expression
// Requires more lines of code.	                                             Requires fewer lines of code.
// Uses an anonymous class or a separate implementation class                Provides a concise implementation of a functional interface's abstract method.
// for an interface.                  	
// Code can be more lengthy.	                                                Code is shorter and easier to read.
// Introduced before Java 8.	                                                  Introduced in Java 8.

//!Normal Implementation without using Lambda Expression
// interface Greeter{
//     void greet(String name);
// }
// public class lambda{
//     public static void main(String[] args){
//         Greeter g=new Greeter(){
//             @Override 
//             public void greet(String name){
//                 System.out.println("Hello,"+name);
//                 System.out.println("Em chestunavv," + name);
//             }
//         };
//         g.greet("Kavya Chowdary");
//     }
// }

//! With lambda eXpression
// @FunctionalInterface 
// interface Greeter{
//     void greet(String name);
// }
// public class lambda{
//     public static void main(String[] args){
//         Greeter g = name -> System.out.println("hello," + name);
//         g.greet("bhoomi");
//     }
// }


//! built-in functional interfaces
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class lambda{
    public static void main(String[] args){
        //!predicate checks a condition
        Predicate<Integer>p=n->n>=18;
        System.out.println("Eligibility:"+p.test(20));

        //!Function : checks input and return output
        Function<Integer,Integer>f=n->n*n;
        System.out.println("Square:"+f.apply(6));

        //! Consumer: Takes input and return nothing
        Consumer<String> c=name->System.out.println("hello,"+name);
        c.accept("Kavya");

        //!Supplier: Returns a value without input
        Supplier<String> s=()->"Welcome to java Journey";
        System.out.println(s.get());

    }
}