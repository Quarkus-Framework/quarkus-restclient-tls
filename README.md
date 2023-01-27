# quarkus-restclient-tls Project

This maven project contains two Quarkus modules, `quarkus-client` e `quarkus-server` and use the 
truststore with certificate for create a TLS secure connection.
The two quarkus apps create the certificate `client.keystore` e `server.truststore` running the files
`generate_client_keystore.sh` and `generate_server_keystore.sh`.

In the files `application.properties` there are the properties about server exposed and certificate.

The `quarkus-server` app expose the `http://localhost:8443/server` API.
The `quarkus-client` app calls this API with two different endpoints: 
- `http://localhost:8080/client/client`
- `http://localhost:8080/client/clientBuilder`