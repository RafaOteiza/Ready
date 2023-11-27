/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duoc.cl.hoytsmarkplanet.Service;

import duoc.cl.hoytsmarkplanet.DAO.PeliculaDAO;
import duoc.cl.hoytsmarkplanet.DTO.PeliculaDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cetecom
 */
public class PeliculaService implements IPelicula {
    
    
    private final PeliculaDAO peliculaDAO;

    public PeliculaService() {
        this.peliculaDAO = new PeliculaDAO();
        peliculaDAO.conectar();
    }
    
    public void agregarPelicula(PeliculaDTO movie) {
        try {
            peliculaDAO.conectar(); 
            String insertSQL
                    = "INSERT INTO movie "
                    + "(titulo, director, año, duracion, genero)"
                    + "VALUES(?, ?, ?, ?, ?)";

            PreparedStatement dec = peliculaDAO.getConexion().prepareStatement(insertSQL);

            dec.setString(1, movie.getTitulo());
            dec.setString(2, movie.getDirector());
            dec.setInt(3, movie.getAño());
            dec.setInt(4, movie.getDuracion());
            dec.setString(5, movie.getGenero());

            dec.executeUpdate();

            dec.close();

            JOptionPane.showMessageDialog(null, "Se agrego la pelicula con exito", "Exito", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en conexion: " + e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void eliminarPelicula(int idPelicula) {
        try {

            String deleteSQL
                    = "DELETE FROM movie "
                    + "WHERE id = ?";
            PreparedStatement dec = peliculaDAO.getConexion().prepareStatement(deleteSQL);

            dec.setInt(1, idPelicula);

            dec.executeUpdate();

            dec.close();

            JOptionPane.showMessageDialog(null, "Se elimino la pelicula con exito", "Exito", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en conexion: " + e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void modificarPelicula(PeliculaDTO movie, int id) {

        String modSQL = "UPDATE movie SET titulo = ?, director = ?, año = ?, duracion = ?, genero = ? WHERE id = ?;";

        try {
            PreparedStatement st = peliculaDAO.getConexion().prepareStatement(modSQL);

            st.setString(1, movie.getTitulo());
            st.setString(2, movie.getDirector());
            st.setInt(3, movie.getAño());
            st.setInt(4, movie.getDuracion());
            st.setString(5, movie.getGenero());

            st.setInt(6, id);

            st.executeUpdate();
            st.close();

            JOptionPane.showMessageDialog(null, "Se modifico la pelicula con exito", "Exito", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en conexion: " + e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void listarPeliculas(JTable tab) {
        String listSQL = "SELECT * FROM movie;";

        try {
            Statement st = peliculaDAO.getConexion().createStatement();

            ResultSet rs = st.executeQuery(listSQL);

            while (rs.next()) {

                String id = String.valueOf(rs.getInt("id"));
                String titulo = rs.getString("titulo");
                String director = rs.getString("director");
                String anno = String.valueOf(rs.getInt("año"));
                String duracion = String.valueOf(rs.getInt("duracion"));
                String genero = rs.getString("genero");

                String datostabla[] = {id, titulo, director, anno, duracion, genero};

                System.out.println(id);
                System.out.println(titulo);
                DefaultTableModel dtb = (DefaultTableModel) tab.getModel();

                dtb.addRow(datostabla);
            }

            st.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en conexion: " + e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void buscarPeliculas(JTable tab, String generoBuscar) {
        String listSQL = "SELECT * FROM movie WHERE genero = '" + generoBuscar + "' ;";
        System.out.println(listSQL);
        System.out.println(generoBuscar);
        try {
            Statement st = peliculaDAO.getConexion().createStatement();
            ResultSet rs = st.executeQuery(listSQL);

            while (rs.next()) {

                String id = String.valueOf(rs.getInt("id"));
                String titulo = rs.getString("titulo");
                String director = rs.getString("director");
                String anno = String.valueOf(rs.getInt("año"));
                String duracion = String.valueOf(rs.getInt("duracion"));
                String genero = rs.getString("genero");

                String datostabla[] = {id, titulo, director, anno, duracion, genero};

                System.out.println(id);
                System.out.println(titulo);
                DefaultTableModel dtb = (DefaultTableModel) tab.getModel();

                dtb.addRow(datostabla);
            }

            st.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en conexion: " + e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void buscarPeliculasAnnio(JTable tab, String annioBuscar, String annioBuscar2) {
        String listSQL = "SELECT * FROM movie WHERE año BETWEEN " + annioBuscar + " and " + annioBuscar2 + " ;";
        System.out.println(listSQL);
        System.out.println(annioBuscar);
        try {
            Statement st = peliculaDAO.getConexion().createStatement();
            ResultSet rs = st.executeQuery(listSQL);

            while (rs.next()) {

                String id = String.valueOf(rs.getInt("id"));
                String titulo = rs.getString("titulo");
                String director = rs.getString("director");
                String anno = String.valueOf(rs.getInt("año"));
                String duracion = String.valueOf(rs.getInt("duracion"));
                String genero = rs.getString("genero");

                String datostabla[] = {id, titulo, director, anno, duracion, genero};

                System.out.println(id);
                System.out.println(titulo);
                DefaultTableModel dtb = (DefaultTableModel) tab.getModel();

                dtb.addRow(datostabla);
            }

            st.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en conexion: " + e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public PeliculaDTO obtenerPelicula(int id) {
        String listSQL = "SELECT * FROM movie WHERE id = " + id + ";";

        try {
            Statement st = peliculaDAO.getConexion().createStatement();

            ResultSet rs = st.executeQuery(listSQL);

            if (rs.next()) {
                String titulo = rs.getString("titulo");
                String director = rs.getString("director");
                String anno = String.valueOf(rs.getInt("año"));
                String duracion = String.valueOf(rs.getInt("duracion"));
                String genero = rs.getString("genero");
                PeliculaDTO pel = new PeliculaDTO(titulo, director, Integer.valueOf(anno), Integer.valueOf(duracion), genero);
                st.close();
                return pel;
            } else {
                st.close();
                return new PeliculaDTO("", "", 0, 0, "");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en conexion: " + e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
            return new PeliculaDTO("", "", 0, 0, "");
        }
    }
}