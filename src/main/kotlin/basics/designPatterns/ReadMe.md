# Singleton Design Pattern

Singleton is a creational design pattern that lets you ensure that a class has only one instance

### Problem : solves two problem but violets SRP.
1. Ensure that a class has just a single instance.
2. Provide a global access point to that instance.


### Implementation : 
1. Make the default constructor private.
2. Create a static creation method that acts as a constructor.
3. this method calls the private constructor to create an object and saves it in a static field.
4. All following calls to this method return the cached object.


### Learning : 
1. Adding empty private constructor is mandatory. It restricts to create new object from outside the class.
2. It is globally accessible because of static thing.
3. In coding we have use volatile keyword.
4. The use of the @Volatile modifier ensures that changes to instance made by one thread are visible to other threads immediately.

### Pros :
1. Single instance
2. Global access
3. Initialized only when it is requested.
4. Tight Coupling due to single instance.

### Cons :
1. Concurrency Issues: In a multi-threaded environment, the Singleton pattern may introduce concurrency issues if not implemented correctly.
2. Difficult to Test: Due to its global state and tight coupling

### When to use it :
The Singleton pattern is typically used when you need to ensure that a class has only one instance and provide a global point of access to that instance.
Here are some scenarios where the Singleton pattern may be appropriate:
 1. **Resource Management:** When you have a limited or shared resource that needs to be accessed from multiple parts of the application, such as a database connection pool, file system handler, or configuration manager.

 2. **Logging:** In logging frameworks, a Singleton pattern can be used to provide a single point of access to the logger instance throughout the application, ensuring consistent logging behavior and configuration.

 3. **Caching:** Singleton can be used to implement caching mechanisms where you want to maintain a single cache instance across the application to improve performance by storing frequently accessed data.