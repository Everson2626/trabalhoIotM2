package maquinas;

public class VentiladorPulmonar extends Maquina{
    
    public VentiladorPulmonar(String nome) {
        super(nome);
    }
    /**
     * Modos:
     * 1 = Nasal
     * 2 = Oral
     * 3 = Traqueostomia
     * @param modo
     * @return 
     */
    public String setModo(int modo){
        if(ligado){
            if(modo > 0 && modo < 4){
                this.dados.put("Modo", modo);
                return "Modo selecionado";
            }else{
                return "Modo inexistente";
            }
        }
        return "Ventilador Pulmonar desligado";
    }

    @Override
    public String mostrarDados() {
        String retorno = "Situação: "+dados.get("ligado")+" \n";
        switch(this.dados.get("Modo")){
            case 1:
                return retorno+"Modo: Nasal";
            case 2:
                return retorno+"Modo: Oral";
            case 3: 
                return retorno+"Modo: traqueostomia";
            default:
                return retorno+"Modo inexistente";
        }
    }
    
}
