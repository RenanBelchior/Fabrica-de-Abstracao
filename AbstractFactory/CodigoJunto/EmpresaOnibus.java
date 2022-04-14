package AbstractFactory.CodigoJunto;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class EmpresaOnibus {
	public abstract PassBusUrbano emitePassagemBusUrbano(String origem, String destino, Calendar DataHoraSaida);
    public abstract PassBusInterurbano emitePassagemBusInterurbano(String origem, String destino, Calendar DataHoraSaida);
  
    
    public class ConcreteEmpresaOnibus extends EmpresaOnibus {
   	 public  PassBusUrbano emitePassagemBusUrbano(String origem, String destino, Calendar DataHoraSaida) {
   	      return new ConcretePassagemOnibusUrbano(origem, destino, DataHoraSaida);
   	  }
   	    public  PassBusInterurbano emitePassagemBusInterurbano(String origem, String destino, Calendar DataHoraSaida) {
   	       return new ConcretePassagemOnibusInterurbano(origem, destino, DataHoraSaida);  
   	  }

   }
    
    //PASS URBANO
    public abstract class PassBusUrbano {
    	private String origem;
        private String destino;
        private Calendar DataHoraSaida;
        
        protected SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyy HH:mm");
        
        public PassBusUrbano(String origem, String destino, Calendar DataHoraSaida){
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
    
    //PASS INTERURBANO
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
    
    //PASSAGENS URBANO E INTERURBANO
    public class ConcretePassagemOnibusInterurbano extends PassBusInterurbano {
    	public ConcretePassagemOnibusInterurbano(String origem, String destino, Calendar DataHoraSaida){
    	       super(origem, destino, DataHoraSaida); 
    	    }
    	    public void exibirDetalhes(){
    	        System.out.println("Passagem de ônibus Interurbano ->" + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
    	    }
         }
    
    public class ConcretePassagemOnibusUrbano extends PassBusUrbano {
        public ConcretePassagemOnibusUrbano(String origem, String destino, Calendar DataHoraSaida){
            super(origem, destino, DataHoraSaida); 
         }
         public void exibirDetalhes(){
             System.out.println("Passagem de ônibus Urbano ->" + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
         }
      }
}
