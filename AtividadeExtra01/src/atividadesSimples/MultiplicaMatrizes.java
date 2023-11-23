package atividadesSimples;

import javax.swing.JOptionPane;

public class MultiplicaMatrizes {
	
	public static void main(String[] args) {
		// Solicitar ao usuário o número de linhas e colunas da primeira matriz
        int linhasMatriz1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da primeira matriz:"));
        int colunasMatriz1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da primeira matriz:"));

        // Inicializar a primeira matriz
        int[][] matriz1 = new int[linhasMatriz1][colunasMatriz1];

        // Preencher a primeira matriz
        JOptionPane.showMessageDialog(null, "Digite os elementos da primeira matriz:");
        preencherMatriz(matriz1);

        // Solicitar ao usuário o número de linhas e colunas da segunda matriz
        int linhasMatriz2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da segunda matriz:"));
        int colunasMatriz2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da segunda matriz:"));

        // Verificar se é possível realizar a multiplicação das matrizes
        if (colunasMatriz1 != linhasMatriz2) {
            JOptionPane.showMessageDialog(null, "Número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            return;
        }

        // Inicializar a segunda matriz
        int[][] matriz2 = new int[linhasMatriz2][colunasMatriz2];

        // Preencher a segunda matriz
        JOptionPane.showMessageDialog(null, "Digite os elementos da segunda matriz:");
        preencherMatriz(matriz2);

        // Inicializar a matriz resultante
        int[][] matrizResultado = new int[linhasMatriz1][colunasMatriz2];

        // Calcular a multiplicação das matrizes
        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                for (int k = 0; k < colunasMatriz1; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Exibir a matriz resultante
        JOptionPane.showMessageDialog(null, "A multiplicação das matrizes é:\n" + matrizToString(matrizResultado));
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
