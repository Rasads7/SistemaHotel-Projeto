package entities;

import java.util.ArrayList;

public class Quarto {
	private DisponibilidadeEnum disponibilidadeQuarto;
	private EnumPosseChave posseChave;
	private ArrayList<Hospede> hospedes;
	
	public Quarto(){
		this.setDisponibilidade(DisponibilidadeEnum.VAGO);
		this.setHospedes(new ArrayList<Hospede>());
		this.posseChave = EnumPosseChave.HOTEL;
	}

	public DisponibilidadeEnum getDisponibilidade() {
		return disponibilidadeQuarto;
	}

	public void setDisponibilidade(DisponibilidadeEnum disponibilidade) {
		this.disponibilidadeQuarto = disponibilidade;
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
	
	public EnumPosseChave getPosseChave() {
		return posseChave;
	}

	protected void setPosseChave(EnumPosseChave posseChave) {
		this.posseChave = posseChave;
	}

	public int getQuantidade() {
		return this.getHospedes().size();
	}
}
