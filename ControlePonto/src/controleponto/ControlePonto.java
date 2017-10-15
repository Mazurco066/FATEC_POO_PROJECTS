package controleponto;

import java.time.LocalDateTime;

/** author Mazurco066 */
public class ControlePonto {
    
    //Construtor
    public ControlePonto(){
        super();
    }
    
    //Métodos da Classe
    public String registraEntrada(RegistroPonto registro){
        
        StringBuilder text = new StringBuilder();
        
        if (registro.getFunc().getClass().equals(new Gerente().getClass())){
            
            registro.setHoraEntrada(LocalDateTime.now());
            text.append("Entrada de Gerente ").append(registro.getFunc().getNome()).append("\n");
            text.append(registro.getDataRegistro().toString()).append("\n");
            text.append(registro.getHoraEntrada().toString()).append("\n");
            
        }
        else if(registro.getFunc().getClass().equals(new Operador().getClass())){
            
            registro.setHoraEntrada(LocalDateTime.now());
            text.append("Entrada de Operador ").append(registro.getFunc().getNome()).append("\n");
            text.append(registro.getDataRegistro().toString()).append("\n");
            text.append(registro.getHoraEntrada().toString()).append("\n");
            
        }
        else if(registro.getFunc().getClass().equals(new Secretaria().getClass())){
            
            registro.setHoraEntrada(LocalDateTime.now());
            text.append("Entrada de Secretária ").append(registro.getFunc().getNome()).append("\n");
            text.append(registro.getDataRegistro().toString()).append("\n");
            text.append(registro.getHoraEntrada().toString()).append("\n");
            
        }
        
        return text.toString();
    }
    
    public String registraSaida(RegistroPonto registro){
        
        StringBuilder text = new StringBuilder();
        
        if (registro.getFunc().getClass().equals(new Gerente().getClass())){
            
            registro.setHoraSaida(LocalDateTime.now());
            text.append("Saída de Gerente ").append(registro.getFunc().getNome()).append("\n");
            text.append(registro.getDataRegistro().toString()).append("\n");
            text.append(registro.getHoraSaida().toString()).append("\n");
            
        }
        else if(registro.getFunc().getClass().equals(new Operador().getClass())){
            
            registro.setHoraSaida(LocalDateTime.now());
            text.append("Saída de Operador ").append(registro.getFunc().getNome()).append("\n");
            text.append(registro.getDataRegistro().toString()).append("\n");
            text.append(registro.getHoraSaida().toString()).append("\n");
            
        }
        else if(registro.getFunc().getClass().equals(new Secretaria().getClass())){
            
            registro.setHoraSaida(LocalDateTime.now());
            text.append("Saída de Secretária ").append(registro.getFunc().getNome()).append("\n");
            text.append(registro.getDataRegistro().toString()).append("\n");
            text.append(registro.getHoraSaida().toString()).append("\n");
            
        }
        
        return text.toString();
    }
    
}
