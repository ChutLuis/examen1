package gt.edu.url.examen1.api;

public class ReporteroImplementado implements Reportero {
    private String[] Juegos= new String[9];
    private String[] Set= new String[13];
        
    
    
    public void addGame(int game, String winner)
    {
    	Juegos[game]=winner;
    }
    public void addSet(int index, String Winner)
    {
    	Set[index]=Winner;
    }
    public boolean isFull()
    {
    	boolean vacio=false;
    	for (int i=0; i<9;i++)
    	{    		
    			if(Juegos[i]!="")
    			{	
    			vacio= false;
    			}
    			else 
    			{
    			vacio=true; 
    			}
    		
    		
    	}
    	return vacio;
    }
    
    
	public String calcularGanador(int a, int b) 
	{
    	String ganador="";   
        if (a==6 && b==3)
        {
        	
        		for (int y=0; y<6;y++)
        		{
        			addSet(y, "A");
        		}
        	        	
        		for (int y=6; y<9;y++)
        		{
        			addSet(y, "B");
        		}
        		
        	ganador="El ganador es el jugador A";
        	
        }
        else if(a==7 && b==6)
        {
        	
        	for (int y=0; y<7;y++)
    		{
    			addSet(y, "A");
    		}
    	        	
    		for (int y=7; y<13;y++)
    		{
    			addSet(y, "B");
    		}
    		
        	ganador="El ganador es el jugador A";	
        }
        if (b==6 && a==3)
        {
        	
        		for (int y=0; y<6;y++)
        		{
        			addSet(y, "B");
        		}
        	        	
        		for (int y=6; y<9;y++)
        		{
        			addSet(y, "A");
        		}
        		
        	ganador="El ganador es el jugador B";
        	
        }
        else if(b==7 && a==6)
        {
        	
        	for (int y=0; y<7;y++)
    		{
    			addSet(y, "B");
    		}
    	        	
    		for (int y=7;y<13;y++)
    		{
    			addSet(y, "A");
    		}
    		
        	ganador="El ganador es el jugador B";	
        }
        
        
		return ganador;
    }

	public String calcularCampeon(){
		int contadorA = 0;
		int contadorB = 0;
		String resultado="";
		for (int y=0; y<9;y++)
		{
			if(Juegos[y]=="El ganador es el jugador A")
			{
				contadorA ++;
			}
			else
			{
				contadorB ++;
			}
		}
		if(contadorA>contadorB)
		{
			resultado = "El campeon es el jugador A";
		}
		else
		{
			resultado = "El campeon es el jugador A";
		}
		return resultado ;
	}
	public String recordarGanador(int juego)
	{
		
		return "El ganador del set es: " + Juegos[juego];
	}
	
	
}
