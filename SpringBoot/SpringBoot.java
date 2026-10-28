//!What exactly is Spring Boot?
// Spring Boot is a framework built on the Spring Framework that helps you create stand-alone, production-ready Spring applications with minimal configuration.

// For example, you can create a web application and run it using a command such as:
// mvn spring-boot:run
// You usually don't need to install and configure a separate external Tomcat server for a standard Spring Boot web application, because the web starter includes an embedded server by default.

//! Spring Boot helps with:
// - Auto-configuration: Automatically configures many components based on the dependencies and settings you provide.
// - Starter dependencies: Makes it easier to add groups of compatible libraries.
// - Embedded server: Lets you run a web application as a standalone application.
// - External configuration: Lets you change settings without rewriting Java code.
// - Production support: Offers features for health checks, metrics, and monitoring through suitable dependencies and configuration.
// You still need to write the application's business logic, security rules, and database logic. Spring Boot does not automatically build your whole application for you.