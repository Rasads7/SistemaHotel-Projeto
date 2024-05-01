package entities;

import java.util.ArrayList;

public class Quarto {
	private DisponibilidadeEnum disponibilidade;
	private ArrayList<Hospede> hospedes;
	
	public Quarto(){
		this.setDisponibilidade(DisponibilidadeEnum.VAGO);
		this.setHospedes(new ArrayList<Hospede>());
	}

	public DisponibilidadeEnum getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(DisponibilidadeEnum disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public ArrayList<Hospede> getHospedes() {
		return hospedes;
	}

	public void setHospedes(ArrayList<Hospede> hospedes) {
		this.hospedes = hospedes;
	}
	
	public void setHospedes(Hospede hospede) {
		this.hospedes.add(hospede);
	}
	
	public int getQuantidade() {
		return this.getHospedes().size();
	}
	
}
