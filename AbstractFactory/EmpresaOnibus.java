package AbstractFactory;

import java.util.Calendar;

public abstract class EmpresaOnibus {
	public abstract PassBusUrbano emitePassagemBusUrbano(String origem, String destino, Calendar DataHoraSaida);
    public abstract PassBusInterurbano emitePassagemBusInterurbano(String origem, String destino, Calendar DataHoraSaida);
  
  }
