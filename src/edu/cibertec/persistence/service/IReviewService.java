package edu.cibertec.persistence.service;

import java.util.List;

import edu.cibertec.entity.Review;

public interface IReviewService {
	
	public Review getReview(Integer id) throws Exception;
	public List<Review> getReviews()	throws Exception;
	public void registrar(Review Review) throws Exception;
	public void	actualizar(Review Review) throws Exception;

	public void eliminar(Integer id) throws Exception;

}
