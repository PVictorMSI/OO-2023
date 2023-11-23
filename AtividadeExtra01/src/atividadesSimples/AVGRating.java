package atividadesSimples;
import javax.swing.JOptionPane;

public class AVGRating {
    public static void main(String[] args) {
        // Solicitar ao usuário para inserir as notas e pesos
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nota 1:"));

        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nota 2:"));

        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3:"));
        double peso3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nota 3:"));

        // Calcular a média ponderada
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // Atribuir a classificação com base na escala
        String classificacao;

        if (mediaPonderada >= 90 && mediaPonderada <= 100) {
            classificacao = "A";
        } else if (mediaPonderada >= 80 && mediaPonderada < 90) {
            classificacao = "B";
        } else if (mediaPonderada >= 70 && mediaPonderada < 80) {
            classificacao = "C";
        } else if (mediaPonderada >= 60 && mediaPonderada < 70) {
            classificacao = "D";
        } else {
            classificacao = "F";
        }

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "A média ponderada é: " + String.format("%.2f", mediaPonderada) +
                "\nClassificação: " + classificacao);
    }
}
