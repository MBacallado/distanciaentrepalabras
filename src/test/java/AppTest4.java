import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest4 {

	Distancia t_distancia = null;
	String str1;
	String str2;
	
	/**
	 * Creamos una instancia de distancia e asignamos la misma cadena a dos variables de tipo String
	 */
	@Before
	public void Before1(){
		t_distancia = new Distancia();
		str1 = "morsa";
		str2 = "morsa";
	}
	
	/**
	 * Test que verifica si las dos cadenas son iguales, si es así, devolverá distancia 0
	 */
	@Test
	public void test1() {
		assertEquals("Prueba1: Primera prueba comprobando que dos cadenas sean iguales",0, t_distancia.DistanciaEntrePalabras(str1, str2));
	}
	
	/**
	 * Función que se ejecuta después del test y modifica las variables str1 = amor y str2 = amarta
	 */
	@After
	public void After2() {
		str1 = "amor";
		str2 = "amarta";
	}
	
	/**
	 * Test que verifica si las dos cadenas son distintas, si es así, en este caso devolverá distancia 1
	 */
	@Test
	public void test2() {
		assertNotEquals("Prueba2: Primera prueba comprobando que dos cadenas no sean iguales",1, t_distancia.DistanciaEntrePalabras(str1, str2));
	}
	
	/**
	 * Test que verifica si las dos variables son de tipo String
	 */
	@Test
	public void test3(){
		assertSame("Prueba3: Comprobar que str1 y str2 son Strings",str1,str2);
	}
	
	/**
	 * Test que verifica que el objeto t_distancia no sea null
	 */
	@Test
	public void test4() {
		assertNotNull("Prueba4: Comprobar que no sea null",t_distancia);
	}

}
