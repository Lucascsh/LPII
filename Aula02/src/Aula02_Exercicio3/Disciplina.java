
package Aula02_Exercicio3;

public class Disciplina {
    public String nomeDisciplina;
    public int cargaHoraria;
    
    public Disciplina(String nomeDis, int cargaHr){
        this.nomeDisciplina = nomeDis;
        this.cargaHoraria = cargaHr;
        
    }
    public void exibirInfo(){
        System.out.println("Disciplina: " + nomeDisciplina + "\n" + "Carga horária: " + cargaHoraria + "h");
    }
    
}
