/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis_musica.cancionesDAL;
//importando libreraia para realizar la conexion
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hector Estrada
 */
//Clase
public class conexion {
    //string de conexion
    //Ruta de conexion
    String strConexionDB="jdbc:sqlite:C:/Users/Hector Estrada/Documents/db/sistema.s3db";
    Connection conn= null;
    //Uso de try - catch
    //Constructor que nos permite la conexion
    public conexion(){
        //En el caso de que la conexión sea exitosa
        try {
            Class.forName("org.sqlite.JDBC");
            conn= DriverManager.getConnection(strConexionDB);
            
            System.out.print("Conexion exitosa");
        //Caso contrario (Que se presente algún inconveniente en la conexión)
        } catch (Exception e) {
            System.out.print("Conexion fallida"+e);
        }
    }
    
    //Ejecución para la inserción de datos
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            //Preparar sentencia SQL para ser ejecutada
            PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta= pstm.executeQuery();
            return respuesta;
            //Devolvemos con esto la información de la consulta
        } catch (Exception e) {
            //Saber si la información existe
            System.out.print(e);
            return null;
        }
    }
    
}
