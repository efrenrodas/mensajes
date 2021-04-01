/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compuexpertos.mensajes;

import java.sql.SQLException;

/**
 *
 * @author efren
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Conexion.getConexion();
    }
    
}
