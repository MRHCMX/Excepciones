import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Pruebas {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;

		//Con try
		try {
			System.out.println(div(a,b));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		/*
		String sIn = "C:\\pruebas\\Estados.txt"; 
		String sOut = "C:\\pruebas\\EstadosMin.txt";
		callDoIO(sIn, sOut);
		*/
	}
	
	public static float div (float a, float b) {
		float result = 0;
		if (b !=0 )
			   result = a/b;
		else {
			throw new ArithmeticException("b no es valido, causa resultado infinito");
			
			//Tambien pueden usar Exception, en ese caso deberan de usar la propagación 
			//throw new Exception ("Mensaje de error");
		}
		return result;
	}
	
	public static void callDoIO(String sIn, String sOut) {
		InputStream in; 
		OutputStream out;
		
		try {
			in = new FileInputStream(sIn);
			out = new FileOutputStream(sOut);
			doio2(in, out);
		} catch (FileNotFoundException e) {
			// TODO Bloque catch generado automáticamente
			System.err.println("callDoIO: I/O Problem");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Bloque catch generado automáticamente
			System.err.println("callDoIO: I/O Problem");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Proceso terminado");
		}
	}
	
	public static void doio (InputStream in, OutputStream out) {
	   int c;
	   try { 
	      while (( c=in.read()) >=0 ) {
	         c= Character.toLowerCase( (char) c);
	         out.write( c );
	      }
	   } catch ( IOException e ) {
	      System.err.println("doio: I/O Problem");
	      System.exit(1);
	   } finally {
		   System.out.println("Copia terminada");
	   }
	}
	
	public static void doio2 (InputStream in, OutputStream out) throws Throwable {
		int c;
		while (( c=in.read()) >=0 ) {
		      c= Character.toLowerCase( (char) c);
		      out.write( c );
		  }
	}	
}
