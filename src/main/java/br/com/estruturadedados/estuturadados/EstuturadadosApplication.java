package br.com.estruturadedados.estuturadados;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstuturadadosApplication {


	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();

		conjunto.adiciona("Mauricio");
		conjunto.adiciona("João");
		conjunto.adiciona("Paloma");
		conjunto.adiciona("Norivaldo");
		conjunto.adiciona("Matheus");
		conjunto.adiciona("José");
		conjunto.adiciona("Nair");
		conjunto.adiciona("Paulo");
	
		System.out.println(conjunto);

	}
}
