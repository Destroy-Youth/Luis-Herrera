/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads3;

import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author T-
 */
public class FormitaReloj extends javax.swing.JFrame {

    /**
     * Creates new form FormitaReloj
     */
    
    
     int x=300;
     int y=80;
        
    public FormitaReloj() {
        initComponents();
       
        setSize(300, 80);
        Thread t1=new Thread(  //Background Threads
        new Runnable() {       //Clase interna anónima: se implementa la clase Runnable
            @Override
            public void run() {
                while (true) {                    
                    try{
                        
                        Calendar cal=Calendar.getInstance();
                        int hora=cal.get(Calendar.HOUR_OF_DAY);
                        int minutos=cal.get(Calendar.MINUTE);
                        int segundo=cal.get(Calendar.SECOND);
                        jlabel1.setText(""+hora+":"+minutos+":"+segundo);
                        Thread.sleep(1000);
                        
                        
                        x=x-2;
                        y=y-2;
                        setSize(x, y);
                        if(x==0 || y==0)dispose();
                        
                      //if(segundo==1)dispose(); //dispose cierra el jFrame
                      
                    }catch(Exception e){
                        
                    }
                }
            }
          }
        );
        t1.start();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jlabel1)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jlabel1)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jlabel1.getAccessibleContext().setAccessibleName("shi");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormitaReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormitaReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormitaReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormitaReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormitaReloj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlabel1;
    // End of variables declaration//GEN-END:variables
}
