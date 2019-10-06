package Modelo;

import java.sql.Connection;

import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;



public class Producto {

	private String buscar;
	
	private int codigo;
	private String nombre;
	private Double precio;
	private String PaisDeOrigen;
	private Conexion conexion = new Conexion();
	private Fichero miFichero = new Fichero();
	private Querys  miQuery  = new Querys();
	

	public Producto() {
	}

	public String getBuscar() {
		return buscar;
	}

	public void setBuscar(String buscar) {
		this.buscar = buscar;
	}

	public String getPaisDeOrigen() {
		return PaisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		PaisDeOrigen = paisDeOrigen;
	}




	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void insertBaseDatos(Producto ins) {
		miQuery.insert(ins);
	}

	
	public void ModificarDatos(Producto updte) {
		
		miQuery.modificar(updte);
		
	}
	
	
public void EliminarDatos(Producto elim) {
		
	miQuery.Eliminar(elim);
		
	}
	
	
	
	public ResultSet MostrarTabla() {

		return miQuery.cargarTabla();

	}

	public void insertarFichero(Producto miProducto) {
		// TODO Auto-generated method stub
		miFichero.EscribirFichero(miProducto);
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
