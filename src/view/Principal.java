package view;
import controller.SomaController;
public class Principal {

	public static void main(String[] args) {
		SomaController somaController = new SomaController();
		int numero = 3;
		System.out.println(somaController.soma(numero));
	}
	
}
