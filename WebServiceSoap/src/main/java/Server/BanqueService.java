package Server;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//POJO : Plain Old java Object
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversionEuroToDh")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, 10+Math.random()*555, new Date());
    }

    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, 10+Math.random()*555, new Date()),
                new Compte(2, 10+Math.random()*555, new Date()),
                new Compte(3, 10+Math.random()*555, new Date())

        );

    }
}
