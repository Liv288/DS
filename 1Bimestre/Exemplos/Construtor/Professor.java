
public class Professor  {
	
	private String nome;
	private String estado;
	private String dataCriacao;
	
	//construtor
	//o construtor não tem retorno 
	public Professor() {
		nome = "";
		estado = "SP";
		dataCriacao = "17/11/2008";
	}
	
	//sobrecarga
	public Professor(String nome, String estado, String dataCriacao) {
		this.nome = nome;
		this.estado = estado;
		this.dataCriacao = dataCriacao;
		
	}
	
}
