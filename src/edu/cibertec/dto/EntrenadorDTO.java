package edu.cibertec.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EntrenadorDTO implements Serializable{
	private String nombre;
	private String nick;
	private String [] equipos;
	public EntrenadorDTO(String nombre, String nick, String[] equipos) {
		super();
		this.nombre = nombre;
		this.nick = nick;
		this.equipos = equipos;
	}
	public EntrenadorDTO() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String[] getEquipos() {
		return equipos;
	}
	public void setEquipos(String[] equipos) {
		this.equipos = equipos;
	}
	
}
