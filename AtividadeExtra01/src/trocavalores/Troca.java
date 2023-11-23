package trocavalores;

import javax.swing.JOptionPane;

public class Troca {
	  // Método para trocar os valores de dois objetos Ponto
    public static void trocarPontos(Ponto valor1, Ponto valor2) {
        // Troca os valores de x e y entre os dois pontos
        int tX = valor1.x;
        int tY = valor1.y;

        valor1.x = valor2.x;
        valor1.y = valor2.y;

        valor2.x = tX;
        valor2.y = tY;
    }

    public static void main(String[] args) {
        // Obter valores iniciais do usuário usando JOptionPane
        int xA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor x para o ponto A:"));
        int yA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor y para o ponto A:"));

        int xB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor x para o ponto B:"));
        int yB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor y para o ponto B:"));

        // Criar dois objetos Ponto
        Ponto pontoA = new Ponto(xA, yA);
        Ponto pontoB = new Ponto(xB, yB);

        // Exibir os valores iniciais
        JOptionPane.showMessageDialog(null, "Valores iniciais:\nPonto A: (" + pontoA.x + ", " + pontoA.y + ")\nPonto B: (" + pontoB.x + ", " + pontoB.y + ")");

        // Chamar o método para trocar os valores
        trocarPontos(pontoA, pontoB);

        // Exibir os valores após a troca
        JOptionPane.showMessageDialog(null, "Valores após a troca:\nPonto A: (" + pontoA.x + ", " + pontoA.y + ")\nPonto B: (" + pontoB.x + ", " + pontoB.y + ")");
    }
}

