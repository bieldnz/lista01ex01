package controller;

public class SomaController {
	
	public SomaController() {
		super();
	}
	
	public int soma(int n1) {
		
		if(n1 > 0) { //Quando o parâmetro for reduzido a menor que 0 ele irá retornar o número 0
			
			int result = n1 + soma(n1-1); //o parâmetro atual vai esperar o retorno futuro, que será ele menos 1
			return result;
			
		}else {
			
			return 0;
			
		}
	}
	
}
