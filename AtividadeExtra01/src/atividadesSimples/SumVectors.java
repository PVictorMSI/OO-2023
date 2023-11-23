package atividadesSimples;

import javax.swing.JOptionPane;

public class SumVectors {
	 public static void main(String[] args) {
	        // Solicitar ao usuário o tamanho dos vetores
	        int tamanhoVetores = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores:"));

	        // Inicializar os vetores
	        int[] primeiroVetor = new int[tamanhoVetores];
	        int[] segundoVetor = new int[tamanhoVetores];
	        int[] resultado = new int[tamanhoVetores];

	        // Preencher o primeiro vetor
	        JOptionPane.showMessageDialog(null, "Digite os elementos do primeiro vetor:");
	        preencherVetor(primeiroVetor);

	        // Preencher o segundo vetor
	        JOptionPane.showMessageDialog(null, "Digite os elementos do segundo vetor:");
	        preencherVetor(segundoVetor);

	        // Calcular a soma dos vetores
	        for (int i = 0; i < tamanhoVetores; i++) {
	            resultado[i] = primeiroVetor[i] + segundoVetor[i];
	        }

	        // Exibir o vetor resultante
	        JOptionPane.showMessageDialog(null, "A soma dos vetores é: " + vetorToString(resultado));
	    }

	    // Método para preencher um vetor com valores fornecidos pelo usuário
	    private static void preencherVetor(int[] vetor) {
	        for (int i = 0; i < vetor.length; i++) {
	            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Elemento " + (i + 1) + ":"));
	        }
	    }

	    // Método para converter um vetor para uma string formatada
	    private static String vetorToString(int[] vetor) {
	        StringBuilder resultado = new StringBuilder("[");
	        for (int i = 0; i < vetor.length; i++) {
	            resultado.append(vetor[i]);
	            if (i < vetor.length - 1) {
	                resultado.append(", ");
	            }
	        }
	        resultado.append("]");
	        return resultado.toString();
	    }
	}