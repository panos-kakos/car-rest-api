# Car resource api
Operations pertaining to Car resource

## Sections
In this document:

- [URIs and some REST EndPoints](#uris-and-some-rest-endpoints)
- [Overview](#overview)
- [API Rest EndPoints documentation](#api-rest-endpoints-documentation)
- [Exceptions and error handlers](#exceptions-and-error-handlers)
- [Build](#build)
- [Deploy](#deploy)



## URIs and some REST EndPoints

**Global URI: /api**
```
- cars URI: /api/cars
```

EndPoints samples: *To see all the REST EndPoints please check the swagger documentation*

**Cars**
```
GET /cars
View a full list of available cars
```

## Overview
This describes the resources that make up the cars  REST API v1. If you have any problems or requests please contact pkakos1992@gmail.com.

### Schema
All data is sent and received as JSON.


**Summary Representations**

Car
```
{  
   "id":1,
   "brand":"Tesla"
}
```

## API Rest EndPoints documentation
The service use swagger to generate the documentation dynamically, please visit the next URI to have access to all the REST EndPoints:
http://server:port/swagger-ui.html

### Availale operations and responses

| HTTP Method  | Path  | Status Code  | Desc.  |
|---|---|---|---|
| GET   | /api/cars  | 200 (OK)  |  Fetch all Car resources |   |
| GET  | /api/cars/{id} | 200 (OK)   | One Car resource is fetched  |   |
| POST  |  /api/cars | 201 (Created)  | One Car resource is created   |   |
| PUT  | /api/cars/{id}  | 200 (OK)  | Car resource is updated  |   |
| DELETE  | /api/cars/{id}  | 204 (No Content)  | Car resource is deleted  |   |



## Exceptions and error handlers
Every exception or errors returned by the API are encapsulated in the **object ApiError**:

```
HttpStatus status;
LocalDateTime timestamp; format: "dd-MM-yyyy hh:mm:ss"
String message;
String debugMessage;
List<ApiSubError> subErrors;
```

**Every exception handler is defined in the class RestExceptionHandler** that extends ResponseEntityExceptionHandler
and use the method buildResponseEntity to build the ResponseEntity with the HTTP status code and the ApiError object.

```Java
 private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
 ```

### Entity not found
HTTP return code 404

### Bad request
HTTP return code 400


## Security
*TODO - the service is not using security at the moment. To be specified*

## Build

To build the project artifact locally, you can type the following on a terminal
```
$ mvn package
```

## Deploy

The jar file generated is both executable and deployable into an external container.
