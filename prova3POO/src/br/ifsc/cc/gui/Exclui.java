
package br.ifsc.cc.gui;

import br.ifsc.cc.modelo.Materia;
import java.util.ArrayList;

public class Exclui extends javax.swing.JDialog {
    
     private ArrayList<Materia> listaMaterias;

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public Exclui(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMateriaExcluida = new javax.swing.JLabel();
        jButtonVolta = new javax.swing.JButton();
        jButtonExclui = new javax.swing.JButton();
        jTextFieldMateriaExcluida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exclusão de Matéria");
        setLocation(new java.awt.Point(400, 200));

        jLabelMateriaExcluida.setText("Matéria a ser excluída: ");

        jButtonVolta.setText("Voltar");
        jButtonVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltaActionPerformed(evt);
            }
        });

        jButtonExclui.setText("Excluir");
        jButtonExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluiActionPerformed(evt);
            }
        });

        jLabel1.setText("(em número)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMateriaExcluida)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldMateriaExcluida, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVolta)
                                .addGap(193, 193, 193)
                                .addComponent(jButtonExclui))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMateriaExcluida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMateriaExcluida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolta)
                    .addComponent(jButtonExclui))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltaActionPerformed

    private void jButtonExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluiActionPerformed
        String matExclui = jTextFieldMateriaExcluida.getText();
        int numMat = Integer.parseInt(matExclui);
        this.listaMaterias.remove(numMat);
        this.dispose();
    }//GEN-LAST:event_jButtonExcluiActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExclui;
    private javax.swing.JButton jButtonVolta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMateriaExcluida;
    private javax.swing.JTextField jTextFieldMateriaExcluida;
    // End of variables declaration//GEN-END:variables
}
