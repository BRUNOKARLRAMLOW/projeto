package aps.ifsc.tds;

public class PessoaJuridica extends Cliente {
	
	 public PessoaJuridica(int clienteID, String Nome, Endereco endereco, String cnpj) {
		super(clienteID, Nome, endereco);
		this.cnpj = cnpj;
	}

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}