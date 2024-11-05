package main.soap.trevisani;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace = "http://trevisani.soap.main/")
@SOAPBinding(style = Style.RPC)
public interface CalculadoraServer {

    @WebMethod
    float soma(float num1, float num2);

    @WebMethod
    float subtracao(float num1, float num2);

    @WebMethod
    float multiplicacao(float num1, float num2);

    @WebMethod
    float divisao(float num1, float num2);
}
