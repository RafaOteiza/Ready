
package duoc.cl.hoytsmarkplanet.Views;

import duoc.cl.hoytsmarkplanet.Service.PeliculaService;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EliminarPelicula extends javax.swing.JInternalFrame {
    
    private final PeliculaService peliculaService;

    public EliminarPelicula() {
        initComponents();
        this.peliculaService = new PeliculaService();
        this.peliculaService.listarPeliculas(listaMovies);
        setClosable(true); //Es para cerrar las ventanas
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMovies = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(565, 481));

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        listaMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Director", "Año"
            }
        ));
        jScrollPane2.setViewportView(listaMovies);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEliminar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            int column = 0;
            int row = listaMovies.getSelectedRow();
            int movElim = Integer.valueOf(listaMovies.getModel().getValueAt(row, column).toString());
            this.peliculaService.eliminarPelicula(movElim);
            DefaultTableModel model = (DefaultTableModel) listaMovies.getModel();
            model.setRowCount(0);
            this.peliculaService.listarPeliculas(listaMovies);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una pelicula para eliminar");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaMovies;
    // End of variables declaration//GEN-END:variables
}
