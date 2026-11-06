# PROGRAM 01: Basic REST API

## Objective

This program introduces basic REST endpoints in Spring Boot before authentication is added.

## Endpoints

### `GET /program01/hello`

Example response:

```text
Hello from Program 01
```

### `GET /program01/user`

Example response:

```text
This is the user endpoint from Program 01
```

Both endpoints return HTTP `200 OK` when the request is successful.

## Classes

- `HelloController` handles `/program01/hello`.
- `UserController` handles `/program01/user`.

`@RestController` tells Spring that each class contains REST endpoints and that
the returned values should be written directly to the HTTP response.
`@RequestMapping("/program01")` provides a common URL prefix.
`@GetMapping` maps a method to an HTTP GET request.
`ResponseEntity` makes the response body and HTTP status explicit.

## Testing with Postman

1. Start the application from IntelliJ IDEA or with `mvnw spring-boot:run`.
2. Create a GET request to `http://localhost:8080/program01/hello`.
3. Send the request and verify the `200 OK` response.
4. Repeat with `http://localhost:8080/program01/user`.

No username, password, JWT, or database is required for this program.

## Concepts learned

- Spring Boot REST controllers
- URL mapping with `@RequestMapping` and `@GetMapping`
- HTTP GET requests
- Response bodies
- HTTP status codes with `ResponseEntity`
