package Controlador;

import java.awt.EventQueue;

import Modelo.Conexion;
import Modelo.Producto;
import Vista.FrmProducto;

public class Main {

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProducto frame = new FrmProducto();
					frame.setVisible(true);
					Producto miProducto = new Producto();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

}
