# PROGRAM 03: User Login and JWT Generation

`AuthController` accepts `POST /program03/login` with JSON such as
`{"username":"admin","password":"admin123"}`. It uses the
`AuthenticationManager` from PROGRAM 02 and returns `200 OK` with a token, or
`401 Unauthorized` for invalid credentials.

`LoginRequest` is the input record, `AuthResponse` is the output record, and
`JwtService` creates a signed token. The token contains the username, role,
issued-at time, and expiration time. Its header identifies the algorithm, its
payload contains claims, and its signature proves that the server signed it.

In Postman, set method POST, URL `http://localhost:8080/program03/login`,
and Body > raw > JSON. Copy the returned token for later programs.
