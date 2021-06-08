/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop.Atendimento.balcao;

/**
 *
 * @author danil
 */
public class OrdemServico {
    private Servico servico;
    private float preco;
    private String data;
    private String explicacao;

    public OrdemServico(Servico servico, float preco, String data, String explicacao) {
        this.servico = servico;
        this.preco = preco;
        this.data = data;
        this.explicacao = explicacao;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getExplicacao() {
        return explicacao;
    }

    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }
    
    
    
}
