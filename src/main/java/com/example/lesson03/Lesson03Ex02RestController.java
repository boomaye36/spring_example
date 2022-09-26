package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
@RequestMapping("/lesson03/ex02")
public class Lesson03Ex02RestController {

	@Autowired
	private ReviewBO reviewBO;
	//요청 url : http://localhost/lesson03/ex02/1
	@RequestMapping("/1")
	public String ex02_1() {
		
			Review review = new Review(); // java bean
			review.setStoreId(7);
			review.setMenu("삼겹혼밥세트");
			review.setUserName("삼겹마왕");
			review.setPoint(4.5);
			review.setReview("혼자 먹기 적당하네요");
			
			//insert
			int row = reviewBO.addReview(review); // insert된 row수를 리턴 받는다.
			
			//return String
			return "success row count:" + row;
		}
	
	@RequestMapping("/2")
	public String ex02_2() {
		int row = reviewBO.addReviewAsfield(4, "콤비네이션 R", "피자나무", 4.7, "냠냠");
		return "success row count:" + row;
	}

}
