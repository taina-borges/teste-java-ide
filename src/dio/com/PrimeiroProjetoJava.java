package dio.com;

import dio.com.model.Gato;

public class PrimeiroProjetoJava {
	
public static void main (String [] args) {
	Gato gato = new Gato();
	Livros livros = new Livros();
	
	
	System.out.println(gato);
	System.out.println(livros);
}
}
class Livros {
	private String nome;
	private String npag;
}
/* int a = 400;
	int b = 50;
	
	System.out.println("Hello World!" + (a*b));
 }*/

 