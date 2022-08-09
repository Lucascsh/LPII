
package Aula02_Exercicio4;

public class Motor {
    private String nomeFabricante;
    private String potencia;
    private String tipo;
    
    public Motor(){
        this.nomeFabricante = "Toyota";
        this.potencia = "139cv";
        this.tipo = "1.8";
    }
    public void ExibirInfo(){
        System.out.println("Nome do fabricante do motor: " + nomeFabricante 
                + "\n" + "Potencia: " + potencia + "\n" + "Tipo do Motor: " + tipo);
    }
}
