# Microservice Architecture

Microservice Architecture is an architectural style that structures an application as a collection of services that are:
* Independently deployable
* Loosely coupled

A microservices architecture consists of a collection of small, autonomous services. Each service is self-contained and should implement a single business capability within a bounded context.

### Characteristics 
1. small, independent, and loosely coupled. A single small team of developers can write and maintain a service.
2. Each service is a separate codebase, which can be managed by a small development team.
3. Services can be deployed independently. A team can update an existing service without rebuilding and redeploying the entire application
4. Supports polyglot programming. For example, services don't need to share the same technology stack, libraries, or frameworks.

### Pros 
1. Scalability : Services can be scaled independently, without scaling entire application
2. Fault isolation :  If an individual microservice becomes unavailable, it won't disrupt the entire application, 
3. Data separation : Each service accesses its own database or storage volume.
4. Decentralized :  Unique microservices components have few if any dependencies, although loose coupling requires frequent and extensive communication between components.

Ideally we should use microservices when we have a condition like, we want to deploy more frequently,
we need to scale up and down more frequently, when application is too big