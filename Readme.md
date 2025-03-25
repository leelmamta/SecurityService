My Main aim is to validate the user and allow a particular role to the paritcular user
And Once the user is authenticated it will lend to the home page.
Frontend- HomePage  Login/SignUp Pages.
Store the data into DynamoDB.
# SecurityService
This service is to Validate the User and provide(authentication) the User Role (Authorization)
### Authentication 🔑 
Authentication (Who are you?)
Verifies the user’s identity (e.g., username/password).
Involves credentials comparison and session creation.

### Authorization 🛡️
Authorization (What can you do?)
Determines what actions/resources the authenticated user is allowed to access (e.g., roles like ADMIN, USER).

Other things to handle-
Session handling: Implement token-based sessions or cookies.

Password hashing: Use BCrypt or SHA-256 to securely store passwords.

Exception handling: Create a custom AccessDeniedException.

Custom annotations: Define your own @RoleRequired annotation for clean code.

Interceptor-based authorization: Use Spring HandlerInterceptor to secure endpoints. 