package fiap.scj.ws.soap;

import javax.xml.ws.Endpoint;

public class Servidor {

	public static void main(String[] args) {
		System.out.println("Servi�o no ar!");
		MinhaSaudeImp1 service = new MinhaSaudeImp1();
		Endpoint.publish("http://localhost:8080/minhasaude", service);

	}

}
