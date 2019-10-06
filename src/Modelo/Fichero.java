package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fichero {

	public void EscribirFichero(Producto producto) {

		String ruta = "/Users/mac/Desktop/ficheroTarea3.txt";
		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter(ruta,true);
			pw = new PrintWriter(fichero);
			pw.println(producto.getCodigo() + " " + producto.getNombre() + " " + producto.getPrecio() + " "
					+ producto.getPaisDeOrigen());
			fichero.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
