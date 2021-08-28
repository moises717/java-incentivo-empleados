package db;

import java.sql.*;

public class Conexion {

    String strConn = "jdbc:sqlite:C:\\Users\\Moises\\OneDrive\\Documentos\\db\\empleados.s3db";
    Connection conn = null;

    public Conexion() {

        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection(strConn);
            

            System.out.println("Conexion establecida.");

        } catch (Exception e) {

            System.out.println("Error al conectar la base de datos = " + e);
        }

    }

    public int ejecuatarSenteciaSQL(String strSenSQL) {

        try {

            PreparedStatement pstm = conn.prepareStatement(strSenSQL);
            pstm.execute();
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }

    }

    public ResultSet consultarRegistro(String sentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(sentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (SQLException e) {

            System.out.println(e);
            return null;

        }
    }

}
