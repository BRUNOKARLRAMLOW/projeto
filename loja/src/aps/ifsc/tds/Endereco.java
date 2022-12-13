package aps.ifsc.tds;

public class Endereco {
	private String rua;
	private int numero;
	private String cidade;
	private String cep;
	private String estado;
	
	public Endereco (String rua, int numero, String cidade, String cep, String estado) {
		this.cep =cep;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.rua = rua;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}