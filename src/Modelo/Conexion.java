package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class Conexion {

	Connection miConexion = null;

	public Conexion() {
		try {

			miConexion = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/Tarea?serverTimezone=UTC&useSSL=false", "root", "");

			System.out.print("conectado");

		} catch (Exception e) {

			System.out.print("no conectado");
			// TODO: handle exception
		}
	}


}

