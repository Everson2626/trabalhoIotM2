package maquinas;

public class Estativa extends Maquina{
    
    public Estativa(String nome) {
        super(nome);
    }

    @Override
    public String mostrarDados() {
        if(ligado){
            return "Situação: "+dados.get("ligado");
        }else{
            return "Estativa desligado";
        }
    }
    
}
