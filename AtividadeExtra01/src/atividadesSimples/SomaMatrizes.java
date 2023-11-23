package atividadesSimples;

import javax.swing.JOptionPane;

public class SomaMatrizes {

	public static void main(String[] args) {
		// Solicitar ao usuário o número de linhas e colunas
        int numLinhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
        int numColunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));

        // Inicializar as matrizes
        int[][] primeiraMatriz = new int[numLinhas][numColunas];
        int[][] segundaMatriz = new int[numLinhas][numColunas];
        int[][] matrizSoma = new int[numLinhas][numColunas];

        // Preencher a primeira matriz
        JOptionPane.showMessageDialog(null, "Digite os elementos da primeira matriz:");
        preencherMatriz(primeiraMatriz);

        // Preencher a segunda matriz
        JOptionPane.showMessageDialog(null, "Digite os elementos da segunda matriz:");
        preencherMatriz(segundaMatriz);

        // Calcular a soma das matrizes
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                matrizSoma[i][j] = primeiraMatriz[i][j] + segundaMatriz[i][j];
            }
        }

        // Exibir a matriz resultante
        JOptionPane.showMessageDialog(null, "A soma das matrizes é:\n" + matrizToString(matrizSoma));
    }

    // Método para preencher uma matriz com valores fornecidos pelo usuário
    private static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento [" + (i + 1) + "][" + (j + 1) + "]:"));
            }
        }
    }

    // Método para converter uma matriz para uma string formatada
    private static String matrizToString(int[][] matriz) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado.append(matriz[i][j]).append(" ");
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }
}