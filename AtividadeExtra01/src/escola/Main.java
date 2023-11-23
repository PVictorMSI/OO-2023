package escola;

import javax.swing.JOptionPane;

public class Main {
    static Aluno copiar(Aluno obj){
        Aluno copia = new Aluno(null, 0);
        copia.nome = obj.nome;

        return copia;
    }
    
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota: "));
        
        Aluno aluno = new Aluno(nome, nota);
        
        Aluno copia = copiar(aluno);
        
        String nomecopia = JOptionPane.showInputDialog("Altere o nome do aluno: ");
        float notacopia = Float.parseFloat(JOptionPane.showInputDialog("Altere a nota do aluno: "));

        copia.nome = nomecopia;
        copia.nota = notacopia;

        JOptionPane.showMessageDialog(null, "O aluno original é " + aluno.nome + " e sua nota é " + aluno.nota);
        JOptionPane.showMessageDialog(null,"O aluno copiado é " + copia.nome + " e sua nota é " + copia.nota);
        
    }
}