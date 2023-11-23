package atividadesSimples;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação: "));
		StringBuilder contagem = new StringBuilder();
		for (int i = 0; i<=10; i++) {
		int	y = x*i;
			contagem.append(y).append("\n");
		}
		JOptionPane.showMessageDialog(null, "Tabela de multiplicação do " + x + "\n" + contagem.toString());
	}
}
