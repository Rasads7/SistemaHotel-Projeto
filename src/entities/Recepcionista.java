package entities;

import java.util.ArrayList;

public class Recepcionista {
	
	private ArrayList<Quarto> quartos;

	public Recepcionista() {
		this.setQuartos(new ArrayList<Quarto>());
	}

	public ArrayList<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(ArrayList<Quarto> quartos) {
		this.quartos = quartos;
	}

	public void aloca(Quarto quarto, Hospede hospede) {
		hospede.setQuarto(quarto);
		quarto.setDisponibilidade(DisponibilidadeEnum.OCUPADO);
		
	}

}
