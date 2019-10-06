package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Querys  extends Conexion{
	
	

public void insert(Producto product) {

	PreparedStatement ps = null;

	String sql = "INSERT INTO PRODUCTOS (CODIGOARTICULO,NOMBREARTICULO, PRECIO,PAISDEORIGEN) VALUES (?, ?, ?, ?) ";
	
	try {

		ps = miConexion.prepareStatement(sql);

		ps.setInt(1, product.getCodigo());
		ps.setString(2, product.getNombre());
		ps.setString(3, String.valueOf(product.getPrecio()));
		ps.setString(4, product.getPaisDeOrigen());
		ps.execute();
		ps.close();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public void modificar(Producto updte) {

	PreparedStatement ps = null;

	String sql = " UPDATE PRODUCTOS SET   NOMBREARTICULO = ? , PRECIO = ? , PAISDEORIGEN = ? WHERE CODIGOARTICULO = ? ";

	try {

		ps = miConexion.prepareStatement(sql);
		ps.setInt(1, updte.getCodigo());
		ps.setString(2, updte.getNombre());
		ps.setString(3, String.valueOf(updte.getPrecio()));
		ps.setString(4, updte.getPaisDeOrigen());
		ps.executeUpdate();
		ps.close();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}



public ResultSet cargarTabla() {

	PreparedStatement ps = null;

	String sql = "SELECT * FROM PRODUCTOS ";

	try {

		ps = miConexion.prepareStatement(sql);
		ResultSet resultado = ps.executeQuery(sql);
		return resultado;

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}



public void Eliminar(Producto elim) {
	
	PreparedStatement ps = null;

	String sql = " DELETE FROM PRODUCTOS WHERE CODIGOARTICULO = ? ";

	try {

		ps = miConexion.prepareStatement(sql);

		ps.setInt(1, elim.getCodigo());
		ps.execute();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}

}



