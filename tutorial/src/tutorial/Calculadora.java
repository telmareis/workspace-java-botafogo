package tutorial;

public class Calculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.somar(2, 2);
		calculadora.somar(4, 3);
		calculadora.somar(5, 5);
		calculadora.multiplicar(2, 7);
	}
	
	public void somar(int n1, int n2) {
		int valor = n1 + n2;
		System.out.println(valor);
	}
	
	public void multiplicar(int n1, int n2) {
		int valor = n1 * n2;
		System.out.println(valor);
	}

}
