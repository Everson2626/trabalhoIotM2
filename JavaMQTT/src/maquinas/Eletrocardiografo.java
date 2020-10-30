package maquinas;

import java.util.HashMap;

public class Eletrocardiografo extends Maquina{
    
    
    public Eletrocardiografo(String nome) {
        super(nome);
    }

    public String setSinalCardiaco(int sinal){
        if(dados.get("ligado") == 1){
            this.dados.put("sinalCardiaco", sinal);
            return "Batimentos alterados para: "+sinal;
        }
        return "Eletrocardiografo desligado";
    }
    
    @Override
    public String mostrarDados() {
        if(dados.get("ligado") == 1){
            return "Situação: "+dados.get("ligado")+
                   "\nSinal cardiaco: "+dados.get("sinalCardiaco");
        }else{
            return "Eletrocardiografo desligado";
        }
    }
    
}
