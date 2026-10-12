// Multiple Inheritance in Java using Interfaces
//Multiple Inheritance: Multiple inheritance is a type of inheritance in which one child class inherits properties and methods from more than one parent.
//In Java: Multiple inheritance is not supported through classes, but it is supported through interfaces.
interface Sports {
    void play();
}

interface Academics {
    void study();
}

class Student1 implements Sports, Academics {
    public void play() {
        System.out.println("Student plays cricket");
    }

    public void study() {
        System.out.println("Student studies Java");
    }
}

public class Multiple_inheritance{
    public static void main(String[] args) {
        Student s = new Student();
        s.play();
        s.study();
    }
}
