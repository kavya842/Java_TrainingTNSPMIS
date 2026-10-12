// is a relationship----------------------
// IS-A relationship — Inheritance
// Definition: An IS-A relationship represents inheritance, where one class inherits the properties and behaviors of another class using the extends keyword

// class Animal{
//     void eat(){
//         System.out.println(" Animal is eating.........");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println(" Dog is barking.........");
//     }
// }

// Has a relationship---------------
// Definition: A HAS-A relationship represents one class containing or using an object of another class as a member. Composition is a strong form of HAS-A in which one object owns another object's lifecycle.
// class Engine{
//     void start(){
//         System.out.println("engine started");
//     }

// }
// class car{
//     private Engine engine;
//     car(){
//         this.engine=new Engine();
//     }
//     void drive(){
//         engine.start();
//         System.out.println("car is driving");
//     }
// }


//example:-
// class Address{
//     String city;
//     String state;
//     int pincode;
//     Address(String city,String state,int pincode){
//         this.city=city;
//         this.state=state;
//         this.pincode=pincode;
//     }
//     void displayAddress(){
//         System.out.println(city+" "+state+" "+pincode);
//     }
// }
// class Student{
//     String name;
//     int rollno;
//     Address address;
//     Student(String name,int rollno,Address address){
//         this.name=name;
//         this.rollno=rollno;
//         this.address=address;
//     }
//     void displayProfile(){
//         System.out.println("Student:"+name+"\n Roll No."+rollno);
//         System.out.println("Lives at:");
//         address.displayAddress();
//     }
// }

//example2:-
// class Battery{
//     int capacityMaH;
//     Battery(int capacityMaH){
//         this.capacityMaH=capacityMaH;
//     }
//         void drain(){
//         System.out.println("Battery used.\n capacity left: "+capacityMaH+" mAh");
//         }
// }
// class Camera{
// int megapixels;
// Camera(int megapixels){
//     this.megapixels=megapixels;
//     }
//     void takePhoto(){
//         System.out.println("Photo taken with "+megapixels+" MP camera.");
//     }
// }
// class phone{
//     String brand;
//     Battery battery;
//     Camera camera;
//     phone(String brand,Battery battery,Camera camera){
//         this.brand=brand;
//         this.battery=battery;
//         this.camera=camera;
//     }
//     void snapPicture(){
//         System.out.println("["+brand+"]" +"is active and taking a picture.");
//         camera.takePhoto();
//         battery.drain();
//     }
// }

// Static, Final, and Abstract Classes
// 1) Static Class: A static class is a nested class that is declared with the static modifier. 
//     *It can be accessed without creating an instance of the outer class. 
//    * Static classes can only access static members of the outer class and cannot access instance members directly.

// class Student{
//     String name;
//     static String CollegeName="IIT Bombay";
//     Student(String name){
//         this.name=name;
//     }
//     void Stucol(){
//         System.out.println("Student name: "+name);
//         System.out.println("College name: "+CollegeName);
//     }
// }
