package edu.cibertec.businessLogic;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.LocalDTO;
import edu.cibertec.dto.ReviewDTO;
import edu.cibertec.jpa.AccountJPA;
import edu.cibertec.jpa.LocalJPA;
import edu.cibertec.jpa.ReviewJPA;
import edu.cibertec.model.ModelReview;
import edu.cibertec.util.Util;

public class ReviewBL {
	ModelReview modelo = new ModelReview();
	public List<ReviewDTO> ListaReviewIdLocal(int id) {
		List<ReviewJPA> jpas = new ArrayList<ReviewJPA>();
		jpas = modelo.listarReviewXId(id);
		
		List<ReviewDTO> listareview = new ArrayList<ReviewDTO>();
		
		for(ReviewJPA rev:jpas) {
			ReviewDTO dto = new ReviewDTO();
			
			dto = Util.reviewJPAtoDTO(rev);
			
			listareview.add(dto);
			
		}
		
		
		return listareview;
	}
}
