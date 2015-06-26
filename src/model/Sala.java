package model;

/**
 * Classe Sala representa uma sala de cinema que o Cine UP possui.
 *
 * Created by marcus.rodrigues on 29/03/2015.
 */
public class Sala {

    private String numero;
    private int qtdAssentos;

    /**
     * Método construtor da classe Sala
     *
     * @param numero  é um atributo String que recebe o numero da sala.
     * @param qtdAssentos é um atributo int que recebe a quantidade de assentos da sala.
     */
    public Sala(String numero, int qtdAssentos) {
        this.numero = numero;
        this.qtdAssentos = qtdAssentos;
    }

    //Métodos Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public void diminuiAssentos(){
        this.qtdAssentos--;
    }

}
