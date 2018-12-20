# Vert.x3 gRPC example

This project contains an example to show the use of gRPC services with Vert.x3.

## Setup a MongoDB

Although you can use your preferred database, this project is already setup to
work with a MongoDB database. You only need to start a server using the following
docker command:

```
docker run -d --rm -p 27017:27017 -d mongo
``` 