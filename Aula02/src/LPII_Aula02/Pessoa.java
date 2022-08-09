package LPII_Aula02;

public class Pessoa {
    public String nome;
    public String sobrenome;
    
    
    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public void mostrarNome(){
        System.out.println("O nome Sé: " + nome + " " + sobrenome);
    }
    
}
