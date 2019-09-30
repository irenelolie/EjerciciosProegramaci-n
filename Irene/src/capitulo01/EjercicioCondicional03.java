package capitulo01;

import javax.swing.JOptionPane;

public class EjercicioCondicional03 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un número entero: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce otro número entero: ");
		int num2 = Integer.parseInt(str);
		
		String str1 = JOptionPane.showInputDialog("Introduce un número entero: ");
		int num3 = Integer.parseInt(str1);
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("Los tres números son iguales.");
		}
		else {
			int mayor;
			if (num1 >= num2 && num1 >= num3) {
				mayor = num1;
			}
			else {
				if (num2 >= num3) {
					mayor = num3;
					
				}
			}
				
			}
		}
	}
	
