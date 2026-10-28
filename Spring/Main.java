//! 1. First, understand the big picture
// Imagine you want to build a website for a college. Students should be able to log in, view their marks, check attendance, and update their profiles.

// You can build this using Java, but you need to handle many things:
// - Receiving requests from the website.
// - Checking username and password.
// - Connecting to a database.
// - Processing business logic.
// - Returning responses to the user.
// - Managing objects and their dependencies.
// - Configuring the application and its server.
// Java gives you the programming language, but you need additional tools and frameworks to build the entire application conveniently.

//---------------------------------------------------------------------------------------------------------------------------------------------------

// That's where Spring and Spring Boot come in.

//                       Java

// The programming language used to write your code.


//                      Spring Framework

// Provides tools to build and organize Java applications.


//                    Spring Boot

// Makes Spring applications easier and faster to set up and run.


//                     Your application

// For example, a Student Management System, banking application, or REST API.

//!2. What is a framework?
// Before learning Spring, you should understand the word framework.

// A framework is a ready-made structure that helps developers build applications without writing everything from scratch.

// Think about building a house.
// - Without a framework: you arrange nearly everything yourself.
// - With a framework: you get a prepared structure, tools, and rules that make construction easier.
// In programming, a framework provides reusable functionality and a structure for your code.

//!You can use Java without Spring. However, Spring helps you organize larger applications and reduces the amount of infrastructure code you need to write.
//----------------------------------------------------------------------------------

//!3. What is Spring Framework?
// Spring Framework is an open-source framework for developing Java applications.

// It provides features that help developers build web applications, REST APIs, enterprise applications, and applications that communicate with databases and other services.

// Some of its important features are:
// - Inversion of Control (IoC).
// - Dependency Injection (DI).
// - Aspect-Oriented Programming (AOP).
// - Transaction management.
// - Web development through Spring MVC.
// - Integration with databases and other technologies.

//Let's understand why these features matter.

//! Example: Java without Spring
// Suppose you want to send a notification to a student.

// class EmailService {
//     void sendEmail() {
//         System.out.println("Email sent!");
//     }
// }

// class StudentService {
//     EmailService emailService = new EmailService();

//     void notifyStudent() {
//         emailService.sendEmail();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         StudentService service = new StudentService();
//         service.notifyStudent();
//     }
// }

//!Output: Email sent!

// But imagine your application has 100 classes, and many classes create their own objects using new. Managing these objects, replacing implementations, and testing the code can become difficult.

//! Example: The same idea with Spring
// import org.springframework.stereotype.Service;

// @Service
// class EmailService {
//     public void sendEmail() {
//         System.out.println("Email sent!");
//     }
// }


//-------------------------------------------------------------------


// import org.springframework.stereotype.Service;

// @Service
// class StudentService {

//     private final EmailService emailService;

//     public StudentService(EmailService emailService) {
//         this.emailService = emailService;
//     }

//     public void notifyStudent() {
//         emailService.sendEmail();
//     }
// }

// Here, Spring can create and manage both service objects and provide EmailService to StudentService.

// This is called Dependency Injection, which we'll explain in detail below.

// Notice that the Spring version uses annotations and a constructor. It also needs a Spring application context configured to discover and manage these classes; the snippets alone aren't a complete runnable application.

//------------------------------------------------------------------------------------------------

//! 4. History of Spring and Spring Boot
// Let's understand why these technologies were created.

// 2002
// The idea behind Spring
// Rod Johnson published Expert One-on-One J2EE Design and Development, which included code and ideas that helped form the Spring Framework.


// 2003
// Spring became an open-source project
// Spring emerged to address the complexity of building enterprise Java applications with the technologies of that time.

// 2014
// Spring Boot 1.0
// Spring Boot 1.0 was released in April 2014, making it much easier to create and run Spring applications with sensible defaults and embedded servers.

// Today
// Modern Java development
// Spring and Spring Boot are used for web applications, REST APIs, database-driven systems, cloud applications, and microservices.

// The early history is documented by Spring itself. The name “Spring” was chosen to represent a fresh start after the complexity associated with traditional J2EE development.

//!Why was Spring needed?
// Earlier enterprise Java development often required considerable configuration, complex server setup, and substantial infrastructure code.

// Spring helped by providing:
// 1. A way to manage Java objects and their dependencies.
// 2. Reusable solutions for common application tasks.
// 3. Better separation between business logic and infrastructure.
// 4. Support for database access, web development, and transactions.

//! Why was Spring Boot needed?
// Even after Spring made application development easier, developers still needed to configure many things before an application could run.

// For example, they might need to:
// - Select compatible library versions.
// - Add multiple dependencies.
// - Configure a web server.
// - Set up Spring configuration.
// - Configure database connections.
// - Package and deploy the application.
// Spring Boot was created to reduce this setup work through auto-configuration, starter dependencies, and embedded servers. 

// Remember the history in one sentence: Spring simplified Java application development; Spring Boot simplified setting up and running Spring applications.
