# Microservice Design Pattern

### 1. Database per service
Each service has its own db.

#### Features 
1. Each microservice can choose the database technology that best suits its requirements
2. If one of the database server is down, this will not affect to other services.
3. Since each microservice and its database are separate, they can be scaled independently 


### 2. Event Sourcing
Data is stored as a series of events, instead of direct updates to data stores.

#### Features
1. By choosing this pattern, you can identify and reconstruct the application’s state for any point in time.
2. This produces a persistent audit trail and makes debugging easier

#### Cons 
1. Handling multiple versions of an event-based application could be tricky.


### 3. CQRS 
CQRS stands for Command and Query Responsibility Segregation. Basically, this pattern separates read and update operations for a database.
separates the below things
Command -> which do the modifications
Query -> retrieve data


#### Features
1. Improved Performance

#### Cons
1. Complexity
2. Consistency

### 4. SAGA
The saga pattern is a failure management pattern that helps establish consistency in distributed applications, and coordinates transactions between multiple microservices to maintain data consistency.
to manage long-lived transactions that span multiple services

#### Features 
1. Consistency

#### Cons
1. Difficult to implement
2. Difficult to debug

### Additional links : 
https://www.baeldung.com/cs/saga-pattern-microservices

### 5. BFF
(BFF) pattern refers to having one backend per user experience, instead of having only one general-purpose API backend.

#### Features
1. Separation of concerns
2. Better Security
3. Better error handling in frontend

#### Cons 
1. Code duplication

Instead of calling general purpose api gateway, we create separate bff for separate UI Interface(Desktop, Mobile)


### 6. API Gateway
if you want to design and build complex large microservices-based applications with multiple client applications. 
The pattern is similar to the facade pattern from object-oriented design, but it is part of a distributed system reverse proxy or gateway routing for using as a synchronous communication model


The pattern provides a reverse proxy to redirect or route requests to your internal microservices endpoints. An API gateway provides a single endpoint or URL for the client applications, and it internally maps the requests to internal microservices.

#### Features
1. It encloses the whole internal structure of web applications.
2. Centralized Entry point


#### Cons
1. Increase Dependency - Tight coupling

### 7. Strangler
Iterative approach of Monolith to microservice

### 8. Circuit Breaker

Circuit Breaker is a design pattern used in microservices architecture where different services interacting with each other over a network,
and circuit breaker protects them from cascading failures to enhance the resiliency and fault tolerance of a distributed system


In simple terms, a Circuit Breaker is a protective and safety mechanism that prevents your application from continuously making requests to a service that has problems or is down.

#### Features
1. Handles errors gracefully and provides better under experience.
2. State changes of the circuit breaker can be used for error monitoring.

#### Example 
netflix Hystrix
Resilience4j
istio

#### Additional Links 
https://medium.com/@minadev/circuit-breaker-pattern-in-microservices-9568320f2059#:~:text=Circuit%20Breaker%20is%20a%20design,tolerance%20of%20a%20distributed%20system.


# Externalize configuration

We can externalize all configurations from database credentials to network urls. Service will read the configuration data during startup e.g. from a properties file/ system environment variables or using command line arguments. This pattern helps in deploying the microservices without any modification/recompilation needed.
It is to provide configuration externally like through env variables which can have different values in different envs.

#### Additional Links
https://www.tutorialspoint.com/microservices_design_patterns/microservices_design_patterns_external_configuration.htm