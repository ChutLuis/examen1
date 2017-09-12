/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;

/**
 *
 * @author tuxtor
 */
public class Monstruo {
    private String Nombre="";
    private String Elemento="";
    private int Edad;
    private String Color="";
    
	public Monstruo(String nombre, String elemento, int edad, String color) {
		Nombre = nombre;
		Elemento = elemento;
		Edad = edad;
		Color = color;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getElemento() {
		return Elemento;
	}
	public void setElemento(String elemento) {
		Elemento = elemento;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
    public String Agigantarse()
    {
    	return "WHAAAAAAAAAGH";
    }
    public String CaminarLento()
    {
    	return "Mi velocidad es inversamente proporcional a mi masa corporal";
    }
    public String Golpear()
    {
    	return "Voy a golpear y les voy a sacar chispas en vez de sangre porque fuck logic";
    }
    public String Volar()
    {
    	String enunciado="No poseo esta caracteristica pero por solo 7.99$ se desbloqueara esta caracteristica mas un mes premium";
     if(Elemento=="Aire")
     {
    	 enunciado="Por que volar siendo un mounstro de inmensas proporciones siempre es factible";
     }
     return enunciado;
    }
    public String Quemar()
    {
    	String Enunciado="No poseo esta caracteristica pero por solo 7.99$ se desbloqueara esta caracteristica mas un mes premium";
    	if(Elemento=="Fuego") {
    		Enunciado= "Power Ranger al carbonero mmmm";
    	}
    	return Enunciado;
    }
    
  }
