
package Aula02_2_Exercicio2;

public class Poupanca extends Conta{
    @Override
    public void abrirConta(){
        System.out.println("Uma nova conta poupança foi aberta com sucesso");
    }
    public static void main(String[] args) {
        Poupanca poupa = new Poupanca();
        poupa.abrirConta();
    }
}
