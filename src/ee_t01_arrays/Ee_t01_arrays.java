package ee_t01_arrays;
/*Crear un proyecto llamado:(ee_t01_arrays)
Este proyecto consistirá en una clase que lea de un archivo,especificado como el primer parámetro de la clase 
lo siguiente:
ENTRADA:
6 1 2 3 4 5 6 
SALIDA: 
6 5 4 3 2 1 
La primer linea es el numero de elementos y las siguientes son los elementos específicos
Lo anterior meterlo en un array e imprimir en consola el mismo de manera descendente.
Esto lo subirán a github con el nombre del repositorio antes mencionado
*/

import java.util.*;
import java.io.*;
public class Ee_t01_arrays {
	int longitud;
	int []arreglo;
	
	public void leerArchivo(){
		try{
			FileReader fr= new FileReader("Documento.txt");
			BufferedReader br= new BufferedReader(fr);
			String linea="";
			longitud=Integer.parseInt(br.readLine());
			arreglo=new int[longitud];
			
			for(int i=1; i<=longitud; i++){
				arreglo[i-1]=1;
			}
			while((linea=br.readLine())!=null){
			}
			for(int j=longitud;j>0; j--){
				System.out.println(arreglo[j-1]);
			}
					
			}
			
			
		
		catch(Exception e){
			
		System.out.println("El archivo no existe");		
	}
}

	public static void main(String[] args) {
		Ee_t01_arrays obj=new Ee_t01_arrays();
		obj.leerArchivo();
	}

}
