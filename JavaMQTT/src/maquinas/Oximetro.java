package maquinas;

public class Oximetro extends Maquina{
    
    public Oximetro(String nome) {
        super(nome);
    }

    public String setNivelOxigenio(int porcent){
        if(ligado){
            this.dados.put("nivelOxigenio", porcent);
            return "Nivel de oxigenio alterados para: "+porcent;
        }
        return "Oximetro desligado";
    }
    
    @Override
    public String mostrarDados() {
        if(ligado){
            return "Situação: "+dados.get("ligado")+
                   "\nNivel oxigenio: "+dados.get("nivelOxigenio");
        }else{
            return "Oximetro desligado";
        }
    }
    
}
