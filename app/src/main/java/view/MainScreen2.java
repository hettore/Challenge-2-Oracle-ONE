/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTML;
import model.Conversor;


/**
 *
 * @author duh_b
 */
public class MainScreen2 extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen2() {
        initComponents(); 
        jPanelConversao1.setVisible(false);
        jTextFieldTeste.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConversao = new javax.swing.JPanel();
        jTextFieldUnidade1 = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldUnidade2 = new javax.swing.JTextField();
        jComboBoxSigla1 = new javax.swing.JComboBox<>();
        jComboBoxSigla2 = new javax.swing.JComboBox<>();
        jLabelSigla = new javax.swing.JLabel();
        jButtonConversor = new javax.swing.JButton();
        jPanelCabecalho = new javax.swing.JPanel();
        jComboBoxEscolha = new javax.swing.JComboBox<>();
        jPanelImagem = new javax.swing.JPanel();
        jLabelImagem = new javax.swing.JLabel();
        jTextFieldTeste = new javax.swing.JTextField();
        jPanelRodape = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelConversao1 = new javax.swing.JPanel();
        jTextFieldInputValor = new javax.swing.JTextField();
        jLabelValor1 = new javax.swing.JLabel();
        jTextFieldResultado = new javax.swing.JTextField();
        jComboBoxMoeda = new javax.swing.JComboBox<>();
        jLabelSigla1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonConverter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextFieldUnidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUnidade1ActionPerformed(evt);
            }
        });

        jLabelValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelValor.setText("Valor");

        jComboBoxSigla1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxSigla2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelSigla.setText("Valor");

        jButtonConversor.setText("Converter");

        javax.swing.GroupLayout jPanelConversaoLayout = new javax.swing.GroupLayout(jPanelConversao);
        jPanelConversao.setLayout(jPanelConversaoLayout);
        jPanelConversaoLayout.setHorizontalGroup(
            jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConversaoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelConversaoLayout.createSequentialGroup()
                        .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUnidade1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jLabelValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldUnidade2))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSigla2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSigla1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSigla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );
        jPanelConversaoLayout.setVerticalGroup(
            jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConversaoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jLabelSigla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUnidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSigla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelConversaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUnidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSigla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButtonConversor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor ONE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jComboBoxEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Selecione uma das opções >", "Conversor de moedas", "Conversor de temperatura" }));
        jComboBoxEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEscolhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCabecalhoLayout = new javax.swing.GroupLayout(jPanelCabecalho);
        jPanelCabecalho.setLayout(jPanelCabecalhoLayout);
        jPanelCabecalhoLayout.setHorizontalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalhoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jComboBoxEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCabecalhoLayout.setVerticalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jComboBoxEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        jTextFieldTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTesteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelImagemLayout = new javax.swing.GroupLayout(jPanelImagem);
        jPanelImagem.setLayout(jPanelImagemLayout);
        jPanelImagemLayout.setHorizontalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagemLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabelImagem)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldTeste)
                .addContainerGap())
        );
        jPanelImagemLayout.setVerticalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagemLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabelImagem)
                .addGap(35, 35, 35)
                .addComponent(jTextFieldTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright");

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Conversor");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTitulo)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTextFieldInputValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInputValorActionPerformed(evt);
            }
        });

        jLabelValor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelValor1.setText("Quero converter:");

        jTextFieldResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultadoActionPerformed(evt);
            }
        });

        jComboBoxMoeda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Escolha uma moeda>", "Real BRL a Dólar USD", "Real BRL a Euros EUR", "Dólar USD a Real BRL", "Euro EUR a Real BRL" }));
        jComboBoxMoeda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMoedaActionPerformed(evt);
            }
        });

        jLabelSigla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSigla1.setText("Moeda");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Resultado:");

        jButtonConverter.setText("Converter");
        jButtonConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConverterActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConversao1Layout = new javax.swing.GroupLayout(jPanelConversao1);
        jPanelConversao1.setLayout(jPanelConversao1Layout);
        jPanelConversao1Layout.setHorizontalGroup(
            jPanelConversao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConversao1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelConversao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConversao1Layout.createSequentialGroup()
                        .addGroup(jPanelConversao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelValor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jTextFieldInputValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanelConversao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxMoeda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSigla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanelConversao1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanelConversao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConversao1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConverter)
                .addGap(164, 164, 164))
        );
        jPanelConversao1Layout.setVerticalGroup(
            jPanelConversao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConversao1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelConversao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor1)
                    .addComponent(jLabelSigla1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConversao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConverter)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConversao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelCabecalho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanelConversao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jPanelConversao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEscolhaActionPerformed
        // TODO add your handling code here:
        
        int opcao = jComboBoxEscolha.getSelectedIndex();
        //talvez usar switch
        switch (opcao) {
            case 0 -> {
//                jPanelConversao.setVisible(false);
                jPanelConversao1.setVisible(false);
                jTextFieldTeste.setVisible(false);
                System.out.println(opcao);
                System.out.println("entrou");
            }
            case 1 -> {
//                jPanelConversao.setVisible(false);
                jPanelConversao1.setVisible(true);
                jTextFieldTeste.setVisible(true);
                System.out.println(opcao);
            }
            case 2 -> {
                jPanelConversao1.setVisible(false);
//                jTextFieldTeste.setVisible(false);
//                jPanelConversao.setVisible(true);
                
                System.out.println(opcao);
            }
            default -> {
            }
        }
        
        
    }//GEN-LAST:event_jComboBoxEscolhaActionPerformed

    private void jTextFieldUnidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUnidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUnidade1ActionPerformed

    private void jTextFieldInputValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInputValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInputValorActionPerformed

    private void jComboBoxMoedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMoedaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxMoedaActionPerformed

    private void jTextFieldTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTesteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTesteActionPerformed

    private void jTextFieldResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultadoActionPerformed

    private void jButtonConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConverterActionPerformed
        // TODO add your handling code here:
        
        int opcao = jComboBoxMoeda.getSelectedIndex();
        
//        String pattern = "0123456789";
//        if(!jTextFieldInputValor.equals(pattern)) {
//            JOptionPane.showMessageDialog(rootPane, "Este campo só aceita números!");  
//        } 
        
        if(jTextFieldInputValor == null){
            JOptionPane.showMessageDialog(rootPane, "Por favor digite um número!");
        }
        
        if(jComboBoxMoeda.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Por favor escolha uma moeda para conversão!");
        }

        String SITE = "https://economia.awesomeapi.com.br/last/EUR-BRL,USD-BRL,EUR-BRL,BRL-EUR,BRL-USD";
        String CODE = "";
        
        switch (opcao) {
            case 0 -> jTextFieldTeste.setVisible(false);
            case 1 -> {
                // escolha de Reais para Dólar
                CODE = "BRLUSD";   
            }
            case 2 -> { 
                // escolha de Reais para Euros
                CODE = "BRLEUR";   
            }
            case 3 -> {
                // escolha de Dólares para Reais
                CODE = "USDBRL";   
            }
            case 4 -> {
                // escolha de Euros para Reais
                CODE = "EURBRL";          
            }
        }
        
        try {
                    
                    //Passo a passo da conversão generica 
                    String moeda = Conversor.realPrice(SITE, CODE);
                    double moedaDouble = Double.parseDouble(moeda);
                    jTextFieldTeste.setText("1 " + (String)jComboBoxMoeda.getSelectedItem()+ " é igual a: " + String.format("%.2f", moedaDouble));
                    String valor1 = jTextFieldInputValor.getText();
                    double valorCerto = Double.parseDouble(valor1);
                    double resultado = Conversor.converterReal(valorCerto, Double.parseDouble(moeda));
                    
                    jTextFieldResultado.setText(String.format("%.2f", resultado));
                    
                    System.out.println(resultado);
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
        
        
    }//GEN-LAST:event_jButtonConverterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        jTextFieldInputValor.setText("");
        jTextFieldResultado.setText("");
        jTextFieldTeste.setText("");
        jComboBoxMoeda.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConversor;
    private javax.swing.JButton jButtonConverter;
    private javax.swing.JComboBox<String> jComboBoxEscolha;
    private javax.swing.JComboBox<String> jComboBoxMoeda;
    private javax.swing.JComboBox<String> jComboBoxSigla1;
    private javax.swing.JComboBox<String> jComboBoxSigla2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelSigla;
    private javax.swing.JLabel jLabelSigla1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JLabel jLabelValor1;
    private javax.swing.JPanel jPanelCabecalho;
    private javax.swing.JPanel jPanelConversao;
    private javax.swing.JPanel jPanelConversao1;
    private javax.swing.JPanel jPanelImagem;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldInputValor;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldTeste;
    private javax.swing.JTextField jTextFieldUnidade1;
    private javax.swing.JTextField jTextFieldUnidade2;
    // End of variables declaration//GEN-END:variables
}
