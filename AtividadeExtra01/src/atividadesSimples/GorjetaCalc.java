package atividadesSimples;

import javax.swing.JOptionPane;

public class GorjetaCalc {

	//Função main
	public static void main(String[] args) {
	//Input valor da conta
String valor = JOptionPane.showInputDialog("Digite o valor total da conta");
//Conversão do valor em String para float
float conta = Float.parseFloat(valor);

String porcentagem = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta que deseja deixar (por exemplo, 15 para 15%: ");
float percent = Float.parseFloat(porcentagem);

float y = ((conta/100) * percent);

JOptionPane.showMessageDialog(null, "Total a ser pago: " + "$" + conta);
JOptionPane.showMessageDialog(null, "Valor da gorjeta: " + "$" + y);


	}

}

