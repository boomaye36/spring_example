package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
public class Lesson03Ex01RestController {
	@Autowired
	// 요청 url : http://localhost/lesson03/ex01
	private ReviewBO reviewBO;

	@RequestMapping("/lesson03/ex01")
	public Review ex01() {
		return reviewBO.getReviewById(3);
	}
}
