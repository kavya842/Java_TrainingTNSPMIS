
class CollegeStaff {
    void collegeName() {
        System.out.println("DVR & Dr. HS MIC College of Technology");
    }
}

class Professor extends CollegeStaff {
    void teach() {
        System.out.println("Professor teaches students");
    }
}

class Student extends CollegeStaff {
    void study() {
        System.out.println("Student studies Java");
    }
}

class Librarian extends CollegeStaff {
    void manageBooks() {
        System.out.println("Librarian manages books");
    }
}

public class Hierarchical_inheritance{
    public static void main(String[] args) {
        Professor p = new Professor();
        Student s = new Student();
        Librarian l = new Librarian();

        p.collegeName();
        p.teach();

        s.collegeName();
        s.study();

        l.collegeName();
        l.manageBooks();
    }
}
