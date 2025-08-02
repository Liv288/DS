package prjBiologia;

import javax.swing.JOptionPane;

public class Insetos extends Animal{
	protected String asas=null;
	protected double patas=2;
	protected int perguntaPatas=1;
	
	protected String pelagem= null;
	protected String tipoPelo= null;
	protected String corPelo= null;
	protected int perguntaPelo= 1;
	
	@Override //--Herança--
	public void Cadastrar() {
		// TODO Auto-generated method stub
		super.Cadastrar();
	}
	
	
	@Override //--Métodos Abstratos--
	public void Curiosidades() {
		int pergunta=JOptionPane.showConfirmDialog(null, "Deseja dicionar Curiosidades ao Inseto?", "Escolha sim ou não", JOptionPane.YES_NO_OPTION);
		if(pergunta == JOptionPane.YES_OPTION ) {
			setCuriosidades(JOptionPane.showInputDialog(null, "Digite as Curiosidades do Inseto"));
		}else if(pergunta == JOptionPane.NO_OPTION) {
			setCuriosidades(null);
		}
		
	}
	@Override
	public void Pelo() { 
		perguntaPelo=JOptionPane.showConfirmDialog(null, "O Inseto possui pelo?", "Escolha sim ou não", JOptionPane.YES_NO_OPTION);
		
		if(perguntaPelo == JOptionPane.YES_OPTION ) {
			perguntaPelo=0;
			tipoPelo = JOptionPane.showInputDialog(null, "A pelagem é Áspera ou Macia?");
			
			int quantidadeCor = JOptionPane.showConfirmDialog(null, "O Inseto pode ter mais de uma cor?","Escolha sim ou não", JOptionPane.YES_NO_OPTION);
				if(quantidadeCor == JOptionPane.NO_OPTION) {
					corPelo = JOptionPane.showInputDialog(null, "Digite a cor da pelagem do Inseto");
				}else {
					corPelo = JOptionPane.showInputDialog(null, "Digite as cores da pelagem do Inseto");
				}

		}else if(perguntaPelo == JOptionPane.NO_OPTION) {
			pelagem = "Não Possui";
		}
		
	}
	
	@Override
	protected void TipoEsqueleto() {
		tipoEsqueleto = "exoesqueleto";
		
	}
	
	@Override
	public void Coluna() {
		int perguntaColuna=JOptionPane.showConfirmDialog(null, "O Inseto possui Coluna?", "Escolha sim ou não", JOptionPane.YES_NO_OPTION);
		if(perguntaColuna == JOptionPane.NO_OPTION ) {
			vertebrado= false;
		}else if(perguntaColuna == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Seu animal não é um Inseto");
		}
		
	}
	
	
	@Override
	public void Mostrar() {
		if (getCuriosidades() !=null && perguntaPelo == 0) {
			JOptionPane.showMessageDialog(
					null,
					"Nome: "+getNome()
					+"\nPeso: "+getPeso()+"g"
					+"\nAltura: "+getAltura()+"cm"
					+"\nHabitat: "+getHabitat()
					+"\nCaracteristicas: "+getCaracteristicas()
					+"\nTipo de esqueleto: "+tipoEsqueleto
					+"\nCuriosidades: "+getCuriosidades()
					+"\nTipo do pelo: "+tipoPelo
					+"\nCor do pelo: "+corPelo
				);
		}else if (getCuriosidades() !=null) {
			JOptionPane.showMessageDialog(
					null,
					"Nome: "+getNome()
					+"\nPeso: "+getPeso()+"g"
					+"\nAltura: "+getAltura()+"cm"
					+"\nHabitat: "+getHabitat()
					+"\nCaracteristicas: "+getCaracteristicas()
					+"\nTipo de esqueleto: "+tipoEsqueleto
					+"\nCuriosidades: "+getCuriosidades()
					+"\nPelagem: "+pelagem
				);
		}else if(perguntaPelo == 0) {
			JOptionPane.showMessageDialog(
					null,
					"Nome: "+getNome()
					+"\nPeso: "+getPeso()+"g"
					+"\nAltura: "+getAltura()+"cm"
					+"\nHabitat: "+getHabitat()
					+"\nCaracteristicas: "+getCaracteristicas()
					+"\nTipo de esqueleto: "+tipoEsqueleto
					+"\nTipo do pelo: "+tipoPelo
					+"\nCor do pelo: "+corPelo
				);
		}else {
					JOptionPane.showMessageDialog(
					null,
					"Nome: "+getNome()
					+"\nPeso: "+getPeso()+"g"
					+"\nAltura: "+getAltura()+"cm"
					+"\nHabitat: "+getHabitat()
					+"\nCaracteristicas: "+getCaracteristicas()
					+"\nTipo de esqueleto: "+tipoEsqueleto
					+"\nPelo: "+pelagem
				);
		}
		
	}

}
