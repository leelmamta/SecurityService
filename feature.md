## Authentication And Authorization 
#### feature-01
* Implement reactive authentication using Spring Security+JWT. 
* Create a /login endpoint to validate user credentials and generate a JWT. 
* Implement a /logout endpoint that invalidates the sessions or token. 

#### feature-02 
* Use BCryptPasswordEncoder to hash and verify passwords. 
* Store and validate passwords in-memory or using  file-based approach 
since you are not using repository.

#### feature-03 
* Define roles(ADMIN, USER, etc.). 
* Configure Spring Security to authorize requests based on roles. 

#### feature-04 
* Secure APIS using JWT-based authentication. 
* Implement a SecurityWebFilterChain to enforce security roles. 

## Backend Structure 
#### feature-05 
* Use Spring WebFlux to expose REST endpoints. 
* Implement request validation using @Valid annotations. 

#### feature-06 
* Use Spring Security's reactive session management with WebFlux. 
* Implement stateful or stateless session handling depending on requirements. 

## Performance and Scalability 
#### feature-07 
* Use Reactor (Mono/Flux) for non-blocking execution. 
* Implement Schedulers.parallel() where needed. 
* Handle backpressure effectively. 

#### feature-08 
* Implement global exception handling using @ControllerAdvice. 
* Log Authentication attempts, failed logins, and authorized access. 

## Deployment & Configurations. 
#### feature-09 
* Use application.yml for configurations. 
* Store sensitive data securely(e.g., using environment variables). 

#### feature -10 
* write Junit5+ WebFluxTest cases. 
* Use mockito for security-related test cases. 



## Backend Structure
* Define the domain model(User, Role, Sessions,etc.).
* Use Spring WebFlux for reactive APIs. 
* Set up a reactive database(e.g., MongoDB with Spring Data Reactive).
* Implement repository layer 

