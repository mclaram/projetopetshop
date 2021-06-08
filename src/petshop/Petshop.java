/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.Arrays;
import java.util.List;
import petshop.setorRecursosHumanos.Funcionario;
import static java.lang.System.out;
import petshop.Formularios.fLogin;


/**
 *
 * @author danil
 */
public class Petshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     /*
    Instanciar os objetos para a simulação
    */
     
     /*List<Funcionario> l;
     
     
     
     
     
     Funcionario f1 = new Funcionario();
     f1.setLogin("admin");
     f1.setNome("José");
     f1.setSenha("12345");
     
     
    
     * Depois de instanciar a quantidade de objetos necessários
   
     
     l = Arrays.asList(f0,f1);
     
   
     * Simulando a impressão dos dados do funcionario na tela
     
     
     for(Funcionario f: l){
         out.println("O nome do funcionarpio é "+f.getNome());
       */
     //Instanciando o formulário de Login:
     fLogin Login = new fLogin();
     Login.setLocationRelativeTo(null);
     Login.setVisible(true);
   
     //Set em funcionario
    /* Funcionario f0 = new Funcionario();
     f0.setLogin("12345");
     f0.setNome("Admin");
     f0.setSenha("1234");
    */
     //Funcionario funcionario [] = new Funcionario[500];
     //int count = 0;
     
    }
    
    
    
    
}
