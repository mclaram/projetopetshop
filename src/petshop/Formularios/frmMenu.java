/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop.Formularios;

/**
 *
 * @author danil
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopInicial = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        nnArquivos = new javax.swing.JMenu();
        jClientes = new javax.swing.JMenuItem();
        jAnimais = new javax.swing.JMenuItem();
        jProdutos = new javax.swing.JMenuItem();
        jMedicos = new javax.swing.JMenuItem();
        jFornecedor = new javax.swing.JMenuItem();
        nnMovimentos = new javax.swing.JMenu();
        jVendas = new javax.swing.JMenuItem();
        jRelVendas = new javax.swing.JMenuItem();
        jAtendimentos = new javax.swing.JMenuItem();
        jRelAtendimentos = new javax.swing.JMenuItem();
        nnUsuario = new javax.swing.JMenu();
        jCadastroFuncionario = new javax.swing.JMenuItem();
        jAlterarUsuario = new javax.swing.JMenuItem();
        jAlterarSenha = new javax.swing.JMenuItem();
        nnAjuda = new javax.swing.JMenu();
        jSobre = new javax.swing.JMenuItem();
        jAjuda = new javax.swing.JMenuItem();
        nnSair = new javax.swing.JMenu();
        jSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA PETSHOP");

        jDesktopInicial.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jDesktopInicialLayout = new javax.swing.GroupLayout(jDesktopInicial);
        jDesktopInicial.setLayout(jDesktopInicialLayout);
        jDesktopInicialLayout.setHorizontalGroup(
            jDesktopInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jDesktopInicialLayout.setVerticalGroup(
            jDesktopInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        nnArquivos.setText("Arquivos");

        jClientes.setText("Clientes");
        nnArquivos.add(jClientes);

        jAnimais.setText("Animais");
        jAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnimaisActionPerformed(evt);
            }
        });
        nnArquivos.add(jAnimais);

        jProdutos.setText("Produtos");
        jProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProdutosActionPerformed(evt);
            }
        });
        nnArquivos.add(jProdutos);

        jMedicos.setText("Medicos");
        jMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMedicosActionPerformed(evt);
            }
        });
        nnArquivos.add(jMedicos);

        jFornecedor.setText("Fornecedor");
        nnArquivos.add(jFornecedor);

        jMenuBar1.add(nnArquivos);

        nnMovimentos.setText("Movimentos");

        jVendas.setText("Vendas");
        nnMovimentos.add(jVendas);

        jRelVendas.setText("Relatorio de Vendas");
        nnMovimentos.add(jRelVendas);

        jAtendimentos.setText("Atendimentos");
        nnMovimentos.add(jAtendimentos);

        jRelAtendimentos.setText("Relatorio de Atendimentos");
        nnMovimentos.add(jRelAtendimentos);

        jMenuBar1.add(nnMovimentos);

        nnUsuario.setText("Usuarios");

        jCadastroFuncionario.setText("Cadastro Funcionario");
        jCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroFuncionarioActionPerformed(evt);
            }
        });
        nnUsuario.add(jCadastroFuncionario);

        jAlterarUsuario.setText("Alterar Usuario");
        nnUsuario.add(jAlterarUsuario);

        jAlterarSenha.setText("Alterar Senha");
        nnUsuario.add(jAlterarSenha);

        jMenuBar1.add(nnUsuario);

        nnAjuda.setText("Ajuda");

        jSobre.setText("Sobre");
        jSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSobreActionPerformed(evt);
            }
        });
        nnAjuda.add(jSobre);

        jAjuda.setText("Ajuda");
        nnAjuda.add(jAjuda);

        jMenuBar1.add(nnAjuda);

        nnSair.setText("Sair");

        jSair.setText("Sair");
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        nnSair.add(jSair);

        jMenuBar1.add(nnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopInicial)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopInicial)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnimaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnimaisActionPerformed

    private void jProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProdutosActionPerformed

    private void jMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMedicosActionPerformed

    private void jSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSobreActionPerformed

    private void jCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroFuncionarioActionPerformed
        // Ref. Cadastro de Usuario na Desktop
        frmUsuario fUsuario = new frmUsuario();
        jDesktopInicial.add (fUsuario);
        fUsuario.show();
    }//GEN-LAST:event_jCadastroFuncionarioActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAjuda;
    private javax.swing.JMenuItem jAlterarSenha;
    private javax.swing.JMenuItem jAlterarUsuario;
    private javax.swing.JMenuItem jAnimais;
    private javax.swing.JMenuItem jAtendimentos;
    private javax.swing.JMenuItem jCadastroFuncionario;
    private javax.swing.JMenuItem jClientes;
    private javax.swing.JDesktopPane jDesktopInicial;
    private javax.swing.JMenuItem jFornecedor;
    private javax.swing.JMenuItem jMedicos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jProdutos;
    private javax.swing.JMenuItem jRelAtendimentos;
    private javax.swing.JMenuItem jRelVendas;
    private javax.swing.JMenuItem jSair;
    private javax.swing.JMenuItem jSobre;
    private javax.swing.JMenuItem jVendas;
    private javax.swing.JMenu nnAjuda;
    private javax.swing.JMenu nnArquivos;
    private javax.swing.JMenu nnMovimentos;
    private javax.swing.JMenu nnSair;
    private javax.swing.JMenu nnUsuario;
    // End of variables declaration//GEN-END:variables
}
