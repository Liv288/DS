import java.util.Scanner;
public class App{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String escolha;
		double altura, base;
		
		System.out.print("Escolha a forma geom�trica: ");
		escolha = in.next();
		
		switch(escolha) {
			case("Tri�ngulo"): 
				Triangulo triangulo = new Triangulo();
			
				System.out.print("Digite a altura do tri�ngulo: ");
				altura = in.nextDouble();
				System.out.print("Digite a base do tri�ngulo: ");
				base = in.nextInt();
				
				triangulo.setAltura(altura);
				triangulo.setBase(base);
				triangulo.Area();
				break;
				
			case("Quadrado"):
				Quadrado quadrado = new Quadrado();
				
				System.out.print("Digite a altura do quadrado: ");
				altura = in.nextDouble();
				System.out.print("Digite a base do quadrado: ");
				base = in.nextInt();
			
				quadrado.setAltura(altura);
				quadrado.setBase(base);
				quadrado.Area();
				break;
				
			case("Ret�ngulo"): 
				Ratangulo retangulo = new Ratangulo();
			
				System.out.print("Digite a altura do ret�ngulo: ");
				altura = in.nextDouble();
				System.out.print("Digite a base do ret�ngulo: ");
				base = in.nextInt();
			
				retangulo.setAltura(altura);
				retangulo.setBase(base);
				retangulo.Area();
				break;
		}
		
		in.close();
	}

}
