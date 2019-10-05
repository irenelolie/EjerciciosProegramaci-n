import javax.swing.JOptionPane;

public class DePrueba {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int num1 = Integer.parseInt(str), mayor = 0;
		
		str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int num4 = Integer.parseInt(str);
		
		for (int i = 0; num1 != 0; num1++) {
			if (num1 == 0) { // Primera iteración
				mayor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				num1 = mayor;
				num2 = mayor;
				num3 = mayor;
				num4 = mayor; 
				System.out.println(num1 + num2 + num3 + num4);
			}
			else { // Resto de iteraciones
				num1 = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (num1 > mayor && num1 != 0) {
					mayor = num1;
				}
			}	
		}
		
		JOptionPane.showMessageDialog(null, "Mayor: " + mayor);
	}
	
}


	
