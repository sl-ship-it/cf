## CurrencyFair Code Challenge

### Folder Structure
- api server: The backend Java SpringBoot application to perform CRUD of the order data
- client: The ReactJS frontend to display the order data in a simple table view
- simple websocket server: a simple node js implemented websocket server to notify frontend client to render the latest order data

### System prequisites:
- Open JDK 11 (api-server)
- Maven (api-server)
- NodeJS with yarn or npm (frontend and the websocket server)


### API Server

The project is built on SpringBoot framework. There are two APIs
- GET /v1/order to list all the orders in the database
- POST /v1/order to create a new order

The application is using the common three layers approach
- Controller to handle the incoming web request
- Business Service to perform business logic
- Repository to communicate with the persistent layer

Build the application
```
mvn clean install
```

Test the application \
As the application doesnt have complicated logic, I have implemented two WebMvc test cases to test the end to end GET and POST request of the two APIs
```
mvn test
```

### Client
The ReactJS frontend is built using create-react-app framework. \
The frontend only consists of some simple elements and a table to display the data. \
I have used materialized-UI table element but not tailor-made css components for this demo purpose. \

The React elements are built with the react-hook functional style. \
The element are organized into the commmon folder structure
- container which manages the UI state
- component which is the layout of the breakdown elements
- pages which represent each website page

The client has used http get request for the first render to get all data from the api server and then the subsequent order creation are notified with WebSocket connection

Install dependecy
```
yarn install
```

local start
```
yarn start
```

production build
```
yarn build
```

### Simple websocket server
Its a simple websocket server built by NodeJS with few lines of code.

Start the server
```
node index.js
```