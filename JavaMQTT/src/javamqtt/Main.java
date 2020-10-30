package javamqtt;

import java.text.SimpleDateFormat;
import maquinas.Eletrocardiografo;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Eletrocardiografo eletro = new Eletrocardiografo("eletro1");
        
        ClienteMQTT clienteMQTT = new ClienteMQTT("tcp://127.0.0.1", null, null);
        clienteMQTT.iniciar();

        /*new Ouvinte(clienteMQTT, "127.0.0.1", 0);

        while (true) {
            Thread.sleep(1000);
            String mensagem = "Mensagem enviada em " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(System.currentTimeMillis()) + " - Teste de MQTT disponivel em www.paulocollares.com.br";

            clienteMQTT.publicar("teste", mensagem.getBytes(), 0);
        }*/
        
        clienteMQTT.publicar("teste", eletro.ligar().getBytes(), 0);
        clienteMQTT.publicar("teste", eletro.setSinalCardiaco(20).getBytes(), 0);
        clienteMQTT.publicar("teste", eletro.mostrarDados().getBytes(), 0);
        
        
        
    }

}
