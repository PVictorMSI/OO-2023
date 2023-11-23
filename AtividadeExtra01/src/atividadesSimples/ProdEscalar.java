package atividadesSimples;

import javax.swing.JOptionPane;

public class ProdEscalar {

	public static void main(String[] args) {
		// Solicitar ao usuário o tamanho dos vetores
        int tamanhoVetores = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores:"));

        // Inicializar os vetores
        double[] primeiroVetor = new double[tamanhoVetores];
        double[] segundoVetor = new double[tamanhoVetores];

        // Preencher o primeiro vetor
        JOptionPane.showMessageDialog(null, "Digite os elementos do primeiro vetor:");
        preencherVetor(primeiroVetor);

        // Preencher o segundo vetor
        JOptionPane.showMessageDialog(null, "Digite os elementos do segundo vetor:");
        preencherVetor(segundoVetor);

        // Calcular o produto escalar dos vetores
        double produtoEscalar = calcularProdutoEscalar(primeiroVetor, segundoVetor);

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: " + produtoEscalar);
    }

    // Método para preencher um vetor com valores fornecidos pelo usuário
    private static void preencherVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Elemento " + (i + 1) + ":"));
        }
    }

    // Método para calcular o produto escalar entre dois vetores
    private static double calcularProdutoEscalar(double[] vetor1, double[] vetor2) {
        double resultado = 0.0;
        for (int i = 0; i < vetor1.length; i++) {
            resultado += vetor1[i] * vetor2[i];
        }
        return resultado;
    }
}