package atividadesSimples;

import javax.swing.JOptionPane;

public class Countdown {
	//Função Main
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial"));
		//String que acumula valores
		StringBuilder contagem = new StringBuilder();
		while (x != 0) {
			contagem.append(x).append("\n");
			x--;
		}
	JOptionPane.showMessageDialog(null, contagem.toString());
	}
	

}
