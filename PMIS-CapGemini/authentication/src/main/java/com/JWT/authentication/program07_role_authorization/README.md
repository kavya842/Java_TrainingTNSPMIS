# PROGRAM 07: Role-Based Authorization

`RoleController` provides public, shared-user, admin-only, and student-only
endpoints:

- `GET /program07/public`: everyone.
- `GET /program07/user`: `ADMIN` or `STUDENT`.
- `GET /program07/admin`: only `ADMIN`.
- `GET /program07/student`: only `STUDENT`.

Log in as `admin/admin123` or `student/student123`, then send the Bearer token
in Postman. Authentication proves who the caller is; authorization checks the
role. Therefore an authenticated student receives `403 Forbidden` from the
admin endpoint, while a missing or invalid token receives `401 Unauthorized`.
