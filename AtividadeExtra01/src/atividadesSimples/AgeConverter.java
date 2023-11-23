package atividadesSimples;

import javax.swing.JOptionPane;

public class AgeConverter {
	public static void main(String[] args) {
		int idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
        // Converter a idade para meses, dias, horas e minutos
        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365; // considerando um ano com 365 dias
        int idadeHoras = idadeDias * 24;
        int idadeMinutos = idadeHoras * 60;

        // Construir a mensagem formatada
        String mensagem = "Idade em anos: " + idadeAnos + "\n" +
                          "Idade em meses: " + idadeMeses + "\n" +
                          "Idade em dias: " + idadeDias + "\n" +
                          "Idade em horas: " + idadeHoras + "\n" +
                          "Idade em minutos: " + idadeMinutos;

        // Exibir o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagem);
	}
}
