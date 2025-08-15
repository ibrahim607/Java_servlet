##Base URL 
http://localhost:8080/YOUR_APP_NAME/first

#for Curl testing 
##GET
curl -X GET "http://localhost:8080/YOUR_APP_NAME/first"

##POST
curl -X POST "http://localhost:8080/YOUR_APP_NAME/first" \
  -H "Content-Type: application/json" \
  -d '{
        "name": "Laptop",
        "price": 999.99,
        "quantity": 5
      }'

##PUT
curl -X PUT "http://localhost:8080/YOUR_APP_NAME/first?id=1" \
  -H "Content-Type: application/json" \
  -d '{
        "name": "Updated Laptop",
        "price": 899.99,
        "quantity": 10
      }'

##DELETE
curl -X DELETE "http://localhost:8080/YOUR_APP_NAME/first?id=1"

