package atividadesSimples;

import javax.swing.JOptionPane;

public class SimpleCalc {

	static String[] operacoes = {"adição", "Subtração", "Multiplicação", "Divisão"};

    public static void main(String[] args) {
    	float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
    	float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
        int x = showOptionDialog();
        
        switch (x) {
        
      //Soma
        case 0: 
        	JOptionPane.showMessageDialog(null, "sua soma é " + (num1+num2));
        	break;
        	
        	//Subtração
        case 1:
        	JOptionPane.showMessageDialog(null, "sua subtração é " + (num1-num2));
        	break;
        	//Multiplicação
        case 2:
        	JOptionPane.showMessageDialog(null, "seu produto é " + (num1*num2));
        	break;
        	//Divisão
        case 3:
        	JOptionPane.showMessageDialog(null, "seu quociente é " + (num1/num2));
        	break;
        
        }
    }

    public static int showOptionDialog() {
        return JOptionPane.showOptionDialog(
                null,
                "Escolha qual operação será feita: ",
                "Escolha a operação",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                operacoes,
                operacoes[0]
        );
        
    }

}
