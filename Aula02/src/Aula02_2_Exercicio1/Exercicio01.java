
package Aula02_2_Exercicio1;

import javax.swing.JOptionPane;

public class Exercicio01 extends Usuario{
    public static void main(String[] args) {
        nome = JOptionPane.showInputDialog("Digite o nome do Usuario: ");
        sobreNome = JOptionPane.showInputDialog("Digite o sobrenome do Usuario");
        email = JOptionPane.showInputDialog("Informe o e-mail do Usuario: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Usuario: "));
        telefone = JOptionPane.showInputDialog("Digite o telefone no Usuario: ");
        
        JOptionPane.showMessageDialog(null, "Informações do Usuario:" 
                + "\n" + "Nome: " +nome + " " + sobreNome + "\n" + "Idade: " + idade
                + "\n" + "E-mail: " + email + "\n" + "Telefone: " + telefone);
    }
    
}
