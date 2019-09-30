package capitulo01;

import javax.swing.JOptionPane;

public class EjercicioCondicional2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un número entero: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce otro número entero: ");
		int num2 = Integer.parseInt(str);
		
		if (num1 < num2) {
		System.out.println(num1);

		}
		else { System.out.println(num2);
			}
		}
	}
