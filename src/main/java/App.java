

public class App 
{
	/**
	 * 
	 * @param args
	 */
    public static void main( String[] args )
    {
    	/**
    	 * Se crea un objeto distancia y se muestra por pantalla la distancia llamando a la funcion distancia entre palabras del objeto t_distancia
    	 */
    	Distancia t_distancia = new Distancia();
    	System.out.println("Distancia: " + t_distancia.DistanciaEntrePalabras("morsa", "amor"));
    }
}
