package atividadesSimples;

import javax.swing.JOptionPane;

public class OddEvenCheck {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		if (x % 2 == 0) {
			JOptionPane.showMessageDialog(null, x + " é par");
		}else {
			JOptionPane.showMessageDialog(null, x + " é ímpar");
		}
	}

}
