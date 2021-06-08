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
public class Suprimento {

    /**
     * @return the indicacao
     */
   
    private String codigo;
    private String nome;
    private float preço;
    private String indicacao;
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preço
     */
    public float getPreço() {
        return preço;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreço(float preço) {
        this.preço = preço;
    }

    /**
     * @return the tipo
     */
    public String getIndicacao() {
        return indicacao;
    }

    /**
     * @param indicacao the indicacao to set
     */
    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }
    
    
}
