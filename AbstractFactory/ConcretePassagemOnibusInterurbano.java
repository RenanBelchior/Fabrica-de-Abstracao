package AbstractFactory;

import java.util.Calendar;

public class ConcretePassagemOnibusInterurbano extends PassBusInterurbano {
	public ConcretePassagemOnibusInterurbano(String origem, String destino, Calendar DataHoraSaida){
	       super(origem, destino, DataHoraSaida); 
	    }
	    public void exibirDetalhes(){
	        System.out.println("Passagem de ônibus Interurbano ->" + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
	    }

}
