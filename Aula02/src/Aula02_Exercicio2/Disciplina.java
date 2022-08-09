
package Aula02_Exercicio2;

public class Disciplina {
    public String nomeDisciplina;
    public int cargaHoraria;
    
    public Disciplina(){
        this.nomeDisciplina = "Sistemas de Informação";
        this.cargaHoraria = 3600;
    }
    public void exibirInfo(){
        System.out.println("Disciplina: " + nomeDisciplina + "\n" + "Carga horária: " + cargaHoraria + "h");
    }
    
}
