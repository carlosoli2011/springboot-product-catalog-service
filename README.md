# springboot-product-catalog-service

Spring Boot — Developing example Microservice

In this article, we will develop our example microservice based on the spring-boot framework and the fundamentals of microservices architecture. This is exercise-driven and segregated into four areas — Design, Development, Test, and Deploy.

Running and Accessing Service
mvn spring-boot:run

Access the restful service at http://localhost:8080

API

```
Create Product
Endpoint: http://localhost:8080/product
Request Body:
{
  "id": "1",
  "title": "Title Product 1",
  "desc": "Description Product 1",
  "imagePath": "/images/product-1.jpg",
  "unitPrice": 250.64
 }
 ```

```
Get Product
Endpoint: http://localhost:8080/product/test-product-1
```

```
Get Product List
Endpoint: http://localhost:8080/product 
```

```
Update Product
Endpoint: http://localhost:8080/product (PUT)
Request Body:
{
  "id": "1",
  "title": "Title Product 1 updated",
  "desc": "Description Product 1 updated",
  "imagePath": "/images/product-1-updated.jpg",
  "unitPrice": 240.36
 }
```
```
Delete Product
Endpoint: http://localhost:8080/product/test-product-id
```

Testing example MicroService

With the sample tests, we are able to validate

API
- Create Product (API returns a successful response)
- Get Product (API returns a successful response, API returns correct product definition )
- Get Product List (API returns a successful response, API returns the correct list of product definitions )
- Update Product (API returns a successful response)
- Delete Product (API returns a successful response)



Deploying example microservice

maven command: `mvn spring-boot:run`

Maven build `mvn install` command

You can directly execute the following command:
`java -jar target/product-catalog-service-0.0.1-SNAPSHOT.jar`


