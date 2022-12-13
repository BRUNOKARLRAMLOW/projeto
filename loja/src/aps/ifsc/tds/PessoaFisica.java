package aps.ifsc.tds;


public class PessoaFisica extends Cliente{

	public PessoaFisica(int clienteID, String Nome, Endereco endereco, String cpf) {
		super(clienteID, Nome, endereco);
		this.cpf = cpf;
	}

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}