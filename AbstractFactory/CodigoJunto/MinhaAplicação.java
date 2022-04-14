package AbstractFactory.CodigoJunto;

import java.util.Calendar;
import java.util.GregorianCalendar;

import AbstractFactory.ConcreteEmpresaOnibus;
import AbstractFactory.EmpresaOnibus;
import AbstractFactory.PassBusInterurbano;
import AbstractFactory.PassBusUrbano;

public class MinhaAplica��o {
	 public static void main(String args[]) {
         
 EmpresaOnibus viacaoFluminense = new ConcreteEmpresaOnibus();
 
 
 PassBusUrbano passurbano = viacaoFluminense.emitePassagemBusUrbano("Niter�i","Petr�polis", new GregorianCalendar(2022, Calendar.MARCH, 10,11,0));
 
 PassBusInterurbano passInterurbano = viacaoFluminense.emitePassagemBusInterurbano("Rio de Janeiro","S�o Paulo", new GregorianCalendar(2022, Calendar.MARCH, 10,11,0));

 
 passurbano.exibirDetalhes();
 passInterurbano.exibirDetalhes();
 }
}