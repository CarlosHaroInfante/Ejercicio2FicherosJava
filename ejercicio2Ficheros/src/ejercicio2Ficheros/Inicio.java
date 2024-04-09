package ejercicio2Ficheros;

import java.io.FileWriter;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String ruta = "C:\\Users\\Carlos\\Desktop\\ED\\ejercicio2Ficheros\\src\\ejercicio2Ficheros\\escribe.txt";
		System.out.println("Que quieres escribir en el archivo");
		String texto = sc.nextLine();
		
		try {
			FileWriter escribe = new FileWriter(ruta);
			
			escribe.write(texto);
			
			escribe.close();
			
			System.out.println("Se ha escrito correctamente");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fallo al escribir en el código" + e.getMessage());
		}
	}

}
