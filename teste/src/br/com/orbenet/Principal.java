package br.com.orbenet;

import java.security.cert.X509CRL;

public class Principal {

	public static void main(String[] args) {
		
		try {
			//URL: 		
			
			String url = "https://ww3.itau.com.br/imobline/novolayout/envioproposta/fichaproposta.aspx?passo=1&valor=2";
			//url = "https://www.itau.com.br";
			url = "https://www.requintebrasildecoracoes.com.br";
			CertificateUtil.testConnectionTo(url);
			
		}
		catch(Exception exc) {
			System.out.println("Erro: " + exc.getMessage());
		}

	}

}
