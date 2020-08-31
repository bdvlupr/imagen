package gitx;
import java.io.*;

public class Ejec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador=0;
		int biteado[]=new int[2810752];
		
		
		try {
			FileInputStream jpg=new FileInputStream("C:/Users/Familia rocker/Desktop/proyect_git/otras_i/fondo hd3.jpg");
		
			boolean xx= false;
			
			while (!xx){
				int x3=jpg.read();
				
				if(x3!=-1)
					
					biteado[contador]=x3;
				else 
						xx=true;
				
			
				contador++;
			}
			jpg.close();
			
			
		} catch (IOException e) {
			//
			
			e.printStackTrace();
		}
		System.out.println(contador);
		
		copia(biteado);
	}
	
	static void copia (int datos[]){
		
		try {
			FileOutputStream salida=new FileOutputStream("C:/Users/Familia rocker/Desktop/copia.jpg");
		
		for(int i=0;i<datos.length;i++){
			
			salida.write(datos[i]);
		}
			
			salida.close();
		} catch (IOException e) {
			//
			e.printStackTrace();
		}
	}
}



		
		
		 
	


