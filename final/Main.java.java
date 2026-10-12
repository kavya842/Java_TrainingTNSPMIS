class Parent{
    final void display(){
        System.out.println("This is the parent method");
    }
}
class Child extends Parent{
    
}
class Main{
    public static void main(String[] args){
        Child c=new Child();
        c.display();

    }
}