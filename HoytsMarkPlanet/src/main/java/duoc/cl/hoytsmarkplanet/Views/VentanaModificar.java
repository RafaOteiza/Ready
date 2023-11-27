package duoc.cl.hoytsmarkplanet.Views;


import duoc.cl.hoytsmarkplanet.DTO.PeliculaDTO;
import duoc.cl.hoytsmarkplanet.Service.PeliculaService;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class VentanaModificar extends javax.swing.JFrame {

    private final PeliculaService peliculaService;
    
    public VentanaModificar(int id) {
        initComponents();
        campoId.setText(String.valueOf(id));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.peliculaService = new PeliculaService();
        
        PeliculaDTO pel = this.peliculaService.obtenerPelicula(id);
        campoAnno.setText(String.valueOf(pel.getAño()));
        campoDirector.setText(pel.getDirector());
        campoDuracion.setText(String.valueOf(pel.getDuracion()));
        campoGenero.setText(pel.getGenero());
        campoTitulo.setText(pel.getTitulo());
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        labelTitulo = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        labelDirector = new javax.swing.JLabel();
        campoDirector = new javax.swing.JTextField();
        labelAnno = new javax.swing.JLabel();
        campoAnno = new javax.swing.JTextField();
        labelDuracion = new javax.swing.JLabel();
        campoDuracion = new javax.swing.JTextField();
        labelGenero = new javax.swing.JLabel();
        campoGenero = new javax.swing.JTextField();
        botonModificar = new javax.swing.JButton();
        campoId = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelTitulo.setText("Titulo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(labelTitulo, gridBagConstraints);

        campoTitulo.setPreferredSize(new java.awt.Dimension(300, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(campoTitulo, gridBagConstraints);

        labelDirector.setText("Director:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(labelDirector, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(campoDirector, gridBagConstraints);

        labelAnno.setText("Año:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(labelAnno, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(campoAnno, gridBagConstraints);

        labelDuracion.setText("Duracion(minutos):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(labelDuracion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(campoDuracion, gridBagConstraints);

        labelGenero.setText("Genero:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(labelGenero, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(campoGenero, gridBagConstraints);

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(botonModificar, gridBagConstraints);

        campoId.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(campoId, gridBagConstraints);

        labelId.setText("ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(labelId, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
    try {
        int idMovie = Integer.valueOf(campoId.getText());

        String tit = campoTitulo.getText();
        String dire = campoDirector.getText();
        String annoStr = campoAnno.getText();
        String duraStr = campoDuracion.getText();
        String genero = campoGenero.getText();

        int anno, dura;

        // Validar que Año y Duración contengan solo números
        try {
            anno = Integer.parseInt(annoStr);
            dura = Integer.parseInt(duraStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Año y Duración deben ser números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Salir del método si hay un error
        }

        PeliculaDTO mov = new PeliculaDTO(tit, dire, anno, dura, genero);

        this.peliculaService.modificarPelicula(mov, idMovie);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Año y Duración deben ser números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField campoAnno;
    private javax.swing.JTextField campoDirector;
    private javax.swing.JTextField campoDuracion;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel labelAnno;
    private javax.swing.JLabel labelDirector;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
