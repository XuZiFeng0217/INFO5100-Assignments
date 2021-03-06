/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.DemographicInfo;

/**
 *
 * @author zzz
 */
public class ViewDemographicInfo extends javax.swing.JPanel {

    /**
     * Creates new form ViewDemographicInfo
     */
    public ViewDemographicInfo(DemographicInfo demographicInfo) {
        initComponents();
        txt_FirstName.setText(demographicInfo.getFirtName());
        txt_LastName.setText(demographicInfo.getLastName());
        txt_PhoneNumber.setText(demographicInfo.getPhoneNumber());
        txt_DateOfBirth.setText(demographicInfo.getDob());
        txt_Age.setText(demographicInfo.getAge()+"");
        txt_Height.setText(demographicInfo.getHeight()+"");
        txt_Weight.setText(demographicInfo.getWeight()+"");
        txt_SocialSecurityNumber.setText(demographicInfo.getSocialSecurityNumber());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txt_LastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_PhoneNumber = new javax.swing.JTextField();
        txt_DateOfBirth = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Age = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Height = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Weight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_SocialSecurityNumber = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(445, 383));

        jLabel6.setText("Height");

        txt_LastName.setEditable(false);

        jLabel7.setText("Weight");

        jLabel8.setText("Social Security Number");

        txt_FirstName.setEditable(false);
        txt_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FirstNameActionPerformed(evt);
            }
        });

        jLabel1.setText("FirstName");

        txt_PhoneNumber.setEditable(false);

        txt_DateOfBirth.setEditable(false);

        jLabel2.setText("LastName");

        txt_Age.setEditable(false);

        jLabel3.setText("PhoneNumber");

        txt_Height.setEditable(false);
        txt_Height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HeightActionPerformed(evt);
            }
        });

        jLabel4.setText("Date of Birth");

        txt_Weight.setEditable(false);

        jLabel5.setText("Age");

        txt_SocialSecurityNumber.setEditable(false);
        txt_SocialSecurityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SocialSecurityNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_FirstName)
                    .addComponent(txt_SocialSecurityNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txt_Weight, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txt_Height, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txt_Age, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txt_DateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txt_PhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txt_LastName))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_SocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_HeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HeightActionPerformed

    private void txt_SocialSecurityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SocialSecurityNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SocialSecurityNumberActionPerformed

    private void txt_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FirstNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_Age;
    private javax.swing.JTextField txt_DateOfBirth;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_Height;
    private javax.swing.JTextField txt_LastName;
    private javax.swing.JTextField txt_PhoneNumber;
    private javax.swing.JTextField txt_SocialSecurityNumber;
    private javax.swing.JTextField txt_Weight;
    // End of variables declaration//GEN-END:variables
}
