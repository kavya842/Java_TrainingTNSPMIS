# PROGRAM 04: JWT Validation

Send `POST /program04/validate?token=YOUR_TOKEN`. The controller delegates to
`JwtValidationService`, which uses `JwtService` to verify the signature,
decode the username, and check the expiration claim. A valid token returns a
message identifying its user. Expired, malformed, or incorrectly signed
tokens return an invalid-token message.

The validation endpoint is public only so the learning step can be tested
directly. In Postman, first obtain a token from PROGRAM 03, URL-encode it as a
query parameter, and compare it with a changed or expired token.
