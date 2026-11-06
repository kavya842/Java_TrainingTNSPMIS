# PROGRAM 02: In-Memory User Authentication

`program02_user_login/config/SecurityConfig` creates two users in an
`InMemoryUserDetailsManager`: `admin/admin123` with role `ADMIN` and
`student/student123` with role `STUDENT`. `BCryptPasswordEncoder` stores only
password hashes. The `AuthenticationManager` delegates credentials to the
configured authentication provider.

The users are used by PROGRAM 03. This program has no database. `UserDetails`
is Spring Security's user representation, `UserDetailsService` loads it, and
`AuthenticationManager` verifies the submitted credentials.

Test by sending the PROGRAM 03 login request with either user. A correct
password authenticates; an incorrect password returns `401 Unauthorized`.
