package maquinas;

import java.util.HashMap;

public abstract class Maquina {
    String nome;
    boolean ligado;
    HashMap<String, Integer> dados = new HashMap();
    
    public Maquina(String nome){
        this.nome = nome;
        dados = new HashMap();
        ligado = false;
        dados.put("ligado", 0);
    }
    
    public String ligar(){
        if(!ligado){
            ligado = true;
            dados.put("ligado", 1);
            return "Maquina ligada";
        }
        return "Maquina desligada";
    }
    
    public String desligar(){
        if(ligado){
            ligado = false;
            dados.put("ligado", 0);
            return "Maquina desligada";
        }
        return "Maquina ligada";
    }
    
    public abstract String mostrarDados();
    
    
}
