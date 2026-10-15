//!1. What are Generics?
// Generics in Java allow us to write classes, interfaces, and methods that work with different data types while maintaining type safety.
//simple ga cheppalante, Generics ante oka class or method ni different data types tho use cheyadam, without writing separate code for each data type
//! 2. Why do we need Generics?
// Without Generics, we might use the Object class to store different types of values. But this can cause type conversion problems.

//!Without Generics
// import java.util.ArrayList;
// class gen{
//     public static void main(String[] args){
//         ArrayList<Object> list = new ArrayList<>();
//         list.add(10);
//         list.add("Hello");
//         String s = (String) list.get(0);
//         System.out.println(s);
//     }
// }

//! With generics
// import java.util.ArrayList;
// class gen{
//     public static void main(String[] args){
//         ArrayList<String> list=new ArrayList<>();
//         list.add("100");
//         list.add(" Hello java");
//         String s=list.get(1);
//         System.out.println(s);
//     }
// }

//!Ex1
// class  Box{
//     private Object item;
//     void set(Object item){
//         this.item=item;
//     }
//     Object get(){
//         return item;
//     }
// }
// class gen{
//     public static void main(String[] args){
//         Box box=new Box();
//         box.set("Bhoomi");
//         String s=(String)box.get();
//         System.out.println(s);
//         box.set(43);
//         int t=(int)box.get();
//         System.out.println(t);
//     }
// }

//!Example: Student Marks Storage Using Generics
//Imagine you want to store marks for different subjects. Instead of creating separate classes for each data type, you can create one generic class and reuse it.
//! Using generics
class Marks<T>{
    T value;
    Marks(T value){
        this.value=value;
    }
    void display(){
        System.out.println("Marks:"+value);
    }
}
class gen{
    public static void main(String[] args){
        
        Marks<Integer> m1=new Marks<>(95);
        m1.display();

        Marks<Double> m2 = new Marks<>(89.5);
        m2.display();

        Marks<String> m3 = new Marks<>("A Grade");
        m3.display();

    }
}