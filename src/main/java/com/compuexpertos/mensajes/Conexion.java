/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compuexpertos.mensajes;
import java.net.URL;
import java.sql.*;
/**
 *
 * @author efren
 */
public class Conexion {
    private static final String URL="jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC";
    private static final String USER="root";
    private static final String PASS="";
  
    public static Connection getConexion() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    return DriverManager.getConnection(URL,USER,PASS);
    }
    public static void cerrar(ResultSet rs) throws SQLException
    {
    rs.close();
    }
     public static void cerrar(PreparedStatement ps) throws SQLException
    {
    ps.close();
    }
      public static void cerrar(Connection conn) throws SQLException
    {
    conn.close();
    }
}
