/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop.setorRecursosHumanos;

/**
 *
 * @author danil
 */
public class Medico extends Funcionario{
    
    private String crmv;
    private String telefone;
    private String especialidade;
    /**
     * @return the crmv
     */
    public String getCrmv() {
        return crmv;
    }

    /**
     * @param crmv the crmv to set
     */
    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
