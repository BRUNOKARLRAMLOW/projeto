package aps.ifsc.tds;
//kkkkkk
public class Cliente {
	
	private int clienteID;
	private String Nome;
	private Endereco endereco;
	
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