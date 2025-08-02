package prjBiologia;

import javax.swing.JOptionPane;

public abstract class Animal {
	//--Atributos--
	protected boolean vertebrado;
	protected String tipoEsqueleto;
	
	private String nome;
	private String habitat;
	private String caracteristicas;
	private String curiosidades;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double peso;
	private double altura ;
	
	public String getCuriosidades() {
		return curiosidades;
	}
	public void setCuriosidades(String curiosidades) {
		this.curiosidades = curiosidades;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	//--Métodos--
	
	public abstract void Curiosidades();
	
	public abstract void Pelo();
	
	public abstract void Mostrar();
	
	public abstract void Coluna();
	
	protected abstract void TipoEsqueleto();

	public void Cadastrar() {
		
		setNome(this.nome=JOptionPane.showInputDialog(null, "Digite o nome do Animal"));
		
		setPeso(this.peso=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso do Animal")));
		
		setAltura(this.altura=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Altura do Animal")));
		
		setHabitat(this.habitat=JOptionPane.showInputDialog(null, "Digite o Habitat do Animal"));
		
		setCaracteristicas(this.caracteristicas=JOptionPane.showInputDialog(null, "Digite as Caracteristicas do Animal"));
	}



}
