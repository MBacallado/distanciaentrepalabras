
public class Distancia {
	
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
    
    private int minimum(int a, int b, int c) {                            
        return Math.min(Math.min(a, b), c);                                      
    } 

}
