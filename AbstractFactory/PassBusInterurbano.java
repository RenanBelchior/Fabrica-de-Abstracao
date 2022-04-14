package AbstractFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class PassBusInterurbano {
	private String origem;
    private String destino;
    private Calendar DataHoraSaida;
    
    protected SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyy HH:mm");
    
    public PassBusInterurbano(String origem, String destino, Calendar DataHoraSaida){
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setDataHoraSaida(DataHoraSaida);
    }
    public abstract void exibirDetalhes();
    
    public String getDestino(){
      return destino;
  }
  public void setDestino(String destino){
      this.destino = destino;
  }
  public String getOrigem(){
      return origem;
  }
  public void setOrigem(String origem){
      this.origem = origem;
  }
  public Calendar getDataHoraSaida(){
      return DataHoraSaida;
  }
  public void setDataHoraSaida(Calendar dataHoraSaida){
      DataHoraSaida = dataHoraSaida;
  }
}
