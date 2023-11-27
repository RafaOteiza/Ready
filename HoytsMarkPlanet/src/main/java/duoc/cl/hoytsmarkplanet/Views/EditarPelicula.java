
package duoc.cl.hoytsmarkplanet.Views;

import duoc.cl.hoytsmarkplanet.Service.PeliculaService;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditarPelicula extends javax.swing.JInternalFrame {
    private final PeliculaService peliculaService;
    private javax.swing.JButton botonActualizar;
    
    public EditarPelicula() {
        initComponents();
        this.peliculaService = new PeliculaService();
        this.peliculaService.listarPeliculas(tablaPeliculas);
        setClosable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPeliculas = new javax.swing.JTable();
        botonModificar = new javax.swing.JButton();
        textoApoyo = new javax.swing.JLabel();
        botonModificar1 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setTitle("Editar Película");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        tablaPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Director", "Año", "Duracion", "Genero"
            }
        ));
        jScrollPane1.setViewportView(tablaPeliculas);

        getContentPane().add(jScrollPane1, new java.awt.GridBagConstraints());

        botonModificar.setText("Actualizar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar, new java.awt.GridBagConstraints());

        textoApoyo.setText("(*)Para editar, selecciona la pelicula en la tabla y apreta Modificar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(textoApoyo, gridBagConstraints);

        botonModificar1.setText("Modificar");
        botonModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(botonModificar1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaPeliculas.getModel();
        modelo.setRowCount(0);
        
        this.peliculaService.listarPeliculas(tablaPeliculas);
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificar1ActionPerformed
        try {
            int column = 0;
            int row = tablaPeliculas.getSelectedRow();
            int movElim = Integer.valueOf(tablaPeliculas.getModel().getValueAt(row, column).toString());
            new VentanaModificar(movElim).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una pelicula para modificar");
        }
    }//GEN-LAST:event_botonModificar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonModificar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPeliculas;
    private javax.swing.JLabel textoApoyo;
    // End of variables declaration//GEN-END:variables
}
