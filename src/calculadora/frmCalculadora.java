/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author wilson
 */
public class frmCalculadora extends javax.swing.JFrame {
    private boolean punto = true; // para el boton punto
    String valor1, valor2, signo, contenido;
    Double resultado;

    /**
     * Creates new form frmCalculadora
     */
    public frmCalculadora() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtmostrar = new javax.swing.JTextField();
        btnx2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1x = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnmasmenos = new javax.swing.JButton();
        btnraiz = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btnxy = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnex = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        btnorrar = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 30));

        btnx2.setBackground(new java.awt.Color(204, 204, 204));
        btnx2.setText("x^2");
        btnx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnx2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, 40));

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 70, 40));

        btn6.setBackground(new java.awt.Color(204, 204, 204));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 40));

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 70, 40));

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 150, 40));

        btn1x.setBackground(new java.awt.Color(204, 204, 204));
        btn1x.setText("1/x");
        btn1x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1xActionPerformed(evt);
            }
        });
        getContentPane().add(btn1x, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 70, 40));

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 70, 40));

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 70, 40));

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 70, 40));

        btnmasmenos.setBackground(new java.awt.Color(204, 204, 204));
        btnmasmenos.setText("+ -");
        btnmasmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasmenosActionPerformed(evt);
            }
        });
        getContentPane().add(btnmasmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 40));

        btnraiz.setBackground(new java.awt.Color(204, 204, 204));
        btnraiz.setText("Raiz");
        btnraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizActionPerformed(evt);
            }
        });
        getContentPane().add(btnraiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 40));

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 40));

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, 40));

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, 40));

        btnpunto.setBackground(new java.awt.Color(204, 204, 204));
        btnpunto.setText(".");
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 70, 40));

        btnxy.setBackground(new java.awt.Color(204, 204, 204));
        btnxy.setText("x^y");
        btnxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxyActionPerformed(evt);
            }
        });
        getContentPane().add(btnxy, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 70, 40));

        btnsuma.setBackground(new java.awt.Color(204, 204, 204));
        btnsuma.setText("+");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 70, 90));

        btnresta.setBackground(new java.awt.Color(204, 204, 204));
        btnresta.setText("-");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 70, 40));

        btnex.setBackground(new java.awt.Color(204, 204, 204));
        btnex.setText("e^x");
        btnex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexActionPerformed(evt);
            }
        });
        getContentPane().add(btnex, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 70, 40));

        btnc.setBackground(new java.awt.Color(204, 204, 204));
        btnc.setText("c");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        getContentPane().add(btnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 70, 140));

        btndividir.setBackground(new java.awt.Color(204, 204, 204));
        btndividir.setText("/");
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });
        getContentPane().add(btndividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 70, 40));

        btnorrar.setBackground(new java.awt.Color(204, 204, 204));
        btnorrar.setText("<--");
        btnorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 150, 40));

        btnigual.setBackground(new java.awt.Color(204, 204, 204));
        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });
        getContentPane().add(btnigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 70, 40));

        btnmultiplicar.setBackground(new java.awt.Color(204, 204, 204));
        btnmultiplicar.setText("*");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1xActionPerformed
        // TODO add your handling code here:
        contenido=txtmostrar.getText();
        if(contenido.length()>0) {
            resultado=1/(Double.parseDouble(contenido));
            txtmostrar.setText(resultado.toString());
        }
    }//GEN-LAST:event_btn1xActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(txtmostrar.getText () + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText("");
    }//GEN-LAST:event_btncActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        // TODO add your handling code here:
        contenido=txtmostrar.getText();
        if (contenido.length()<=0) {
            txtmostrar.setText("0.");
        }else
            if(txtmostrar.getText().contains(".")) {
                
            }else {
                txtmostrar.setText(txtmostrar.getText()+".");
                punto=false;
            }
    }//GEN-LAST:event_btnpuntoActionPerformed

    public static String operaciones (String valor1, String valor2, String signo){
        Double resultadocalc=0.0;
        String respuesta;
        
        if(signo.equals("+")) {
            resultadocalc=Double.parseDouble(valor1)+Double.parseDouble(valor2);
        }else if(signo.equals("-")) {
            resultadocalc = Double.parseDouble(valor1)-Double.parseDouble(valor2);
        }else if(signo.equals("*")) {
            resultadocalc = Double.parseDouble(valor1)*Double.parseDouble(valor2);
        }else if (signo.equals("/")) {
            resultadocalc = Double.parseDouble(valor1)/Double.parseDouble(valor2);
        }else if(signo.equals("x^y")) {
            resultadocalc = Math.pow(Double.parseDouble(valor1), Double.parseDouble(valor2));
        }
        respuesta = resultadocalc.toString();
        return respuesta;
    }
    
    private void btnmasmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasmenosActionPerformed
        // TODO add your handling code here:
        contenido=txtmostrar.getText();
        if(contenido.length()>0) {
            resultado=(-1)*Double.parseDouble(contenido);
            txtmostrar.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnmasmenosActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        // TODO add your handling code here:
        if(!txtmostrar.getText().equals("")) {
            valor1=txtmostrar.getText();
            signo="+";
            txtmostrar.setText("");
        }
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        // TODO add your handling code here:
        if(!txtmostrar.getText().equals("")) {
            valor1=txtmostrar.getText();
            signo="-";
            txtmostrar.setText("");
        }
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicarActionPerformed
        // TODO add your handling code here:
        if(!txtmostrar.getText().equals("")) {
            valor1=txtmostrar.getText();
            signo="*";
            txtmostrar.setText("");
        }
    }//GEN-LAST:event_btnmultiplicarActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
        // TODO add your handling code here:
        if(!txtmostrar.getText().equals("")) {
            valor1=txtmostrar.getText();
            signo="/";
            txtmostrar.setText("");
        }
    }//GEN-LAST:event_btndividirActionPerformed

    private void btnxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxyActionPerformed
        // TODO add your handling code here:
        if(!txtmostrar.getText().equals("")) {
            valor1=txtmostrar.getText();
            signo="x^y";
            txtmostrar.setText("");
        }
    }//GEN-LAST:event_btnxyActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        // TODO add your handling code here:
        String resultadototal;
        valor2=txtmostrar.getText();
        if(!valor2.equals("")) {
            resultadototal=operaciones(valor1, valor2, signo);
            txtmostrar.setText(resultadototal);
        }
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorrarActionPerformed
        // TODO add your handling code here:
        contenido=txtmostrar.getText();
        if(contenido.length ()>0){
            contenido=contenido.substring(0,contenido.length()-1);;
            txtmostrar.setText(contenido);
        }
    }//GEN-LAST:event_btnorrarActionPerformed

    private void btnraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizActionPerformed
        // TODO add your handling code here:
        contenido=txtmostrar.getText();
        if(contenido.length()>0) {
            resultado= Math.sqrt(Double.parseDouble(contenido));
            txtmostrar.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnraizActionPerformed

    private void btnx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnx2ActionPerformed
        // TODO add your handling code here:
        contenido=txtmostrar.getText();
        if (contenido.length()>0) {
            resultado=Math.pow(Double.parseDouble(contenido), 2);
            txtmostrar.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnx2ActionPerformed

    private void btnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexActionPerformed
        // TODO add your handling code here:
        contenido=txtmostrar.getText();
        if (contenido.length()>0) {
            resultado=Math.exp(Double.parseDouble(contenido));
            txtmostrar.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnexActionPerformed

  
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
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1x;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnex;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmasmenos;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnorrar;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnraiz;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JButton btnx2;
    private javax.swing.JButton btnxy;
    private javax.swing.JTextField txtmostrar;
    // End of variables declaration//GEN-END:variables
}
