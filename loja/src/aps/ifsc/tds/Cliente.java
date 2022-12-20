package aps.ifsc.tds;
//kkkkkk
public class Cliente {
	private int clienteID;
	private String Nome;
	private Endereco endereco;
	
	public Cliente(int clienteID2, String nome2, Endereco endereco2) {
		this.clienteID = clienteID2;
		this.Nome = nome2;
		this.endereco= endereco2;
	}
	public int getClienteID() {
		return clienteID;
	}
	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
		
	}
    @Override
          public String toString() {
    	  return "cliente id: "+clienteID+ "" +
                 "\n" + "Nome: "+Nome+"" +
    			  "\n" + "Endereco: "+endereco;
    			  		
    }
}