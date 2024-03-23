### Factory Method
The Factory Method pattern is used to create objects without specifying the exact class of object that will be created.
This pattern is useful when you need to decouple the creation of an object from its implementation.


The idea is to create a factory class with a single responsibility to create objects, hiding the details of class modules from the user.


### Problem
1. Solves the problem of tight coupling


### Implementation
1. Create interface or abstract class. Add methods which are in commons
2. Implement that interface with subclasses.
3. Create a factory method which initialize subclasses

### Pros
1. Avoid tight coupling
2. Follows SRP - move the object creation code into one place in the program
3. Open/Close Principle - you can extend the code

### Cons
1. Complexity

###  When to use it
1. When you want to give extend its internal components
