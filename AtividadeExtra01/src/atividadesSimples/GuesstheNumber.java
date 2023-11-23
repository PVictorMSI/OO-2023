package atividadesSimples;
import java.util.Random;
import javax.swing.JOptionPane;

public class GuesstheNumber {

	public static void main(String[] args) {
		// Gerar um número aleatório entre 1 e 10
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;

        // Inicializar variáveis
        int tentativas = 0;
        int tentativaDoJogador;

        // Estrutura do-while para permitir que o jogador continue adivinhando até acertar
        do {
            // Solicitar ao jogador para adivinhar o número
            tentativaDoJogador = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o número entre 1 e 10."));

            // Incrementar o número de tentativas
            tentativas++;

            // Verificar se a tentativa está correta e fornecer feedback
            if (tentativaDoJogador == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + numeroAleatorio +
                        " em " + tentativas + " tentativas.");
            } else if (tentativaDoJogador < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Tente novamente. O número é maior.");
            } else {
                JOptionPane.showMessageDialog(null, "Tente novamente. O número é menor.");
            }
        } while (tentativaDoJogador != numeroAleatorio);
    }
}