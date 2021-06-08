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
public class Medicamento extends Suprimento{

    /**
     * @return the validade
     */
    private String validade;
    private float dosagem;
    private String fabricante;
    private boolean genuino;
    
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
     * @return the dosagem
     */
    public float getDosagem() {
        return dosagem;
    }

    /**
     * @param dosagem the dosagem to set
     */
    public void setDosagem(float dosagem) {
        this.dosagem = dosagem;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the genuino
     */
    public boolean isGenuino() {
        return genuino;
    }

    /**
     * @param genuino the genuino to set
     */
    public void setGenuino(boolean genuino) {
        this.genuino = genuino;
    }
   
    
}
