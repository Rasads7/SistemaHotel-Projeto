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
		quarto.setHospedes(hospede);
	}
	
	public void aloca(ArrayList<Quarto> quartos, ArrayList<Hospede> hospedes) {
		/**
		 * este método foi criado para lidar com situações onde há mais do que 4 hóspedes
		 */
		for (Quarto quarto : quartos) {
			for (Hospede hospede : hospedes) {
				if (quarto.getQuantidade() < 4) {
					quarto.setHospedes(hospede);
					hospede.setQuarto(quarto);
					hospedes.remove(hospede);
				} else quarto.setDisponibilidade(DisponibilidadeEnum.OCUPADO);
			}
		}
	}

}
