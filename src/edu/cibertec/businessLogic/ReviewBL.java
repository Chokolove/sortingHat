package edu.cibertec.businessLogic;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import edu.cibertec.dto.ReviewDTO;
import edu.cibertec.model.ModelReview;

public class ReviewBL {
	ModelReview modelo = new ModelReview();
	public List<ReviewDTO> ListaReviewIdLocal(@PathParam("p_id") int id) {
		System.out.println("entro obtenerdatoslocalxDesc()");
		List<ReviewDTO> listareview = new ArrayList<ReviewDTO>();
		listareview = modelo.listarReviewXId(id);
		return listareview;
	}
}
