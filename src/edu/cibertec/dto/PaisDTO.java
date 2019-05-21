package edu.cibertec.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PaisDTO implements Serializable{
	
	private String continente;
	private EntrenadorDTO entrenador;
	private String capitan;
	private String estadio;
	
	private List<JugadorDTO> convocados;
	
	public List<JugadorDTO> getConvocados() {
		return convocados;
	}
	public void setConvocados(List<JugadorDTO> convocados) {
		this.convocados = convocados;
	}
	public String getContinente() {
		return continente;
	}
	public EntrenadorDTO getEntrenador() {
		return entrenador;
	}
	public String getCapitan() {
		return capitan;
	}
	public String getEstadio() {
		return estadio;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	public void setEntrenador(EntrenadorDTO entrenador) {
		this.entrenador = entrenador;
	}
	public void setCapitan(String capitan) {
		this.capitan = capitan;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	public PaisDTO(String continente, EntrenadorDTO entrenador, String capitan, String estadio, List<JugadorDTO> convocados) {
		super();
		this.continente = continente;
		this.entrenador = entrenador;
		this.capitan = capitan;
		this.estadio = estadio;
		this.convocados = convocados;
	}
	public PaisDTO() {
		
	}
	

}
