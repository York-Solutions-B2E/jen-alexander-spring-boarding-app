# happy-tails-backend

Notes for myself:

Controller Layer:
- It will contain Rest APIs definition and request body.
- Only API calls should invoke the Controller Layer.

Service Layer:
- It will only take the data from the controller layer and transfer it to the repository layer. It acts as an intermediary layer between controller and repository.
- It will also contain business logic and model the data for the repository layer.

Repository Layer:
- It will interact with the underlying database.
- The service Layer should only invoke the repository layer.