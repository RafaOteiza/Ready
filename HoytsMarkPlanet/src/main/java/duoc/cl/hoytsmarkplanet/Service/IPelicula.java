/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duoc.cl.hoytsmarkplanet.Service;

import duoc.cl.hoytsmarkplanet.DTO.PeliculaDTO;
import javax.swing.JTable;

/**
 *
 * @author cetecom
 */
public interface IPelicula {
    
    public void agregarPelicula(PeliculaDTO movie);
    public void eliminarPelicula(int idPelicula) ;
    public void modificarPelicula(PeliculaDTO movie, int id);
    public void listarPeliculas(JTable tab) ;
    public void buscarPeliculas(JTable tab, String generoBuscar);
    public void buscarPeliculasAnnio(JTable tab, String annioBuscar, String annioBuscar2);
    public PeliculaDTO obtenerPelicula(int id);
            
            
           
    }