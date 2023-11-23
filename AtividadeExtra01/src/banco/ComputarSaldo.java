package banco;

import javax.swing.JOptionPane;

public class ComputarSaldo {
    static void depositar(double mudar, contaBancaria conta){
        conta.setSaldo(mudar);
    }
	public static void main(String[] args) {

        double saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo inicial: "));
        contaBancaria conta = new contaBancaria(saldo);
        
        JOptionPane.showMessageDialog(null, "Seu saldo atual é de " + saldo + " R$");

        double deposito = Float.parseFloat(JOptionPane.showInputDialog("Insira valor para depósito: "));

        depositar(deposito, conta);

        JOptionPane.showMessageDialog(null, "Seu novo saldo é de " + conta.getSaldo() + " R$");
    }
}