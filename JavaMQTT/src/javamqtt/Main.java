package javamqtt;

import java.text.SimpleDateFormat;
import maquinas.Eletrocardiografo;
import maquinas.Estativa;
import maquinas.Oximetro;
import maquinas.VentiladorPulmonar;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        VentiladorPulmonar ventilador = new VentiladorPulmonar("Estativa1");
        
        ClienteMQTT clienteMQTT = new ClienteMQTT("tcp://127.0.0.1", null, null);
        clienteMQTT.iniciar();

        /*new Ouvinte(clienteMQTT, "127.0.0.1", 0);

        while (true) {
            Thread.sleep(1000);
            String mensagem = "Mensagem enviada em " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(System.currentTimeMillis()) + " - Teste de MQTT disponivel em www.paulocollares.com.br";

            clienteMQTT.publicar("teste", mensagem.getBytes(), 0);
        }*/
        
        clienteMQTT.publicar("ventilador", ventilador.ligar().getBytes(), 0);
        clienteMQTT.publicar("ventilador", ventilador.setModo(3).getBytes(), 0);
        clienteMQTT.publicar("ventilador", ventilador.mostrarDados().getBytes(), 0);
        
        
        
    }

}
