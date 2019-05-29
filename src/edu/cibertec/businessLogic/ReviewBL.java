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

public class ReviewBL {
	ModelReview modelo = new ModelReview();
	public List<ReviewDTO> ListaReviewIdLocal(int id) {
		List<ReviewJPA> jpas = new ArrayList<ReviewJPA>();
		jpas = modelo.listarReviewXId(id);
		
		List<ReviewDTO> listareview = new ArrayList<ReviewDTO>();
		
		for(ReviewJPA rev:jpas) {
			ReviewDTO dto = new ReviewDTO();
			dto.setId(rev.getId());
			
			AccountDTO accountDTO = new AccountDTO();
			AccountJPA accountJPA = new AccountJPA();
			
			accountJPA = rev.getAccount();
			accountDTO.setId(accountJPA.getId());
			accountDTO.setEmail(accountJPA.getEmail());
			accountDTO.setPassword(accountJPA.getPassword());
			accountDTO.setAccType(accountJPA.getAccType());
			accountDTO.setStatus(accountJPA.getStatus());
			
			dto.setAccount(accountDTO);
			
			LocalJPA local = new LocalJPA();
			LocalDTO loc = new LocalDTO();
			
			local=rev.getLocal();
			loc.setId(local.getId());
			
			AccountDTO account = new AccountDTO();
			AccountJPA accJpa = new AccountJPA();
			
			accJpa = local.getAdmin();
			account.setId(accJpa.getId());
			account.setEmail(accJpa.getEmail());
			account.setPassword(accJpa.getPassword());
			account.setAccType(accJpa.getAccType());
			account.setStatus(accJpa.getStatus());
			
			loc.setAdmin(account);
			loc.setAddress(local.getAddress());
			loc.setDescription(local.getDescription());
			loc.setLatitude(local.getLatitude());
			loc.setLongitude(local.getLongitude());
			loc.setCreated_at(local.getCreated_at());
			loc.setUpdated_at(local.getUpdated_at());
			loc.setDeleted_at(local.getDeleted_at());
			loc.setStatus(local.getStatus());
			
			dto.setLocal(loc);
			dto.setStars(rev.getStars());
			dto.setCommentary(rev.getCommentary());
			
			listareview.add(dto);
			
		}
		
		
		return listareview;
	}
}
