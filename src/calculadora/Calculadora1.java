package calculadora;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

//By Jefferson Narvaez.

public class Calculadora1 extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    public Calculadora1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Jpanel_opera_result = new javax.swing.JPanel();
        txtoperacion = new javax.swing.JLabel();
        txtresultado = new javax.swing.JLabel();
        Jpanel_botones = new javax.swing.JPanel();
        btnc = new javax.swing.JButton();
        btnce = new javax.swing.JButton();
        btnexpo = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btndivi = new javax.swing.JButton();
        btnsiete = new javax.swing.JButton();
        btnocho = new javax.swing.JButton();
        btnnueve = new javax.swing.JButton();
        btncuatro = new javax.swing.JButton();
        btncinco = new javax.swing.JButton();
        btnseis = new javax.swing.JButton();
        btnuno = new javax.swing.JButton();
        btndos = new javax.swing.JButton();
        btntres = new javax.swing.JButton();
        btncero = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btn_nocturno = new javax.swing.JToggleButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setIconImages(null);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel_opera_result.setBackground(new java.awt.Color(204, 204, 204));
        Jpanel_opera_result.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtoperacion.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        txtoperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtoperacion.setText("5*10+20");

        txtresultado.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        txtresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtresultado.setText("70");

        javax.swing.GroupLayout Jpanel_opera_resultLayout = new javax.swing.GroupLayout(Jpanel_opera_result);
        Jpanel_opera_result.setLayout(Jpanel_opera_resultLayout);
        Jpanel_opera_resultLayout.setHorizontalGroup(
            Jpanel_opera_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_opera_resultLayout.createSequentialGroup()
                .addGroup(Jpanel_opera_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Jpanel_opera_resultLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        Jpanel_opera_resultLayout.setVerticalGroup(
            Jpanel_opera_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_opera_resultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(Jpanel_opera_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        Jpanel_botones.setBackground(new java.awt.Color(204, 204, 204));
        Jpanel_botones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Jpanel_botones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Jpanel_botonesKeyPressed(evt);
            }
        });

        btnc.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnc.setText("C");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnce.setText("CE");
        btnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceActionPerformed(evt);
            }
        });

        btnexpo.setText("%");
        btnexpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexpoActionPerformed(evt);
            }
        });

        btnmulti.setText("*");
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });

        btnsuma.setText("+");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });

        btnresta.setText("-");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });

        btndivi.setText("/");
        btndivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiviActionPerformed(evt);
            }
        });

        btnsiete.setText("7");
        btnsiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsieteActionPerformed(evt);
            }
        });

        btnocho.setText("8");
        btnocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnochoActionPerformed(evt);
            }
        });

        btnnueve.setText("9");
        btnnueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnueveActionPerformed(evt);
            }
        });

        btncuatro.setText("4");
        btncuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuatroActionPerformed(evt);
            }
        });

        btncinco.setText("5");
        btncinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncincoActionPerformed(evt);
            }
        });

        btnseis.setText("6");
        btnseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseisActionPerformed(evt);
            }
        });

        btnuno.setText("1");
        btnuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnunoActionPerformed(evt);
            }
        });

        btndos.setText("2");
        btndos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndosActionPerformed(evt);
            }
        });

        btntres.setText("3");
        btntres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntresActionPerformed(evt);
            }
        });

        btncero.setText("0");
        btncero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceroActionPerformed(evt);
            }
        });

        btnpunto.setText(".");
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });

        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 0, 0));
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btn_nocturno.setBackground(new java.awt.Color(204, 0, 0));
        btn_nocturno.setText("Nocturno");
        btn_nocturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nocturnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Jpanel_botonesLayout = new javax.swing.GroupLayout(Jpanel_botones);
        Jpanel_botones.setLayout(Jpanel_botonesLayout);
        Jpanel_botonesLayout.setHorizontalGroup(
            Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_botonesLayout.createSequentialGroup()
                        .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnsiete, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnce, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnocho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel_botonesLayout.createSequentialGroup()
                        .addComponent(btncero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_botonesLayout.createSequentialGroup()
                        .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btntres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnseis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnexpo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(btnnueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Jpanel_botonesLayout.createSequentialGroup()
                                .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btndivi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(btn_nocturno, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Jpanel_botonesLayout.createSequentialGroup()
                                .addComponent(btnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(Jpanel_botonesLayout.createSequentialGroup()
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Jpanel_botonesLayout.setVerticalGroup(
            Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnexpo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_botonesLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btn_nocturno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Jpanel_botonesLayout.createSequentialGroup()
                        .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel_botonesLayout.createSequentialGroup()
                                .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnocho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnnueve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addComponent(btnsiete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btncinco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnseis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btncuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btntres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28)
                .addGroup(Jpanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnpunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnigual, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );

        getContentPane().add(Jpanel_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        addNumber("-");
        if (txtresultado.getText().isEmpty() == false) {
            txtoperacion.setText(txtresultado.getText() + "-");
            txtresultado.setText("");
        }
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        txtoperacion.setText("");
        txtresultado.setText("");
    }//GEN-LAST:event_btncActionPerformed

    private void btnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceActionPerformed
        String texto = txtoperacion.getText().substring(0, txtoperacion.getText().length() - 1);
        txtoperacion.setText(texto);
    }//GEN-LAST:event_btnceActionPerformed

    private void btnexpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexpoActionPerformed
        if (txtresultado.getText().isEmpty() == false) {
            txtoperacion.setText(txtresultado.getText() + "*" + txtresultado.getText());
            txtresultado.setText("");
        } else {
        txtoperacion.setText(txtoperacion.getText()+"*"+txtoperacion.getText());
        }
    }//GEN-LAST:event_btnexpoActionPerformed

    private void btndiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiviActionPerformed
        addNumber("/");
        if (txtresultado.getText().isEmpty() == false) {
            txtoperacion.setText(txtresultado.getText() + "/");
            txtresultado.setText("");
        }
    }//GEN-LAST:event_btndiviActionPerformed

    private void btnsieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsieteActionPerformed
        addNumber("7");
    }//GEN-LAST:event_btnsieteActionPerformed

    private void btnochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnochoActionPerformed
        addNumber("8");
    }//GEN-LAST:event_btnochoActionPerformed

    private void btnnueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnueveActionPerformed
        addNumber("9");
    }//GEN-LAST:event_btnnueveActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
        addNumber("*");
        if (txtresultado.getText().isEmpty() == false) {
            txtoperacion.setText(txtresultado.getText() + "*");
            txtresultado.setText("");
        }
    }//GEN-LAST:event_btnmultiActionPerformed

    private void btncuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuatroActionPerformed
        addNumber("4");
    }//GEN-LAST:event_btncuatroActionPerformed

    private void btncincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncincoActionPerformed
        addNumber("5");
    }//GEN-LAST:event_btncincoActionPerformed

    private void btnseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseisActionPerformed
        addNumber("6");
    }//GEN-LAST:event_btnseisActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        addNumber("+");
        if (txtresultado.getText().isEmpty() == false) {
            txtoperacion.setText(txtresultado.getText() + "+");
            txtresultado.setText("");
        }
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnunoActionPerformed
        addNumber("1");
    }//GEN-LAST:event_btnunoActionPerformed

    private void btndosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndosActionPerformed
        addNumber("2");
    }//GEN-LAST:event_btndosActionPerformed

    private void btntresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntresActionPerformed
        addNumber("3");
    }//GEN-LAST:event_btntresActionPerformed

    private void btnceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceroActionPerformed
        addNumber("0");
    }//GEN-LAST:event_btnceroActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        if (txtoperacion.getText().contains("+") && txtoperacion.getText().contains("-") || txtoperacion.getText().contains("+") && txtoperacion.getText().contains("*") || txtoperacion.getText().contains("+") && txtoperacion.getText().contains("/") || txtoperacion.getText().contains("+") && txtoperacion.getText().contains("^")) {
            txtoperacion.setText("Operacion fallo 1");
            txtresultado.setText("Operacion fallo 1");
        } else if (txtoperacion.getText().contains("-") && txtoperacion.getText().contains("+") || txtoperacion.getText().contains("-") && txtoperacion.getText().contains("*") || txtoperacion.getText().contains("-") && txtoperacion.getText().contains("/") || txtoperacion.getText().contains("-") && txtoperacion.getText().contains("^")) {
            txtoperacion.setText("Operacion fallo 2");
            txtresultado.setText("Operacion fallo 2");
        } else if (txtoperacion.getText().contains("*") && txtoperacion.getText().contains("+") || txtoperacion.getText().contains("*") && txtoperacion.getText().contains("-") || txtoperacion.getText().contains("*") && txtoperacion.getText().contains("/") || txtoperacion.getText().contains("*") && txtoperacion.getText().contains("^")) {
            txtoperacion.setText("Operacion fallo 3");
            txtresultado.setText("Operacion fallo 3");
        } else if (txtoperacion.getText().contains("/") && txtoperacion.getText().contains("+") || txtoperacion.getText().contains("/") && txtoperacion.getText().contains("-") || txtoperacion.getText().contains("/") && txtoperacion.getText().contains("*") || txtoperacion.getText().contains("/") && txtoperacion.getText().contains("^")) {
            txtoperacion.setText("Operacion fallo 4");
            txtresultado.setText("Operacion fallo 4");
        } else if (txtoperacion.getText().contains("^") && txtoperacion.getText().contains("+") || txtoperacion.getText().contains("^") && txtoperacion.getText().contains("-") || txtoperacion.getText().contains("^") && txtoperacion.getText().contains("*") || txtoperacion.getText().contains("^") && txtoperacion.getText().contains("/")) {
            txtoperacion.setText("Operacion fallo 5");
            txtresultado.setText("Operacion fallo 5");
        }

        try { 
            String resultado = se.eval(txtoperacion.getText()).toString();
            if (resultado == null) {
                txtresultado.setText("Operacion fallo");
            } else {
                txtresultado.setText(resultado);
            }
        } catch (Exception e) {
            System.out.print(e);
        }

    }//GEN-LAST:event_btnigualActionPerformed

    private void btn_nocturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nocturnoActionPerformed
        if (btn_nocturno.isSelected() == true) {
            btn_nocturno.setBackground(Color.GREEN);
            Jpanel_opera_result.setBackground(Color.DARK_GRAY);
            Jpanel_botones.setBackground(Color.DARK_GRAY);
            txtoperacion.setForeground(Color.white);
            txtresultado.setForeground(Color.white);
        } else {
            btn_nocturno.setBackground(Color.red);
            Jpanel_opera_result.setBackground(Color.LIGHT_GRAY);
            Jpanel_botones.setBackground(Color.LIGHT_GRAY);
            txtoperacion.setForeground(Color.BLACK);
            txtresultado.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btn_nocturnoActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void Jpanel_botonesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jpanel_botonesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtoperacion.setText("0");
            System.out.println("cumple 1");
        }
    }//GEN-LAST:event_Jpanel_botonesKeyPressed

    public void addNumber(String digito) {
        txtoperacion.setText(txtoperacion.getText()+digito);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel_botones;
    private javax.swing.JPanel Jpanel_opera_result;
    private javax.swing.JToggleButton btn_nocturno;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnce;
    private javax.swing.JButton btncero;
    private javax.swing.JButton btncinco;
    private javax.swing.JButton btncuatro;
    private javax.swing.JButton btndivi;
    private javax.swing.JButton btndos;
    private javax.swing.JButton btnexpo;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton btnnueve;
    private javax.swing.JButton btnocho;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnseis;
    private javax.swing.JButton btnsiete;
    private javax.swing.JButton btnsuma;
    private javax.swing.JButton btntres;
    private javax.swing.JButton btnuno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel txtoperacion;
    private javax.swing.JLabel txtresultado;
    // End of variables declaration//GEN-END:variables
}
