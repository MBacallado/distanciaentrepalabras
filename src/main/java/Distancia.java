
public class Distancia {
	
	/**
	 * 
	 * @param str1 primera cadena a comparar 
	 * @param str2 segunda cadena a comparar 
	 * @return int representa la distancia entre las dos cadenas pasadas por parámetro
	 */
	public int DistanciaEntrePalabras(String str1,String str2){
    	int [][] d = new int [str1.length()+1][str2.length()+1];
    	int i,j;
    	       
        for (i = 0; i <= str1.length(); i++)                                 
            d[i][0] = i;                                                  
        for (j = 1; j <= str2.length(); j++)                                 
            d[0][j] = j;                                                  
                                                                                 
        for (i = 1; i <= str1.length(); i++)                                 
            for (j = 1; j <= str2.length(); j++)                             
                d[i][j] = minimum(                                        
                        d[i - 1][j] + 1,                                  
                        d[i][j - 1] + 1,                                  
                        d[i - 1][j - 1] + ((str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0 : 1));
                                                                                 
        return d[str1.length()][str2.length()];
    	
    }
    
	/**
	 * 
	 * @param a (fil-1 col ) + 1
	 * @param b (fil col-1 ) + 1
	 * @param c (fil-1 col-1 ) + (0 si los dos caracteres son iguales o 1 si son diferentes)
	 * @return int menor valor de los tres parámetros 
	 */
    private int minimum(int a, int b, int c) {                            
        return Math.min(Math.min(a, b), c);                                      
    } 

}
