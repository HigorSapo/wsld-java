package fiap.scj.ws.soap.client;

public class MinhaSaudeApp {

	public static void main(String[] args) {
		
		MinhaSaudeImp1 servico =
				new MinhaSaudeImp1Service().getMinhaSaudeImp1Port();
		String imc = servico.calcularImc(2, 204);
		System.out.println("Seu imc �: " + imc);

	}

}
