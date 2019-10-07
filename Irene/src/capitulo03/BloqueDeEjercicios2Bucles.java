package capitulo03;

import javax.swing.JOptionPane;

public class BloqueDeEjercicios2Bucles {

	public static void main(String[] args) {
		int acumulador = 1, numAPedir = 0;
		numAPedir = Integer.parseInt(JOptionPane.showInputDialog("Introduce los números que deseas proporcionar: "));
		acumulador = numAPedir;
		
		for (int i = 0; i < numAPedir; i++) {
			acumulador = acumulador + numAPedir;
			String str = JOptionPane.showInputDialog("Introduce un número: "); 
				
				
				
			}
			
		}
		float media = acumulador/numAPedir;
		System.out.println("La media es " + media );
	}

}
