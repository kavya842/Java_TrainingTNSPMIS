// -------------Multi-level inheritance-----------------

//Multilevel Inheritance:-
// Multilevel inheritance in Java is a type of inheritance in which one class inherits from another class, and a third class inherits from the second class.
class College {
    void collegeName() {
        System.out.println("College: DVR & Dr. HS MIC College of Technology");
    }
}

class Department extends College {
    void departmentName() {
        System.out.println("Department: Information Technology");
    }
}

class Student extends Department {
    void studentDetails() {
        System.out.println("Student: Kavya");
    }
}

public class Multi_level_inheritance{
    public static void main(String[] args) {
        Student s = new Student();

        s.collegeName();
        s.departmentName();
        s.studentDetails();
    }
}
