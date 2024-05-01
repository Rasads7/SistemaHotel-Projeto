package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

import entities.DisponibilidadeEnum;
import entities.Hospede;
import entities.Quarto;
import entities.Recepcionista;

class TestSistema {

	@Test
	void recepcionistaAlocaUmQuartoVago() {
		ArrayList<Quarto> quartos = new ArrayList<Quarto>();
		quartos.add(new Quarto());
		Recepcionista recep = new Recepcionista();
		recep.setQuartos(quartos);
		Hospede hosp = new Hospede();
		recep.aloca(quartos.get(0), hosp);
	
		assertEquals(DisponibilidadeEnum.OCUPADO, quartos.get(0).getDisponibilidade());
		
	}
	
	@Test
	void divisaoDeHospedesPorQuarto() {
		ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
		for (int i = 0; i < 12; i++) {
			hospedes.add(new Hospede());
		}
		ArrayList<Quarto> quartos = new ArrayList<Quarto>();
		for (int i = 0; i < 10; i++) {
			quartos.add(new Quarto());
		}
		Recepcionista recep = new Recepcionista();
		recep.setQuartos(quartos);
		recep.aloca(quartos, hospedes);
		
	}
	

}
