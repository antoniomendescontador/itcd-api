package com.example.itcd.api.ainf;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AinfToHerdeiro {

	@Test
	public void calculoAINherdeiro() {

		String processo = "042012730003000-4";
		String inventariado = "Gabriel dos Santos";
		String cpfInventariado = "046.046.951-72";
		Double baseDeCalculo = 383600.00;
		Double quantHerdeiros = 1.00;
		Double cotaHerdeiro = 1 / quantHerdeiros;
		Double aliquota = 0.04;
		Double calculoCota = baseDeCalculo * aliquota * cotaHerdeiro;

		System.out.println(
				"Proc. n. " + processo + " ( Causa Mortis),\n" + "Inventario do SR(a) " + inventariado + "," + "CPF n. "
						+ cpfInventariado + ".\n" + "Refere-se ao ITCD calculado no processo acima, ora consituido,\n"
						+ "Base de Cálculo: " + baseDeCalculo + " x " + "Aliquota: 4%\n = " + calculoCota + "");

		System.out.println("Lei Estadual 5.529/89, ART. 4º, inciso I c/c art. 18, inciso II");

	}

}
