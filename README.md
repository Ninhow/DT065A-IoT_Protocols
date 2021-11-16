# DT065A-IoT_Protocols

##Functional HTTP Server (Labb 0).
The database of this HTTP/Rest server will be handled by a JSON file.

### Finished tasks
* Created a HTTP Server using java ServerSocket and Socket.
* Created a Client Handler where the requests will be parsed and later handled
* Created a Request Header class and Interface. Mostly for more readable code.
* Created Json Manager class.
* Created Parser class where messages will be parsed before custom objects before initialization.


### TODO:
* Request handler implementation for clients
* JSON Manager class implementation for handling the data in the database
* Operation responses implementation
* Exception handler


##CoAP Client (Labb 1).
The database of this HTTP/Rest server will be handled by a JSON file.

### Finished tasks
* Created types for Message, MethodCode, OptionCode, ResponseCode, TypeCode.
* Created Parser that takes in a Byte array and parses every byte into types and lastly create a Message.
* Created Interfaces for Parser.
* Create UDP Client that sends message for connection.


### TODO:
* Some classes are still missing Interface
* POST request left.
* Parser from Types to Messages left
* Need to check what is opaque type
* Need also to figure it out what happens when a option is 0 bytes long. How is the content format decided?

Labb one uses the CoAP standard [(RFC 6690, RFC 7252, RFC 7959, RFC 7641)](test.com)
