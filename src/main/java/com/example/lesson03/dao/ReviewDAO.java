package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	public Review selectReviewById(@Param("id")int id);
	public int insertReview(Review review);  //review 객체의 내용을 row(record)로 추가

	public int addReviewAsfield(
			@Param("storeId")int storeId,
			@Param ("menu") String menu,
			@Param("userName")String userName,
			@Param("point")double point,
			@Param("review") String review); 

	public int updateReviewById(
			@Param("id")int id, 
			@Param("review")String review);
	
	public void deleteReviewById(int Id);
}
