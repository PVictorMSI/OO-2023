package atividadesSimples;

import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
        // Solicitar ao usuário para inserir o peso em kg e altura em metros
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em kg: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros: "));

        // Calcular o IMC
        double imc = peso / (altura * altura);

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc) +
                "\nClassificação de IMC: " + classificarIMC(imc));
    }

    // Método para classificar o IMC de acordo com a tabela padrão
    private static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade grau I";
        } else if (imc < 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}
