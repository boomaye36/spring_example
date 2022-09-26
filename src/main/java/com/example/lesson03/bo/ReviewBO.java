package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewDAO;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {
	@Autowired
	private ReviewDAO reviewDAO;
	//input : id
	//output : Review
	public Review getReviewById(int id) {
		return reviewDAO.selectReviewById(id);
	}
	
	//return int : 인서트가 성공한 행의 개수 - void도 가능
	public int addReview(Review review) {
		return reviewDAO.insertReview(review);
	}
	
	//addReviewAsfield(4, "콤비네이션 R", "피자나무", 4.7, "냠냠");
	public int addReviewAsfield(int storeId, String menu, String userName, double point, String review) {
		return reviewDAO.addReviewAsfield(storeId, review, review, point, review);
	}
	
	public int updateReviewById(int id, String review) {
		return reviewDAO.updateReviewById(id, review);
	}
	
	// input : 삭제할 id
	// output : X
	
	public void deleteReviewById(int id) {
		reviewDAO.deleteReviewById(id);
	}
}
