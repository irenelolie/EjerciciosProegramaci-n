package capitulo01;

import javax.swing.JOptionPane;

public class Ejercicio6_ParImpar {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un número entero: ");
		int num1 = Integer.parseInt(str);
		
		if (num1%2 >= 1) {
			System.out.println("El número es impar.");
		}
		else {
			if (num1%2 <= 0) {
				System.out.println("El número es par.");
			}
		}

	}

}
