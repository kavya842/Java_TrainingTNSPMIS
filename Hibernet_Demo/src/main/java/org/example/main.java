package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        // Student 1
        Student s1 = new Student();
        s1.setSid(105);
        s1.setSname("Sailaja");
        s1.setTech("Java");

        // Student 2
        Student s2 = new Student();
        s2.setSid(106);
        s2.setSname("Ravi");
        s2.setTech("Python");

        // Student 3
        Student s3 = new Student();
        s3.setSid(107);
        s3.setSname("Babulu");
        s3.setTech("Spring Boot");

        // Insert multiple students
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);

        transaction.commit();

        session.close();
        factory.close();

        System.out.println("Multiple students saved successfully!");
    }
}