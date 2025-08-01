auth-service/
├── controller/          # Expose REST APIs
├── service/             # Business logic (login, signup, Google auth)
├── model/               # User entity, enum roles
├── repository/          # Spring Data JPA
├── dto/                 # LoginRequest, SignupRequest, etc.
├── security/            # JWT utils, filters, config
├── ai/                  # AI-based fraud detection logic
├── config/              # Swagger, CORS, AppProperties
└── exception/           # Custom error handling

✅ User Signup/Login with JWT

✅ Sync with Google OAuth

✅ Integration point for AI fraud detection

✅ Clean MVC + layered structure

✅ Extendable for role-based access in future