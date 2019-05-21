package edu.cibertec.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.EntrenadorDTO;
import edu.cibertec.dto.JugadorDTO;
import edu.cibertec.dto.PaisDTO;

@Path("/post")
public class RestPost {
	
	@POST
	@Path("/inJugador")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public String ingresarJugador(JugadorDTO jugador) {
		System.out.println("Entro en servicio Post - ingresarJugador()");
		System.out.println("Nombre: "+jugador.getNombre());
		System.out.println("Numero: "+jugador.getNumero());
		System.out.println("Posicion: "+jugador.getPosicion());
		return "Jugador registrado Correctamente";
	}
	
	@POST
	@Path("/obtenerdatospais")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public PaisDTO obtenerDatosPais(String nombrePais) {
		System.out.println("entro obtenerDatosPais()");
		System.out.println("Pais: "+nombrePais);
		
		
		PaisDTO pais = null;
		
		if("PERU".equals(nombrePais)) {
			
			List<JugadorDTO> convocados = new ArrayList<>();
			JugadorDTO jugador1 = new JugadorDTO("Paolo Guerrero", 9, "Delantero");
			JugadorDTO jugador2 = new JugadorDTO("Jeferson Farfan", 10, "Delantero");
			JugadorDTO jugador3 = new JugadorDTO("Yosimar Yotún", 7, "Volante");
			convocados.add(jugador1);
			convocados.add(jugador2);
			convocados.add(jugador3);
			
			String [] equipos =  {"Velez","Palmeiras","Talleres"};
			EntrenadorDTO dt = new EntrenadorDTO("Ricardo Gareca", "El Tigre", equipos);
			
			pais = new PaisDTO("América", dt, "Paolo Guerrero",
							"Nacional de Lima", convocados);
		
		}else if("ARGENTINA".equals(nombrePais)) {
			pais = new PaisDTO();
			pais.setCapitan("Lionel Messi");
			pais.setContinente("América");
			pais.setEntrenador(null);
			pais.setEstadio("Estadio Monumental");
	
		}else {
		}
		
		return pais;
	}
	
}
