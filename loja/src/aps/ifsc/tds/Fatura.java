package aps.ifsc.tds;

public class Fatura {
	
	private int faturaID;
	private int mesAno;
	private UC unidadeConsumidora;
	private int consumo;
	private boolean pago;
	
	public int getFaturaID() {
		return faturaID;
	}
	public void setFaturaID(int faturaID) {
		this.faturaID = faturaID;
	}
	public int getMesAno() {
		return mesAno;
	}
	public void setMesAno(int mesAno) {
		this.mesAno = mesAno;
	}
	public UC getUnidadeConsumidora() {
		return unidadeConsumidora;
	}
	public void setUnidadeConsumidora(UC unidadeConsumidora) {
		this.unidadeConsumidora = unidadeConsumidora;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}

}
