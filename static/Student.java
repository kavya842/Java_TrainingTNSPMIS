class Student {
    int id;
    String name;
    static String college = "MIC COLLEGE OF TECHNOLOGY";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " is studying in " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "kavya");
        Student s2 = new Student(2, "Mani");
        s1.display();
        s2.display();
    }
}