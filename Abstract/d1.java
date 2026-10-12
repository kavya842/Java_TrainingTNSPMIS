
abstract class Employee {
    Employee() {
        System.out.println("Employee constructor");
    }

    abstract void work();
}

class Developer extends Employee {
    Developer() {
        System.out.println("Developer constructor");
    }

    void work() {
        System.out.println("Developer writes code");
    }
}

class d1{
    public static void main(String[] args) {
        Developer d = new Developer();
        d.work();
    }
}

