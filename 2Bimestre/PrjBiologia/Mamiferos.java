package prjBiologia;

import javax.swing.JOptionPane;

public class Mamiferos extends Animal implements IVertebrados {
	protected String pelagem= null;
	protected String tipoPelo= null;
	protected String corPelo= null;
	protected int perguntaPelo= 1;
	
	//--Herança--
	public void cadastrar() { 	//Cadastra o animal se pá
		super.Cadastrar();
	}
	
	//--Métodos Abstratos--
	public void Curiosidades() {	//pergunta se quer adicionar curiosidades
		
		int pergunta=JOptionPane.showConfirmDialog(null, "Deseja dicionar Curiosidades ao animal?", "Escolha sim ou não", JOptionPane.YES_NO_OPTION);
		if(pergunta == JOptionPane.YES_OPTION ) {
			setCuriosidades(JOptionPane.showInputDialog(null, "Digite as Curiosidades do Animal"));
		}else if(pergunta == JOptionPane.NO_OPTION) {
			setCuriosidades(null);
		}
	}
	
	public void Pelo() { 	//Pergunta se o mamífero tem pelo
		perguntaPelo=JOptionPane.showConfirmDialog(null, "O Animal possui pelo?", "Escolha sim ou não", JOptionPane.YES_NO_OPTION);
		
		if(perguntaPelo == JOptionPane.YES_OPTION ) {
			perguntaPelo=0;
			tipoPelo = JOptionPane.showInputDialog(null, "A pelagem é Áspera ou Macia?");
			
			int quantidadeCor = JOptionPane.showConfirmDialog(null, "O animal pode ter mais de uma cor?","Escolha sim ou não", JOptionPane.YES_NO_OPTION);
				if(quantidadeCor == JOptionPane.NO_OPTION) {
					corPelo = JOptionPane.showInputDialog(null, "Digite a cor da pelagem do animal");
				}else {
					corPelo = "Diversa";
				}

		}else if(perguntaPelo == JOptionPane.NO_OPTION) {
			pelagem = "Não Possui";
		}
	}
	
	//--Métodos da interface--
	public void TipoEsqueleto() { 	//--Pergunta o tipo de esqueleto
		tipoEsqueleto = JOptionPane.showInputDialog(null, "O esqueleto é Ósseo ou Cartilaginoso?");
	}

	@Override
	public void Coluna() { 	//--Pergunta de o animal tem Coluna
		int perguntaColuna=JOptionPane.showConfirmDialog(null, "O Animal possui Coluna?", "Escolha sim ou não", JOptionPane.YES_NO_OPTION);
		if(perguntaColuna == JOptionPane.YES_OPTION ) {
			vertebrado= true;
		}else if(perguntaColuna == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Seu animal não é um mamífero.");
		}
	}
	//--Mostrar resultado--
	public void Mostrar() {		//mostra o Resultado
		if (getCuriosidades() !=null && perguntaPelo == 0) {
			JOptionPane.showMessageDialog(
					null,
					"Nome: "+getNome()
					+"\nPeso: "+getPeso()+"KG"
					+"\nAltura: "+getAltura()+"metros"
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
					+"\nPeso: "+getPeso()+"KG"
					+"\nAltura: "+getAltura()+"metros"
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
					+"\nPeso: "+getPeso()+"KG"
					+"\nAltura: "+getAltura()+"metros"
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
					+"\nPeso: "+getPeso()+"KG"
					+"\nAltura: "+getAltura()+"M"
					+"\nHabitat: "+getHabitat()
					+"\nCaracteristicas: "+getCaracteristicas()
					+"\nTipo de esqueleto: "+tipoEsqueleto
					+"\nPelo: "+pelagem
				);
		}
	}

}

