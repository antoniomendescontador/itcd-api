package com.example.itcd.api.ainf;

import java.text.NumberFormat;
import java.util.Locale;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AinfToHerdeiro {

	@Test
	public void calculoAINherdeiro() {

		String processo = "192017730002911-9";
		String inventariado = "Manuel Ferreira da Costa";
		String cpfInventariado = "028.588.862-53";
		Double baseDeCalculo = 560000.00;
		Double quantHerdeiros = 1.00;
		Double cotaHerdeiro = 1 / quantHerdeiros;
		Double aliquota = 0.04;
		Double calculoCota = baseDeCalculo * aliquota * cotaHerdeiro;
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println(
				"Proc. n. " + processo + " ( Causa Mortis),\n" + "Inventario do SR(a) " + inventariado + "," + "CPF n. "
						+ cpfInventariado + ".\n" + "Refere-se ao ITCD calculado no processo acima, ora constituido,\n"
						+ "Base de Cálculo: " + nf.format(baseDeCalculo) + " x " + "Aliquota: 4%\n = " + nf.format(calculoCota) + "");

		System.out.println("Lei Estadual 5.529/89, ART. 4º, inciso I c/c art. 18, inciso II");

	}

}
