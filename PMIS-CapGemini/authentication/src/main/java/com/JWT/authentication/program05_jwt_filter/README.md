# PROGRAM 05: JWT Authentication Filter

`JwtAuthenticationFilter` extends `OncePerRequestFilter`, so it examines each
request once. It reads the `Authorization: Bearer TOKEN` header, validates the
token, loads the user, creates a `UsernamePasswordAuthenticationToken`, and
stores it in `SecurityContextHolder`. The filter then continues the
`FilterChain`.

The active `SecurityConfig` is here. It makes the application stateless and
registers this one JWT filter before Spring's username/password filter.
Invalid tokens remain unauthenticated and are rejected by protected routes.
