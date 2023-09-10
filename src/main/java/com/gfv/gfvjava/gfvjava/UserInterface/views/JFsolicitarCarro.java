/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gfv.gfvjava.gfvjava.UserInterface.views;

import com.gfv.gfvjava.gfvjava.Models.Service.DTO.SolicitarCarroCliente;
import com.gfv.gfvjava.gfvjava.Models.Service.ServiceLayer.VeiculoSL;

import javax.swing.*;
import java.awt.event.*;

public class JFsolicitarCarro extends javax.swing.JFrame {

    /**
     * Creates new form JFsolicitarCarro
     */
    public JFsolicitarCarro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private boolean isCustomizado = false;
    private boolean isBlindado = false;
    private boolean hasCarga = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        Bcustom = new javax.swing.ButtonGroup();
        Bblindado = new javax.swing.ButtonGroup();
        Bcarga = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Blindado1 = new javax.swing.JRadioButton();
        Custom2 = new javax.swing.JRadioButton();
        FieldModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FieldPlaca = new javax.swing.JTextField();
        Blindado2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        FieldMarca = new javax.swing.JTextField();
        Custom1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        FieldTamanho = new javax.swing.JTextField();
        FieldPeso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FieldEixos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(397, 494));

        jButton1.setText("Proximo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setEnabled(false);

        jLabel1.setText("Marca do Veiculo:");

        jLabel2.setText("Modelo:");

        Bblindado.add(Blindado1);
        Blindado1.setText("Sim");

        Bcustom.add(Custom2);
        Custom2.setText("Não");

        jLabel5.setText("Tem alguma Blindagem:");

        Bblindado.add(Blindado2);
        Blindado2.setText("Não");

        jLabel4.setText("É customizado:");

        Bcustom.add(Custom1);
        Custom1.setText("Sim");

        jLabel3.setText("Placa do Veiculo:");

        jLabel6.setText("Possui alguma carga:");

        Bcarga.add(jRadioButton1);
        jRadioButton1.setText("Sim");

        Bcarga.add(jRadioButton2);
        jRadioButton2.setText("Não");

        jLabel7.setText("Tamanho do Veiculo:");

        jLabel8.setText("Peso em KG:");
        jLabel8.setToolTipText("");

        jLabel9.setText("Eixos:");

        Custom1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isCustomizado = Custom1.isSelected();
            }
        });

        Custom2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isCustomizado = Custom1.isSelected();
            }
        });

        Blindado1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isBlindado = Blindado1.isSelected();
            }
        });

        Blindado2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isBlindado = Blindado1.isSelected();
            }
        });

        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hasCarga = jRadioButton1.isSelected();
            }
        });

        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hasCarga = jRadioButton1.isSelected();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Custom2)
                            .addComponent(Custom1)
                            .addComponent(Blindado2)
                            .addComponent(Blindado1)
                            .addComponent(FieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(FieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton1))))
                    .addComponent(FieldTamanho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldEixos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jRadioButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Custom1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Custom2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Blindado1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldEixos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Blindado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SolictarCarro();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SolictarCarro(){
        String marca = FieldMarca.getText();
        String modelo = FieldModelo.getText();
        String placaVeiculo = FieldPlaca.getText();
        String customizado = isCustomizado ? "Sim" : "Não";
        String blindado = isBlindado ? "Sim" : "Não";
        String carga = hasCarga ? "Sim" : "Não";
        String tamanhoVeiculo = FieldTamanho.getText();
        double pesoVeiculo;
        int qtdeEixos;

        try {
            qtdeEixos = Integer.parseInt(FieldEixos.getText());
            pesoVeiculo = Double.parseDouble(FieldPeso.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha os campos numéricos corretamente.");
            return;
        }

        if (marca.isEmpty() || modelo.isEmpty() || placaVeiculo.isEmpty() || (!Custom1.isSelected() && !Custom2.isSelected()) ||
                (!Blindado1.isSelected() && !Blindado2.isSelected()) ||
                (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) || tamanhoVeiculo.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos antes do próximo passo.");
        }else {
            //SolicitarCarroCliente solicitarCarroCliente = new SolicitarCarroCliente();

            VeiculoSL veiculoSL = new VeiculoSL();
            veiculoSL.inserirVeiculo(marca, modelo, placaVeiculo, customizado, blindado, carga, tamanhoVeiculo, pesoVeiculo, qtdeEixos);
        }
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFsolicitarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFsolicitarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFsolicitarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFsolicitarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFsolicitarCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Bblindado;
    private javax.swing.ButtonGroup Bcarga;
    private javax.swing.ButtonGroup Bcustom;
    private javax.swing.JRadioButton Blindado1;
    private javax.swing.JRadioButton Blindado2;
    private javax.swing.JRadioButton Custom1;
    private javax.swing.JRadioButton Custom2;
    private javax.swing.JTextField FieldEixos;
    private javax.swing.JTextField FieldMarca;
    private javax.swing.JTextField FieldModelo;
    private javax.swing.JTextField FieldPeso;
    private javax.swing.JTextField FieldPlaca;
    private javax.swing.JTextField FieldTamanho;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
