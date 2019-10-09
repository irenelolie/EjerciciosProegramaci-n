import javax.swing.JOptionPane;

import tutorialJava.Utils;

public class AdivinaElNúmeroAlAzar {

	public static void main(String[] args) {
		int numAzar = Utils.obtenerNumeroAzar();
		System.out.println("este es el número" + numAzar);
		for (;numAzar<100;) {
			int numAPedir = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número: "));
			if (numAPedir < numAzar) {
				System.out.println("El número es mayor que " + numAPedir);
			}
			else {
				if (numAPedir > numAzar) {
					System.out.println("El número es mayor que " + numAPedir);
					else {
						System.out.println("Es correcto!!");
						
					}
				}
				}
			
				
		}

	}

}
