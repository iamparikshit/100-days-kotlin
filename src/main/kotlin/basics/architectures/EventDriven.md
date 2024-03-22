# Event Driven Architecture

It is pattern that allows decoupled applications to asynchronously publish and subscribe to the events through an event broker.

Pros : 
1. Decoupling
2. Immutability
   Events can't be changed once created, so they can be shared with multiple services without the risk of one service modifying or removing information that other services would then consume.
3. Persist ability
   In traditional models, if Service 2 is down, then Service 1's request to Service 2 will bounce, causing errors. With events, the broker can persist the event until Service 2 is back online to receive the event. This avoids a single point of failure and improves durability.
4. Asynchronous communication


Cons :
1. Complexity

When to use :
Overall, event-driven architecture is a powerful paradigm for building scalable, loosely-coupled, and responsive systems that can efficiently process and react to a large volume of events in real-time. 
It is particularly beneficial for applications with asynchronous communication requirements, 