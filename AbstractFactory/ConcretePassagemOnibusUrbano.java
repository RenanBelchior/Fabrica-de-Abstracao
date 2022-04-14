package AbstractFactory;

import java.util.Calendar;

public class ConcretePassagemOnibusUrbano extends PassBusUrbano {
    public ConcretePassagemOnibusUrbano(String origem, String destino, Calendar DataHoraSaida){
        super(origem, destino, DataHoraSaida); 
     }
     public void exibirDetalhes(){
         System.out.println("Passagem de ônibus Urbano ->" + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
     }

}
