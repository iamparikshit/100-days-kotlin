### Adapter
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate

This pattern is useful when you want to reuse existing classes with incompatible interfaces or integrate third-party libraries into your codebase without modifying their source code.  

The Adapter Pattern is also known as Wrapper.

### Problem
1. Solve the problem of integration and provides a wrapper with which it is easy to integrate new subsystem.
   

### Implementation
1. Make sure that you have at least two classes with incompatible interfaces
2. Add a adapter class which implements the given interface
3. Pass a parameter of new class to this adapter class

### Pros
1. Follows SRP
2. OPEN/CLOSE principle

### Cons
1. Complexity increase

###  When to use it
1.  Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code.