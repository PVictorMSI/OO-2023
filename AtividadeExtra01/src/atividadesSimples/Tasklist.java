package atividadesSimples;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Tasklist {

    static String[] opcoes = {"Adicionar", "Listar", "Concluir", "Sair"};
     static ArrayList<String> tasks = new ArrayList<String>();
    public static void main(String[] args) {
    	 Tasklist taskList = new Tasklist();
    	  while (true) {
    	int x = showOptionDialog();
        
      
        switch (x) {
        case 0:
        	String task = JOptionPane.showInputDialog("Digite a descrição da tarefa: " );
        	tasks.add(task);
        	   break;
        case 1:
        	taskList.listTasks();
            break;	
        case 2:
        	String removido = JOptionPane.showInputDialog("Digite o número da tarefa a ser concluída: " );
        	int y = Integer.parseInt(removido);
       if (y >= 1 && y <= tasks.size()) {
           tasks.remove(y - 1); 
       } else {
           JOptionPane.showMessageDialog(null, "Número de tarefa inválido.");
       }
            break;
        case 3:
             System.exit(0);
        }
    	  }
        }
        
        public static int showOptionDialog() {
            return JOptionPane.showOptionDialog(
                    null,
                    null,
                    "Comandos disponíveis:",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );
    }
        public void listTasks() {
            if (tasks.isEmpty()) {
                JOptionPane.showMessageDialog(null, "A lista de tarefas está vazia.");
            } else {
                StringBuilder taskListString = new StringBuilder("Lista de Tarefas:\n");
                for (int i = 0; i < tasks.size(); i++) {
                    taskListString.append(i + 1).append(". ").append(tasks.get(i)).append("\n");
                }
                JOptionPane.showMessageDialog(null, taskListString.toString());
            }
        }
    }    
        
