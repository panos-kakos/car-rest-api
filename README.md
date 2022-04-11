## Simple Car Rest Api
The application makes use of @ControllerAdvice, an annotation-driven interceptor that is handling exceptions across the application.
### Availale operations and responses

| HTTP Method  | Path  | Status Code  | Desc.  |
|---|---|---|---|
| GET   | /api/cars  | 200 (OK)  |  Fetch all Car resources |   |
| GET  | /api/cars/{id} | 200 (OK)   | One Car resource is fetched  |   |
| POST  |  /api/cars | 201 (Created)  | One Car resource is created   |   |
| PUT  | /api/cars/{id}  | 200 (OK)  | Car resource is updated  |   |
| DELETE  | /api/cars/{id}  | 204 (No Content)  | Car resource is deleted  |   |
