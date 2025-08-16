##Base URL 
http://localhost:8080/YOUR_APP_NAME/first

### 1. Get All Products

##CURL
curl -X GET http://localhost:8080/products

##Postman
Method: GET
URL: http://localhost:8080/products

### 2. Get Product by ID
##CURL
curl -X GET http://localhost:8080/products/1

##Postman
Method: GET
URL: http://localhost:8080/products/1

### 3.Create Product

curl -X POST http://localhost:8080/products \
  -H "Content-Type: application/json" \
  -d '{
    "id": 1,
    "name": "Laptop",
    "price": 1000,
    "quantity": 10
  }'

##Postman

Method: POST

URL: http://localhost:8080/products

Headers: Content-Type: application/json

Body (raw JSON):
{
  "id": 1,
  "name": "Laptop",
  "price": 1000,
  "quantity": 10
}

### 4.Update Product (PUT)

curl -X PUT http://localhost:8080/products/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Gaming Laptop",
    "price": 1200,
    "quantity": 8
  }'

##Postman
Method: PUT
URL: http://localhost:8080/products/1
Headers: Content-Type: application/json
Body (raw JSON):
{
  "name": "Gaming Laptop",
  "price": 1200,
  "quantity": 8
}

### 5.Delete Product

curl -X DELETE http://localhost:8080/products/1

##Postman
Method: DELETE
URL: http://localhost:8080/products/1


  
