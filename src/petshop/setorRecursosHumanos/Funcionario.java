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
public class Funcionario {

    
    private String login;
    private String senha;
    private String nome;
    private String perfil;

    
    
public boolean validarUsuarios(String usuario, String pws){
    if(login.equals(usuario) && senha.equals(pws)){
        return true;    
    }
    else{
        return false;
    }
}
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
}
