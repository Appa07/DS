package org.me.calculator;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;


@WebService(serviceName = "CalculatorsWS")
@Stateless()

public class CalculatorWS {

@WebMethod (operationName = "add")
public int add(@WebParam(name ="i") int i, @WebParam(name = "j") int j) {
int k = i+j;
return k;
}
}
