package fiap.scj.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public class MinhaSaudeImp1 {
	
	@WebMethod
	public String calcularImc(
			@XmlElement(name = "altura") float altura, 
			@XmlElement(name = "peso") float peso) {
		int imc = (int) (peso / (altura * 2));
		
		return this.retornaSituacao(imc);
	}
	
	@WebMethod
	public String retornaSituacao(int imc) {
		String situacao = "";
		if (imc <= 17) {
			situacao = "Muito abaixo do peso";
		}
		if (imc > 18) {
			situacao = "Peso normal";
		}
		if (imc > 30) {
			situacao = "Obesidade";
		}
		if (imc > 40) {
			situacao = "Obesidade morbida";
		}
		return situacao;
	}

}
