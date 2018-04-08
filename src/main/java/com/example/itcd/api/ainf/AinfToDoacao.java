package com.example.itcd.api.ainf;

import java.text.NumberFormat;
import java.util.Locale;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AinfToDoacao {
	@Test
	public void calculoAINFDoacao() {

		String processo = "0928340298347";
		String doador = "Gilberto dos Santos Muniz";
		String cpfDoador = "042.228.902-78";
		Double baseDeCalculo = 143903.84;
		Double quantDonatario = 1.00;

		Double cotaHerdeiro = 1 / quantDonatario;
		Double aliquota = 0.04;
		Double calculo = baseDeCalculo * aliquota * cotaHerdeiro;

		Locale ptBr = new Locale("pt", "BR");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(ptBr);
		String calculoCota = numberFormat.format(calculo);
		String baseCalculoBr = numberFormat.format(baseDeCalculo);
		// String cotaHerdeiroBr = numberFormat.format(cotaHerdeiro);

		System.out.println("Proc. n. " + processo + " (Doação),\n" + "Doação do SR(a) " + doador + "," + "CPF n. "
				+ cpfDoador + ".\n" + "Refere-se a doação feita ao contribuinte " + "ora autuado,\n"
				+ "Base de Cálculo: " + baseCalculoBr + " x " + "Aliquota: 4% x Cota Do Donatário: " + cotaHerdeiro
				+ "\n = " + calculoCota + "");

		System.out.println("Lei Estadual 5.529/89, ART. 4º, inciso II;\n"
				+ "Lei Estadual 5.529/89, ART. 5º, inciso III;\n"
				+ "Lei Estadual 5.529/89, ART. 18, inciso II");

	}
}
