/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop.Produtos;

/**
 *
 * @author danil
 */
public class Alimentacao extends Suprimento {

   
    private float peso;
    private String validade;
    private String sabor;
    private String idade;
    private boolean transgenico;
    private String tamanhodograo;
    private String textura;
    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the validade
     */
    public String getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(String validade) {
        this.validade = validade;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * @return the transgenico
     */
    public boolean isTransgenico() {
        return transgenico;
    }

    /**
     * @param transgenico the transgenico to set
     */
    public void setTransgenico(boolean transgenico) {
        this.transgenico = transgenico;
    }

    /**
     * @return the tamanhodograo
     */
    public String getTamanhodograo() {
        return tamanhodograo;
    }

    /**
     * @param tamanhodograo the tamanhodograo to set
     */
    public void setTamanhodograo(String tamanhodograo) {
        this.tamanhodograo = tamanhodograo;
    }
 /**
     * @return the textura
     */
    public String getTextura() {
        return textura;
    }

    /**
     * @param textura the textura to set
     */
    public void setTextura(String textura) {
        this.textura = textura;
    }

}
