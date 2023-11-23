package atividadesSimples;

import javax.swing.JOptionPane;

public class Palindormo {

	public static void main(String[] args) {
		// Solicitar ao usuário para inserir uma palavra
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");

        // Remover espaços e converter para minúsculas
        String palavraFormatada = formatarPalavra(palavra);

        // Verificar se a palavra é um palíndromo
        if (ehPalindromo(palavraFormatada)) {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }

    // Método para remover espaços e converter para minúsculas
    private static String formatarPalavra(String palavra) {
        return palavra.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    // Método para verificar se a palavra é um palíndromo
    private static boolean ehPalindromo(String palavra) {
        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
