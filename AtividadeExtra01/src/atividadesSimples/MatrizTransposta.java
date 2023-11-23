package atividadesSimples;

import javax.swing.JOptionPane;

public class MatrizTransposta {

	public static void main(String[] args) {
		// Solicitar ao usuário o número de linhas e colunas
        int numLinhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
        int numColunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));

        // Inicializar a matriz
        int[][] matriz = new int[numLinhas][numColunas];

        // Preencher a matriz
        JOptionPane.showMessageDialog(null, "Digite os elementos da matriz:");
        preencherMatriz(matriz);

        // Calcular a matriz transposta
        int[][] matrizTransposta = calcularTransposta(matriz);

        // Exibir a matriz transposta
        JOptionPane.showMessageDialog(null, "A matriz transposta é:\n" + matrizToString(matrizTransposta));
    }

    // Método para preencher uma matriz com valores fornecidos pelo usuário
    private static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento [" + (i + 1) + "][" + (j + 1) + "]:"));
            }
        }
    }

    // Método para calcular a transposição de uma matriz
    private static int[][] calcularTransposta(int[][] matriz) {
        int numLinhas = matriz.length;
        int numColunas = matriz[0].length;

        int[][] matrizTransposta = new int[numColunas][numLinhas];

        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        return matrizTransposta;
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

