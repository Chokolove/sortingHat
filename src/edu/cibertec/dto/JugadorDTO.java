package edu.cibertec.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JugadorDTO implements Serializable{

	private String nombre;
	private int numero;
	private String posicion;
	
	public JugadorDTO() {
		
	}

	public JugadorDTO(String nombre, int numero, String posicion) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
}
