package com.example.itcd.api.ainf;

import java.text.NumberFormat;
import java.util.Locale;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AinfToInventariante {
	
	@Test
	public void calculoAINFInventariante() {
		
		String processo = "192018730000424-5";
		String inventariado = "Zulmira Cardoso da Silva";
		String cpfInventariado = "245.793.512-15";
		Double baseDeCalculo = 213940.59;
		Double quantHerdeiros = 1.00;
		Double cotaHerdeiro = 1/quantHerdeiros;
		Double aliquota = 0.04;
		Double calculoCota = baseDeCalculo*aliquota*cotaHerdeiro;
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		
		System.out.println("Proc. SEFA n. "+processo+" (Causa Mortis),\n"
		+"Inventario do SR(a): "+inventariado+", "+"CPF n. "+cpfInventariado+".\n"
		+ "Refere-se ao ITCD calculado no processo acima, ora constituido,\n"
		+ "Base de Cálculo: "+nf.format(baseDeCalculo)+" x "+"Aliquota: 4% = "+nf.format(calculoCota)+"");
		
		System.out.println("Lei Estadual 5.529/89, ART. 5º, inciso IV c/c Lei 13.105/2015, art. 615.");
		
			}

}
