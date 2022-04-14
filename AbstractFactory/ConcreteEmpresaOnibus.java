package AbstractFactory;

import java.util.Calendar;

public class ConcreteEmpresaOnibus extends EmpresaOnibus {
	 public  PassBusUrbano emitePassagemBusUrbano(String origem, String destino, Calendar DataHoraSaida) {
	      return new ConcretePassagemOnibusUrbano(origem, destino, DataHoraSaida);
	  }
	    public  PassBusInterurbano emitePassagemBusInterurbano(String origem, String destino, Calendar DataHoraSaida) {
	       return new ConcretePassagemOnibusInterurbano(origem, destino, DataHoraSaida);  
	  }

}
