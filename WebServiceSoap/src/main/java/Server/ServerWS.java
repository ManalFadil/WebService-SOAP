package Server;

import jakarta.xml.ws.Endpoint;

public class ServerWS {

    public static void main(String[] args) {
        String url = "http://localhost:6655/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service est sur "+url);
    }

}
