package org.vistas;

public class CrearC extends javax.swing.JFrame {
    /**
     * Creates new form actualizarC
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Telefono = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Inventario = new javax.swing.JLabel();
        Crear = new javax.swing.JLabel();
        Historial = new javax.swing.JLabel();
        Facturas = new javax.swing.JLabel();
        Proveedores = new javax.swing.JLabel();
        Producto = new javax.swing.JLabel();
        Empleados = new javax.swing.JLabel();
        Clientes1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        Telefono.setBackground(new java.awt.Color(255, 255, 255));
        Telefono.setForeground(new java.awt.Color(0, 0, 0));
        Telefono.setBorder(null);
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Telefono);
        Telefono.setBounds(680, 300, 190, 20);

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setBorder(null);
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Nombre);
        Nombre.setBounds(250, 230, 180, 20);

        Direccion.setBackground(new java.awt.Color(255, 255, 255));
        Direccion.setForeground(new java.awt.Color(0, 0, 0));
        Direccion.setBorder(null);
        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Direccion);
        Direccion.setBounds(250, 380, 180, 16);

        Correo.setBackground(new java.awt.Color(255, 255, 255));
        Correo.setForeground(new java.awt.Color(0, 0, 0));
        Correo.setBorder(null);
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Correo);
        Correo.setBounds(680, 240, 190, 20);

        Inventario.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Inventario.setForeground(new java.awt.Color(255, 255, 51));
        Inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventarioMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Inventario);
        Inventario.setBounds(40, 126, 90, 20);

        Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Crear);
        Crear.setBounds(680, 380, 100, 30);

        Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Historial);
        Historial.setBounds(30, 160, 90, 30);

        Facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacturasMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Facturas);
        Facturas.setBounds(30, 200, 90, 30);

        Proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedoresMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Proveedores);
        Proveedores.setBounds(30, 240, 120, 30);

        Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductoMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Producto);
        Producto.setBounds(30, 280, 120, 30);

        Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpleadosMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Empleados);
        Empleados.setBounds(30, 320, 120, 30);

        Clientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clientes1MouseClicked(evt);
            }
        });
        jLayeredPane1.add(Clientes1);
        Clientes1.setBounds(20, 360, 120, 30);

        fecha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(163, 58, 175));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Fecha-hora");
        jLayeredPane1.add(fecha);
        fecha.setBounds(1080, 30, 140, 19);

        nombreUsuario.setBackground(new java.awt.Color(251, 228, 234));
        nombreUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(163, 58, 175));
        nombreUsuario.setText("Nombre usuario");
        jLayeredPane1.add(nombreUsuario);
        nombreUsuario.setBounds(1150, 10, 100, 19);

        Id.setBackground(new java.awt.Color(255, 255, 255));
        Id.setForeground(new java.awt.Color(0, 0, 0));
        Id.setBorder(null);
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Id);
        Id.setBounds(250, 310, 190, 20);

        fondo.setIcon(new javax.swing.ImageIcon("Imagenes\\Crear cliente.jpg")); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLayeredPane1.add(fondo);
        fondo.setBounds(0, 0, 1260, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void InventarioMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void CrearMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void HistorialMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void FacturasMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void ProveedoresMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void ProductoMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void Clientes1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(actualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearC().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel Clientes1;
    private javax.swing.JTextField Correo;
    private javax.swing.JLabel Crear;
    private javax.swing.JTextField Direccion;
    private javax.swing.JLabel Empleados;
    private javax.swing.JLabel Facturas;
    private javax.swing.JLabel Historial;
    private javax.swing.JTextField Id;
    private javax.swing.JLabel Inventario;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel Producto;
    private javax.swing.JLabel Proveedores;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration
    public CrearC() {
        initComponents();

        jLayeredPane1.setBounds(0, 0,getWidth(), getHeight());

    }

}
