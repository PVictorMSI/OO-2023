package atividadesSimples;

import javax.swing.JOptionPane;

public class AVGCalc {
    public static void main(String[] args) {
        // Solicitar ao usuário para inserir as notas e pesos
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da disciplina 1 (0 a 10):"));
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da disciplina 1:"));

        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da disciplina 2 (0 a 10):"));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da disciplina 2:"));

        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da disciplina 3 (0 a 10):"));
        double peso3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da disciplina 3:"));

        // Calcular a média ponderada
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "A média ponderada é: " + mediaPonderada);
    }
}
