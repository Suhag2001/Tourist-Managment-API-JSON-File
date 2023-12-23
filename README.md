# Tourist Management API

This Spring Boot application provides RESTful APIs for managing tourist data, allowing you to perform CRUD (Create, Read, Update, Delete) operations.

## Endpoints

Assuming the application is running on `localhost:9090`.

### 1. Insert Tourist

- **Endpoint:** `http://localhost:9090/api/v1/tourist`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "touristName": "John Doe",
    "destination": "Paris",
    "startDate": "2023-12-31",
    "duration": 7,
    "price": 1500
  }
  
### 2. Get All Tourists

- **Endpoint:** `http://localhost:9090/api/v1/tourist`
- **Method:** `GET`
- **Response:**
  - Returns a list of all tourists.

### 3. Delete Tourist

- **Endpoint:** `http://localhost:9090/api/v1/tourist/{id}`
- **Method:** `DELETE`
- **Path Variable:** `id` (Tourist ID)
- **Response:**
  - Returns a message indicating the success of the operation.

### 4. Update Tourist

- **Endpoint:** `http://localhost:9090/api/v1/tourist/{id}`
- **Method:** `PUT`
- **Path Variable:** `id` (Tourist ID)
- **Request Body:**
  ```json
  {
    "touristName": "Updated Name",
    "destination": "Updated Destination",
    "startDate": "2024-01-15",
    "duration": 10,
    "price": 2000
  }
- **Response:**
  - Returns a message indicating the success of the operation.
    
### 5. Get Tourist by ID

- **Endpoint:** `http://localhost:9090/api/v1/tourist/{id}`
- **Method:** `GET`
- **Path Variable:** `id` (Tourist ID)
- **Response:**
  - Returns details of the specified tourist.

## Running the Application

1. Clone the repository: `git clone <repository-url>`
2. Open the project in your preferred IDE.
3. Run the application.
3. Hit the APIs in Postman

## Notes

- Tourist data is stored in a JSON file.
- Ensure that the necessary dependencies are added to the project.
- Customize the application properties as needed.

