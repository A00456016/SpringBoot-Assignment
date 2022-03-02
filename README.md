# SpringBoot-Assignment
A00456016 - Harsh Panchal

Through this rest api you can perform below operations:
GET, POST, PUT, DELETE on postman app.

To get list of hotel on postman run below get request:
GET : http://localhost:8080/hotels/

To get particular hotel you can write get request like below with id value:
GET : http://localhost:8080/hotels/1

To add new hotel use below post request and body with below parameters on postman:
POST : http://localhost:8080/hotels/

{ 	
    "name": "Heavens",
    "check_in": "01-01-2022",
    "check_out": "02-03-2022"
}
OR----------------------------------
{
    "id": "1",
    "name": "Heavens",
    "check_in": "01-01-2022",
    "check_out": "02-03-2022"
}

To update content of any hotel write below PUT request with id and change value of parameters:
PUT : http://localhost:8080/hotels/1

{ 	
    "name": "Courtyard",
    "check_in": "01-01-2022",
    "check_out": "02-03-2022"
}

To delete any hotel write below delete request with id :

DELETE : http://localhost:8080/hotels/1

{ 	
    "name": "Courtyard",
    "check_in": "01-01-2022",
    "check_out": "02-03-2022"
}
