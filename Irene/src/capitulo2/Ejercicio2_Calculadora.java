package capitulo2;

import javax.swing.JOptionPane;

import com.sun.codemodel.internal.JOp;

public class Ejercicio2_Calculadora {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce el número que deseas realizar: ");
		int operación = Integer.parseInt(str);
		
		switch (operación) {
		case 1: 
			str = JOptionPane.showInputDialog("Introduce la base de la raíz: ");
			int bRaíz = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduce el exponente de la raíz: ");
			double eRaíz = Double.parseDouble(str);
			double eRaízReal = 1/eRaíz;
			System.out.println("Tu resultado es: " + Math.pow(bRaíz, eRaízReal));
			break;
		case 2:
			str = JOptionPane.showInputDialog("Introduce la base de la potencia: ");
			int bPotencia = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduce el exponente de la potencia: ");
			int ePotencia = Integer.parseInt(str);
			System.out.println("El resultado es: " + Math.pow(bPotencia, ePotencia));
			break;
		case 3:
			str = JOptionPane.showInputDialog("Introduce el dividendo: ");
			int dividendo = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduce el divisor: ");
			double divisor = Double.parseDouble(str);
			System.out.println("El resultado es: " + (dividendo / divisor));
			break;
		default:
			System.out.println("Esa operación no está disponible");
			return;
			
		

		}
	}


}
