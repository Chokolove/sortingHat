package edu.cibertec.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.EntrenadorDTO;
import edu.cibertec.dto.JugadorDTO;
import edu.cibertec.dto.LocalDTO;
import edu.cibertec.dto.PaisDTO;
import edu.cibertec.model.ModelLocal;

@Path("/get")
public class RestGet {
	
	ModelLocal modelo = new ModelLocal();
	//url: http://localhost:8080/api-rest/get/hola
	
	@GET
	@Path("/hola")
	@Produces(MediaType.TEXT_PLAIN)
	public String holaMundo() {
		System.out.println("entro holaMundo()");
		
		return "Hola Servicio Rest";
	}
	
	//http://localhost:8080/api-rest/get/saludo/Juan/50
	@GET
	@Path("/saludo/{p_nombre}/{p_edad}")
	@Produces(MediaType.TEXT_PLAIN)
	public String saludo(@PathParam("p_nombre") String nombre, @PathParam("p_edad") int edad) {
		System.out.println("entro saludo()");
		
		return "Hola "+nombre+", tu edad es: "+edad;
	}
	
	//http://localhost:8080/api-rest/get/obtenercapitan/PERU
	@GET
	@Path("/obtenercapitan/{p_pais}")
	@Produces(MediaType.TEXT_PLAIN)
	public String obtenerCapitan(@PathParam("p_pais") String nombrePais) {
		System.out.println("entro obtenerCapitan()");
		System.out.println("Pais: "+nombrePais);
		
		String capitan= "";
		
		if("PERU".equals(nombrePais)) {
			capitan = "Paolo Guerrero";
		}else if("ARGENTINA".equals(nombrePais)) {
			capitan = "Lionel Messi";
		}else {
			capitan = "Estamos trabajado!";
		}
		
		return capitan;
	}
	
	
	
	//http://localhost:8080/api-rest/get/obtenerdatospais/PERU
	@GET
	@Path("/obtenerdatospais/{p_pais}")
	@Produces(MediaType.APPLICATION_JSON)
	public PaisDTO obtenerDatosPais(@PathParam("p_pais") String nombrePais) {
		System.out.println("entro obtenerDatosPais()");
		System.out.println("Pais: "+nombrePais);
		
		PaisDTO pais = null;
		
		if("PERU".equals(nombrePais)) {
			
			String[] equipos = {"Velez","Ramirez","Talleres"};
			
			EntrenadorDTO entrenador = new EntrenadorDTO("Ricardo Gareca", "El Tigre", equipos);
			
			List<JugadorDTO> convocados = new ArrayList<JugadorDTO>();
			
			JugadorDTO jugador1 = new JugadorDTO("Paolo Guerrero", 9, "Delantero");
			JugadorDTO jugador2 = new JugadorDTO("Jefferson Farfan", 10, "Delantero");
			JugadorDTO jugador3 = new JugadorDTO("Yosimar Yotun", 7, "Volante");
			
			convocados.add(jugador1);
			convocados.add(jugador2);
			convocados.add(jugador3);
			
			pais = new PaisDTO("America",entrenador,"Paolo Guerrero","Estadio Nacional",convocados);
			return pais;
		}else if("ARGENTINA".equals(nombrePais)) {
			
		}else {
			
		}
		
		return pais;
	}
	
	
	//http://localhost:8080/api-rest/get/obtenerdatoslocal/
		@GET
		@Path("/obtenerdatoslocal")
		@Produces(MediaType.APPLICATION_JSON)
		public List<LocalDTO> obtenerDatosLocales() {
			System.out.println("entro obtenerdatoslocal()");
			List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();
			
			listaLocales = modelo.listarLocal();
			for (LocalDTO local:listaLocales) {
				System.out.println("-----");
				System.out.println("Descripcion: "+local.getDescription());
				System.out.println("Latitud: "+local.getLatitude());
				System.out.println("Longitud: "+local.getLongitude());
				System.out.println("-----");
			}
			
			return listaLocales;
		}
		
		//http://localhost:8080/api-rest/get/obtenerdatoslocal/Berlin
				@GET
				@Path("/obtenerdatoslocal/{p_dir}")
				@Produces(MediaType.APPLICATION_JSON)
				public List<LocalDTO> obtenerDatosLocalesDescripcion(@PathParam("p_dir") String dir) {
					System.out.println("entro obtenerdatoslocalxDesc()");
					List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();
					
					listaLocales = modelo.listarLocalXDir(dir);
					for (LocalDTO local:listaLocales) {
						System.out.println("-----");
						System.out.println("Descripcion: "+local.getDescription());
						System.out.println("Latitud: "+local.getLatitude());
						System.out.println("Longitud: "+local.getLongitude());
						System.out.println("-----");
					}
					
					return listaLocales;
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
