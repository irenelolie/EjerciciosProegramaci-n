import javax.swing.JOptionPane;

import tutorialJava.Utils;

public class AdivinaElN�meroAlAzar {

	public static void main(String[] args) {
		int numAzar = Utils.obtenerNumeroAzar();
		System.out.println("este es el n�mero" + numAzar);
		for (;numAzar<100;) {
			int numAPedir = Integer.parseInt(JOptionPane.showInputDialog("Adivina el n�mero: "));
			if (numAPedir < numAzar) {
				System.out.println("El n�mero es mayor que " + numAPedir);
			}
			else {
				if (numAPedir > numAzar) {
					System.out.println("El n�mero es mayor que " + numAPedir);
					else {
						System.out.println("Es correcto!!");
						
					}
				}
				}
			
				
		}

	}

}
