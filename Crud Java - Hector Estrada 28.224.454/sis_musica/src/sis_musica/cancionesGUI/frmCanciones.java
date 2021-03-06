/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis_musica.cancionesGUI;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sis_musica.cancionesBL.cancionesBL;
import sis_musica.cancionesDAL.conexion;
/**
 *
 * @author Hector Estrada
 */
public class frmCanciones extends javax.swing.JFrame {
    DefaultTableModel modelo;

    /**
     * Creates new form frmCanciones
     */
    //Desplegamos los nombres de los titulos en la tabla de la interfaz
    public frmCanciones() {
        initComponents();
        
        String[] titulos= {"ID", "Nombre", "Album", "Artista", "Genero", "Año de lanzamiento"};
        modelo= new DefaultTableModel(null, titulos);
        tblMusica.setModel(modelo);
        this.mostrarDatos();
        this.limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusica = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAlbum = new javax.swing.JTextField();
        txtArtista = new javax.swing.JTextField();
        txtAlan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMusica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "title 5", "title 6"
            }
        ));
        tblMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMusicaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMusica);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis_musica/recursos/disquete.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis_musica/recursos/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis_musica/recursos/borrar-archivo.png"))); // NOI18N
        btnBorrar.setText("Eliminar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis_musica/recursos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAlbumMouseClicked(evt);
            }
        });

        txtArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtArtistaMouseClicked(evt);
            }
        });
        txtArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtistaActionPerformed(evt);
            }
        });

        txtAlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAlanMouseClicked(evt);
            }
        });
        txtAlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlanActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nombre de la canción:");

        jLabel3.setText("Nombre del album al que pertenece:");

        jLabel4.setText("Artista:");

        jLabel5.setText("Año de lanzamiento:");

        txtGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGeneroMouseClicked(evt);
            }
        });
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        jLabel6.setText("Genero:");

        jLabel7.setText("Registro de Canciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(txtArtista, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                .addComponent(txtGenero)
                                .addComponent(txtAlbum))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtAlan, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(171, 171, 171)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(10, 10, 10)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlanActionPerformed
        
    }//GEN-LAST:event_txtAlanActionPerformed

    private void txtArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtistaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed
    //Insertar información en la base de datos
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        conexion objConexion = new conexion();
        //Recuperaremos los datos del interface y los insertamos a la tabla/Bdd
        cancionesBL oCanciones= recuperarDatosGUI();
        
        String strSentenciaInsert= String.format("INSERT INTO Canciones (ID, Nombre, Album, Artista, Genero, Alan) "
                + "VALUES (null, '%s', '%s', '%s', '%s', '%s')", oCanciones.getNombre(), oCanciones.getAlbum(), oCanciones.getArtista(), oCanciones.getGenero(), oCanciones.getAlan());
                
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        //
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed
    //Llenamos el metodo para mostrar los registros en la tabla
    public void mostrarDatos(){
    //Limpieza de la tabla luego de eliminar
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
    //Conexion para seleccionar la informacion
    conexion objConexion = new conexion();
        try {
            ResultSet resultado= objConexion.consultarRegistros("SELECT * FROM Canciones");
            while (resultado.next()) {
                System.out.println( resultado.getString("ID"));
                System.out.println( resultado.getString("Nombre"));
                System.out.println( resultado.getString("Album"));
                System.out.println( resultado.getString("Artista"));
                System.out.println( resultado.getString("Genero"));
                System.out.println( resultado.getString("Alan"));
                //Objetos con datos de la tabla
                Object[] oCancion= {resultado.getString("ID"), resultado.getString("Nombre"), resultado.getString("Album"), resultado.getString("Artista"), resultado.getString("Genero"), resultado.getString("Alan")};
                modelo.addRow(oCancion);
            }
        } catch (Exception e) {
            System.out.print(e);
        } 
    }

//Recuperación de datos
    public cancionesBL recuperarDatosGUI(){
        //Creando instancia
         cancionesBL oCanciones=new cancionesBL();
         //Recuperamos información
         int ID= (txtID.getText().isEmpty())?0: Integer.parseInt(txtID.getText());
         oCanciones.setID(ID);
         oCanciones.setNombre(txtNombre.getText());
         oCanciones.setAlbum(txtAlbum.getText());
         oCanciones.setArtista(txtArtista.getText());
         oCanciones.setGenero(txtGenero.getText());
         oCanciones.setAlan(txtAlan.getText());
         //retornamos la instancia creada
         return oCanciones;
    }
    
    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void tblMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusicaMouseClicked
        if(evt.getClickCount()==1){
            JTable receptor= (JTable)evt.getSource();
            //Recepcionamos valores del click, escogiendo la fila que se selecciono, comprobando si es la fila 0
            //Y luego convertimos a String
            txtID.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 0) .toString() );
            txtNombre.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 1) .toString() );
            txtAlbum.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString() );
            txtArtista.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 3) .toString() );
            txtGenero.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 4) .toString() );
            txtAlan.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 5) .toString() );
        }
        //Activar y desactivar botones segun la operacion que se este realizando
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_tblMusicaMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //Conectamos a la base de datos 
        conexion objConexion = new conexion();
        //Obtenemos la informacion que esta en la interfaz
        cancionesBL oCanciones= recuperarDatosGUI();
        //Hacemos la sentencia para la eliminacion de los datos cuando el id coincida con el id de la interfaz
        String strSentenciaInsert= String.format("DELETE FROM Canciones WHERE ID=%d" ,oCanciones.getID());
        //Ejecutar la sentencia e instruccion
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        //Mostrar la informacion que queda luego de hacer la eliminacion de los datos
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        conexion objConexion = new conexion();
        //Recuperaremos los datos del interface y los insertamos a la tabla/Bdd
        cancionesBL oCanciones= recuperarDatosGUI();
        
        String strSentenciaInsert= String.format("UPDATE Canciones SET Nombre='%s', "
                + "Album='%s', "
                + "Artista='%s', "
                + "Genero='%s', "
                + "Alan='%s' WHERE ID=%d", oCanciones.getNombre(), oCanciones.getAlbum(), oCanciones.getArtista(), oCanciones.getGenero(), oCanciones.getAlan(), oCanciones.getID());
                
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAlbumMouseClicked
        
    }//GEN-LAST:event_txtAlbumMouseClicked

    private void txtArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArtistaMouseClicked
        
    }//GEN-LAST:event_txtArtistaMouseClicked

    private void txtGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGeneroMouseClicked
       
    }//GEN-LAST:event_txtGeneroMouseClicked

    private void txtAlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAlanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlanMouseClicked
    //Limpieza de los datos
    public void limpiar(){
        //Orden de limpieza
        txtID.setText("");
        txtNombre.setText("");
        txtAlbum.setText("");
        txtArtista.setText("");
        txtGenero.setText("");
        txtAlan.setText("");
        //Activar y desactivar botones segun la operacion que se este realizando
        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnCancelar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(frmCanciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCanciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCanciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCanciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCanciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblMusica;
    private javax.swing.JTextField txtAlan;
    private javax.swing.JTextField txtAlbum;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
