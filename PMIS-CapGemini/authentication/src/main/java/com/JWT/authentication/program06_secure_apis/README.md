# PROGRAM 06: Securing REST APIs

`SecureUserController` provides:

- `GET /program06/public`: no token required.
- `GET /program06/user`: requires a valid Bearer token.
- `GET /program06/profile`: returns the authenticated username and role.

In Postman, call the public endpoint without a header. Call the other two
with `Authorization: Bearer YOUR_TOKEN` from PROGRAM 03. Missing, malformed,
expired, or incorrectly signed tokens result in `401 Unauthorized`; a valid
token allows Spring Security to continue to the controller.
