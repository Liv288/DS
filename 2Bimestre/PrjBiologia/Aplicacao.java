package prjBiologia;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String escolha;
		int continuar;
		
		escolha = JOptionPane.showInputDialog("Qual animal você deseja selecionar?");
		
		do{
			switch(escolha) {
			case "Mamíferos":
				Animal mamiferos= new Mamiferos();
				mamiferos.Cadastrar();
				mamiferos.Curiosidades();
				mamiferos.Pelo();
				mamiferos.TipoEsqueleto();
				mamiferos.Coluna();
				
				if(mamiferos.vertebrado==true) {
					mamiferos.Mostrar();
				}
				break;
			
			case "Inseto": 
				Animal inseto = new Insetos();
				inseto.Cadastrar();
				inseto.Curiosidades();
				inseto.Pelo();
				inseto.TipoEsqueleto();
				inseto.Coluna();
				
				if(inseto.vertebrado==false) {
					inseto.Mostrar();
				}
				break;
				
			/*case "Peixes": 
				Animal peixe = new Peixes();
				break;
				
			case "Molusco": 
				Animal molusco = new Moluscos();
				break; 
			*/
				
			default: 
				System.out.println("Opção inválida");
		
			}
			
			continuar = JOptionPane.showConfirmDialog(null, "Você deseja continuar?", "Escolha Sim ou Não", JOptionPane.YES_NO_OPTION);
		}while(continuar == JOptionPane.YES_NO_OPTION);
		
		
		
		
		
		
		

	}
}
