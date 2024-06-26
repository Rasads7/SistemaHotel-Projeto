package entities;

import java.util.ArrayList;

public class Recepcionista {

	private ArrayList<Quarto> quartos;
	
	// Constructors
	public Recepcionista() {
		this.setQuartos(new ArrayList<Quarto>());
	}
	
	public Recepcionista(ArrayList<Quarto> quartos) {
		this.quartos = quartos;
	}
	
	// Getters e Setters
	public ArrayList<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(ArrayList<Quarto> quartos) {
		this.quartos = quartos;
	}
	
	// Métodos
	public void aloca(Hospede hospede) {
		/**
		 * Este método aloca um hóspede em um dos quartos disponíveis (VAGO) presentes
		 * na lista de quartos do recepcionista.
		 */
		for (Quarto quarto : this.getQuartos()) {
			if (quarto.getDisponibilidade().equals(DisponibilidadeEnum.VAGO)) {
				hospede.setQuarto(quarto);
				quarto.setDisponibilidade(DisponibilidadeEnum.OCUPADO);
				quarto.setHospedes(hospede);
				quarto.setPosseChave(EnumPosseChave.HOSPEDE);
			}
		}
	}

	public void aloca(ArrayList<Hospede> hospedes) {
		/**
		 * este método foi criado para lidar com situações onde há mais do que 4
		 * hóspedes
		 */
		
		for (Quarto quarto : this.getQuartos()) {
			for (Hospede hospede : hospedes) {
				if (quarto.getQuantidade() < 4) {
					if (hospede.getQuarto() == null) {
						quarto.setHospedes(hospede);
						hospede.setQuarto(quarto);
						quarto.setPosseChave(EnumPosseChave.HOSPEDE);
					}
				} else quarto.setDisponibilidade(DisponibilidadeEnum.OCUPADO);
			}
		}
	}
}
