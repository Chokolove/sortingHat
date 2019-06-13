package edu.cibertec.persistence.service;

import java.util.List;

import org.apache.log4j.Logger;

import edu.cibertec.entity.Review;
import edu.cibertec.persistence.jpa.dao.ReviewJPA;

public class ReviewServiceImpl implements IReviewService{
	
	static final Logger log = Logger.getLogger(ReviewServiceImpl.class);
	ReviewJPA revDAO = new ReviewJPA();

	@Override
	public Review getReview(Integer id) throws Exception {
		log.info("Se ingreso a getReview()");
		
		Review rev = null;
		revDAO.createEM();
		rev = revDAO.get(id);
		revDAO.releaseEM();
		
		log.info("Saliendo de getReview()");
		return rev;
	}

	@Override
	public List<Review> getReviews() throws Exception {
		log.info("Se ingreso a getReview()");
		
		List<Review>revs = null;
		revDAO.createEM();
		revs= revDAO.getAll();
		revDAO.releaseEM();
		
		log.info("Saliendo de getReview()");
		return revs;
	}

	@Override
	public List<Review> getReviewsXLoc(int id) throws Exception {
		log.info("Se ingreso a getReview()");
		List<Review>revs = null;
		revDAO.createEM();
		revs = revDAO.getAllXLoc(id);
		log.info("Saliendo de getReview()");
		return revs;
	}
	@Override
	public void registrar(Review Review) throws Exception {
		log.info("Se ingreso a getReview()");
		
		revDAO.createEM();
		revDAO.beginTransaction();
		revDAO.registrar(Review);
		revDAO.flush();
		revDAO.endTransaction();
		
		log.info("Saliendo de getReview()");
		
	}

	@Override
	public void actualizar(Review Review) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
