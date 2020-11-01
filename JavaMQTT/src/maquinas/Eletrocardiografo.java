package maquinas;

import java.util.HashMap;

public class Eletrocardiografo extends Maquina{
    
    
    public Eletrocardiografo(String nome) {
        super(nome);
    }

    public String setSinalCardiaco(int sinal){
        if(ligado){
            this.dados.put("sinalCardiaco", sinal);
            return "Batimentos alterados para: "+sinal;
        }
        return "Eletrocardiografo desligado";
    }
    
    @Override
    public String mostrarDados() {
        if(ligado){
            return "Situação: "+dados.get("ligado")+
                   "\nSinal cardiaco: "+dados.get("sinalCardiaco");
        }else{
            return "Eletrocardiografo desligado";
        }
    }
    
}
