class animal{
    void eat(){
        System.out.println("Animal is Eating...");
    }

}
class dog extends animal{
    void bark(){
        System.out.println("Dog isBarking...");
    }
}

public class Single_level_inheritance {
    
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
    }
    
}