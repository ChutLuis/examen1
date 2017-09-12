/**
 * 
 */
package gt.edu.url.examen1.api;

import gt.edu.url.examen1.impl.Monstruo;

/**
 * @author Luis
 *
 */
public class FabricaRangersMk2 implements FabricaRanger   {

	Monstruo[] EnemigoGenerico= new Monstruo[10];
	Monstruo[] EnemigoGenericoMk2= new Monstruo[10];
	private int contadorPila=0;
	private int contadorCola=0;
	 public void hacerAlgo() {
		 
	 }
	 
	    
	    
	    
	    public boolean encolar(Monstruo monstruo) {
	    	EnemigoGenericoMk2[contadorCola]=monstruo;
	    	contadorCola++;
	    	return true;
	    }
	    public boolean desencolar(Monstruo monstruo) {
	    	EnemigoGenericoMk2[contadorCola--]=monstruo;
	    	return true;
	    }
	    
	    public boolean apilar(Monstruo monstruo) {
	    	boolean Ingreso=false;
	    	EnemigoGenerico[contadorPila]=monstruo;
	    	Ingreso = true;
	    	contadorPila++;
	    	return Ingreso;
	    }
	    public boolean desapilar(Monstruo monstruo)
	    {
	    	EnemigoGenerico[contadorPila]=monstruo;
	    	contadorPila++;
	    	return true;
	    }
	    public Monstruo fabricar(String elemento)
	    {
			return EnemigoGenerico[contadorPila];
	    	
	    }
}
