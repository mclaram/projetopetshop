/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop.caixa;
import petshop.Atendimento.balcao.OrdemServico;
import java.time.LocalDateTime;
import java.util.List;
import petshop.Produtos.Suprimento;
import petshop.Vendas.Venda;

/**
 *
 * @author danil
 */
public class Pagamento {
    private LocalDateTime data;
    private OrdemServico ordem;
    private Venda venda;
    private List<Suprimento> outros;
    private Float total;

    public Pagamento(LocalDateTime data) {
        this.data = data;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public OrdemServico getOrdem() {
        return ordem;
    }

    public void setOrdem(OrdemServico ordem) {
        this.ordem = ordem;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public List<Suprimento> getOutros() {
        return outros;
    }

    public void setOutros(List<Suprimento> outros) {
        this.outros = outros;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
    
    
}
