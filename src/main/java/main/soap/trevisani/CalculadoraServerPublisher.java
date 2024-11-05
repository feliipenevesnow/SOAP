package main.soap.trevisani;

import javax.xml.ws.Endpoint;

public class CalculadoraServerPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9876/calc", new CalculadoraServerImpl());
        System.out.println("Servidor publicado em http://localhost:9876/calc");
    }
}
