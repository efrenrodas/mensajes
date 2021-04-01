/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compuexpertos.mensajes;

/**
 *
 * @author efren
 */
import static com.compuexpertos.mensajes.Conexion.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MensajeDAO {
    private Connection conn = null;
    private PreparedStatement ps= null;
    private ResultSet rs = null;
    private Mensaje mensaje;
    
    public List<Mensaje> seleccionar()
    {
        try {
            String sql ="select * from mensajes";
            List<Mensaje> mensajes = new ArrayList<>();
            this.conn= getConexion();
            this.ps=this.conn.prepareStatement(sql);
            this.rs=this.ps.executeQuery();
            while(this.rs.next()){
                int id = this.rs.getInt("idmensajes");
                String mensaje = this.rs.getString("mensaje");
                String autor = this.rs.getString("autor");
                String fecha = this.rs.getString("fecha");
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MensajeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MensajeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
