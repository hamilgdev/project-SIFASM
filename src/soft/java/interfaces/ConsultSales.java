
package soft.java.interfaces;

import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import soft.java.conection.MySQLConnection;

public class ConsultSales extends javax.swing.JFrame {

    int x, y;
    String searchAttribute = "id_caja";
    
    // conector a la Base de datos
    MySQLConnection conex = new MySQLConnection();
    Connection con = conex.getConnectionBD();
        
    
    public ConsultSales() {
        this.setUndecorated(true);
        initComponents();
        setTitle("Registro de ventas");
        this.setLocationRelativeTo(null);
        ShowTable("");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSearch = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        rbt_nameProducts = new javax.swing.JRadioButton();
        rbt_dateIngreso = new javax.swing.JRadioButton();
        rbt_dateSalida = new javax.swing.JRadioButton();
        btn_search = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_sales = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 52, 67));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/java/files/close24px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/java/files/minimizar24px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(239, 243, 246));
        jLabel22.setText("Registro de ventas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 875, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        jPanel3.setBackground(new java.awt.Color(44, 57, 74));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/java/files/regresar64px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 490));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(239, 243, 246));

        rbt_nameProducts.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbt_nameProducts.setText("Nombre venta producto");
        rbt_nameProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_nameProductsActionPerformed(evt);
            }
        });

        rbt_dateIngreso.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbt_dateIngreso.setText("Fecha ingreso");
        rbt_dateIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_dateIngresoActionPerformed(evt);
            }
        });

        rbt_dateSalida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbt_dateSalida.setText("Fecha salida");

        btn_search.setBackground(new java.awt.Color(255, 255, 255));
        btn_search.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btn_search.setForeground(new java.awt.Color(49, 56, 62));
        btn_search.setText("Buscar");
        btn_search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn_search.setBorderPainted(false);
        btn_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_search.setFocusable(false);
        btn_search.setMargin(new java.awt.Insets(48, 16, 16, 48));
        btn_search.setPreferredSize(new java.awt.Dimension(160, 40));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        txt_buscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(rbt_nameProducts)
                .addGap(69, 69, 69)
                .addComponent(rbt_dateIngreso)
                .addGap(71, 71, 71)
                .addComponent(rbt_dateSalida)
                .addGap(89, 89, 89)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbt_nameProducts)
                    .addComponent(rbt_dateIngreso)
                    .addComponent(rbt_dateSalida)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 1190, 260));

        table_sales.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        table_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_sales.setGridColor(new java.awt.Color(255, 255, 255));
        table_sales.setRowHeight(25);
        jScrollPane1.setViewportView(table_sales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 1190, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // metodo para mostrar la tabla de la Base Datos 
    void ShowTable(String id_search){
        DefaultTableModel modelo = new DefaultTableModel();       
            modelo.addColumn("ID Producto");
            modelo.addColumn("Nombre producto");
            modelo.addColumn("Cantidad compra");
            modelo.addColumn("Modo pago");
            modelo.addColumn("Efectivo");
            modelo.addColumn("Fecha ingreso");
            modelo.addColumn("Fecha salida");
            modelo.addColumn("Cantidad restante");
            modelo.addColumn("Total pago");
            modelo.addColumn("Cantidad disponible");
            modelo.addColumn("Estado");
                table_sales.setModel(modelo);         
            String sql = "";
            if(id_search.equals("")){
                sql = "SELECT id_caja, nombre_prod_caja, cantidad_compra, modo_pago, efectivo, fecha_ingreso, fecha_salida, cantidad_restante, total_pago, cantidad_disponible, estado FROM caja INNER JOIN inventario ON caja.id_inventario1 = inventario.id_inventario;";
            }else{
                sql = "SELECT id_caja, nombre_prod_caja, cantidad_compra, modo_pago, efectivo, fecha_ingreso, fecha_salida, cantidad_restante, total_pago, cantidad_disponible, estado FROM caja INNER JOIN inventario ON caja.id_inventario1 = inventario.id_inventario WHERE "+searchAttribute+" LIKE '"+id_search+"%'";
            }
            String datos[] = new String[11];
            Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    datos[0] = rs.getString(1); /*ID Producto*/
                    datos[1] = rs.getString(2); /*Nombre producto*/
                    datos[2] = rs.getString(3); /*Cantidad compra*/
                    datos[3] = rs.getString(4); /*Modo pago*/
                    datos[4] = rs.getString(5); /*Efectivo*/
                    datos[5] = rs.getString(6); /*Fecha ingreso*/
                    datos[6] = rs.getString(7); /*Fecha salida*/
                    datos[7] = rs.getString(8); /*Cantidad restante*/
                    datos[8] = rs.getString(9); /*Total pago*/
                    datos[9] = rs.getString(10); /*Cantidad disponible*/
                    datos[10] = rs.getString(11); /*Estado*/
                        modelo.addRow(datos);
                }
                 table_sales.setModel(modelo);
                
        } catch (SQLException ex) {
            Logger.getLogger(ConsultSales.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?", "Salir", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Boton volver
        MainMenu mainmenu = new MainMenu();
        mainmenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void rbt_nameProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_nameProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_nameProductsActionPerformed

    private void rbt_dateIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_dateIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_dateIngresoActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // Boton Buscar
        buttonGroupSearch.add(rbt_nameProducts);
        buttonGroupSearch.add(rbt_dateIngreso);
        buttonGroupSearch.add(rbt_dateSalida);

        if(rbt_nameProducts.isSelected()){
            searchAttribute = "nombre_prod_caja";
            ShowTable(txt_buscar.getText());
        }
        else if(rbt_dateIngreso.isSelected()){searchAttribute = "fecha_ingreso"; ShowTable(txt_buscar.getText());}
        else if(rbt_dateSalida.isSelected()){searchAttribute = "fecha_salida"; ShowTable(txt_buscar.getText());}
        else{JOptionPane.showMessageDialog(null, "No se selecciono ningun tipo de Búsqueda"+"");}
    }//GEN-LAST:event_btn_searchActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // Mouse Pressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // Mouse Dragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(ConsultSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private javax.swing.ButtonGroup buttonGroupSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbt_dateIngreso;
    private javax.swing.JRadioButton rbt_dateSalida;
    private javax.swing.JRadioButton rbt_nameProducts;
    private javax.swing.JTable table_sales;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
