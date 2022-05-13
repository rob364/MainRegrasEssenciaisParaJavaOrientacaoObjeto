import java.util.Locale;

public class MainRegrasEssenciaisParaJavaOrientacaoObjeto {

	public static void main(String[] args) {
		
		//varaivel do tipo inteiro
		//int y = 32;
		//System.out.println(y);
		//System.out.println("Bom dia!");
		
		//Variavel do tipo ponto flutuante
		//printf é a abreviação de formatado, usar sempre que for formatar ex:. "%.2f"
		//Para delimitar duas casas deciamis escreva entre "%.2f", par fazer a quebra de linha usa entre "%n" ou "\n"
		//lembrar de sempre colocar (virgula,) depois de fechar a aspas.
		
		//double x = 10.35784;
		//System.out.println(x);//println para impressão sem formatação.
		//System.out.printf("%.2f%n", x);
		//System.out.printf("%.4f%n", x);
		//Locale.setDefault(Locale.US); //Para colocar o (ponto .) como separador é necessario escrever esse comando logo acima de onde quero que mude.
		//System.out.printf("%.4f%n", x);
		//System.out.println("RESULTADO = " + x + " METROS ");//Concatenação(juntar as partes) como fazer no java
		//System.out.printf("RESULTADO = %.2f metros\n", x);// Quero o mesmo resultado porém mudando o numero de casa decimais.
		
		
		// Para printf(print formatado)
		// %f = ponto flutuante (O mesmo que variavel double)
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		// %c = para char
		
		//______________________________________________________________________________
		
		//Concatenação de varios elementos em um mesmo comando de escrita.
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);//Impressão de varios valores 
		
		
		//_______________________________________________________________
		//Exercicio impressão 1
		String produto = "Products";
		String product1 = "Computer";
		double price1 = 2100.0;
		String product2 = "Office desk";
		double price2 = 650.50;
		System.out.printf("%s: %n", produto);
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		
		//Exercicio impressão 2
		String recorde = "Record";
		int age = 30;
		int code = 5290;
		char geder = 'F';
		System.out.printf("%s: %d years old, code %d and gender : %c%n", recorde, age, code, geder);
		
		//Exercicio impressão 3
		
		double measure = 53.23456700;
		System.out.printf("Meausie with eight decimal places:%f%n",measure);
		System.out.printf("Rouded (theree decimal places):%.3f%n",measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point:%.3f%n",measure);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
