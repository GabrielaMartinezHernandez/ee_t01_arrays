package ee_t01_arrays;
/* author@ Gabriela Martìnez Hernandez
 * Estrutura de Datos
 * Crear un proyecto llamado:(ee_t01_arrays)
Este proyecto consistirá en una clase que lea de un archivo,especificado como el primer parámetro de la clase 
lo siguiente:
ENTRADA:
6 1 2 3 4 5 6 
SALIDA: 
6 5 4 3 2 1 
La primer linea es el numero de elementos y las siguientes son los elementos específicos
Lo anterior meterlo en un array e imprimir en consola el mismo de manera descendente.
Esto lo subirán a github con el nombre del repositorio antes mencionado
tarea 01
*/

import java.util.*;
import java.io.*;
public class Ee_t01_arrays {
	int longitud;
	int []arreglo;
	
	public void leerArchivo(){//se creara el metodo
		try{// se mete en un bloque try por si genera una excepcion
			FileReader fr= new FileReader("Documento.txt");// el objeto File recibe la direccion del archivo
			BufferedReader br= new BufferedReader(fr);//EL buffer lee el archivo
			String linea="";// guarda el texto que se lee
			longitud=Integer.parseInt(br.readLine());//Se tiene que hacer uncasting por que recibe Strings y se convertira a enteros
			arreglo=new int[longitud];// se crea el arreglo
			
			for(int i=1; i<=longitud; i++){// recorre el arreglo 
				arreglo[i-1]=i;// al arreglo le resta la primera posicion 
			}
			while((linea=br.readLine())!=null){// lee el documento linea por linea hasta que no tenga nada que leer se detiene
			}
			for(int j=longitud;j>0; j--){
				System.out.println(arreglo[j-1]);// lo imprime en forma inversa
			}
					
			}
			
					
		catch(Exception e){//En este bloque se maneja la excepcion
			
		System.out.println("El archivo no existe");		
	}
}

	public static void main(String[] args) {
		Ee_t01_arrays obj=new Ee_t01_arrays();
		obj.leerArchivo();
	}

}
