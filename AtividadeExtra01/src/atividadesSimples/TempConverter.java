package atividadesSimples;

import javax.swing.JOptionPane;

public class TempConverter {

    static String[] escalas = {"Celsius", "Fahrenheit", "Kelvin"};

    public static void main(String[] args) {
        int x = showOptionDialog();
        
        switch (x) {
        
      //Calculadora de Celsius
        case 0: 
        String Celsius = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius: ");
        float C = Float.parseFloat(Celsius);
        
        float a = (float) ((C * 1.8) + 32);
        float b = (float) (C + 273.15);
        
        JOptionPane.showMessageDialog(null, "temperatura escolhida: " + C + " C°" + "\n" +
        "Resultado em graus Fahrenheit: " + a + " F°" + "\n" +
        		"Resultado em Kelvin: " + b + " K");
        
        	break;
        	
        	//Calculadora de Fahrenheit
        case 1:
        	String Fahrenheit = JOptionPane.showInputDialog("Digite a temperatura em graus Fahrenheit: ");
            float F = Float.parseFloat(Fahrenheit);
            
            float c = ((F - 32)/1.8f);
            float d = (c + 273.15f);
            
            JOptionPane.showMessageDialog(null, "temperatura escolhida: " + F + "F°" + "\n" +
                    "Resultado em graus Celsius: " + c + " C°" + "\n" +
                    		"Resultado em Kelvin: " + d + " K");
        	break;
        	//Calculadora de Kelvin
        case 2:
        	String Kelvin = JOptionPane.showInputDialog("Digite a temperatura em graus Kelvin: ");
            float K = Float.parseFloat(Kelvin);
            
            float e = (K - 273.15f); 
            float f = ((e * 1.8f) + 32);
            
            JOptionPane.showMessageDialog(null, "temperatura escolhida: " + K + " K" + "\n" +
                    "Resultado em graus Celsius: " + e + " C°" + "\n" +
                    		"Resultado em Fahrenheit: " + f + " F°" );
        	break;
        
        }
    }

    public static int showOptionDialog() {
        return JOptionPane.showOptionDialog(
                null,
                "Escolha qual escala será convertida: ",
                "Escolha o tipo de conversão",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                escalas,
                escalas[0]
        );
        
    }

}
