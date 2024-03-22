# Monolithic Architecture 

A monolithic architecture is a traditional software development model that uses one code base to perform multiple business functions.
Like
* Authorisation layer
* Presentation layer - UI
* Business logic 
* Application Integrations - APIs
* Notification Modules

and many other components which are combined into single codebase.

### Pros : 
1. Simple to develop
2. Easy to test
3. Easy to deploy - copy the packaged application to server.
4. Cost - Deploys as single unit, so reduces the cost


### Cons :
1. Full Redeployment 
2. Reliability - Bug in one module can bring entire process down
3. Scalability:When one feature or area of the application needs to scale horizontally, the entire large application (including subsystems that do not require additional resources) must be scaled. This can lead to both slowness in scaling since deployments take longer, as well as increased cost since each instance will have larger hardware requirements to run when compared to microservices.
4. Complexity creep - Over a time application will grow drastically and adding new feature will be more complex


### When to use Monolithic :
Monolithic architecture is well suited for small-scale applications where simplicity and speed of deployment are key. Small teams with limited resources may find monolithic architecture easier to manage because it doesn't require the overhead of inter-service communication 