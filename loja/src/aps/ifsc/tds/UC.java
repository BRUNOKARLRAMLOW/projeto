package aps.ifsc.tds;

public class UC {
	
	private int ucid;
	private Cliente cliente;
	private int leituraAnterior;
	private int leituraAtual;
	private Endereco endereco;
	
	public UC(int ucid, Cliente cliente, int leituraAnterior, int leituraAtual, Endereco endereco) {
		this.ucid = ucid;
		this.cliente = cliente;
		this.leituraAnterior = leituraAnterior;
		this.leituraAtual = leituraAtual;
		this.endereco = endereco;
	}
	
	public int getUcid() {
		return ucid;
	}
	public void setUcid(int ucid) {
		this.ucid = ucid;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getLeituraAnterior() {
		return leituraAnterior;
	}
	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}
	public int getLeituraAtual() {
		return leituraAtual;
	}
	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}