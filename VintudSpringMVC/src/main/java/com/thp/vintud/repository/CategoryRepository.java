package com.thp.vintud.repository;

import org.springframework.stereotype.Repository;

import com.thp.vintud.entity.Announcement;
import com.thp.vintud.entity.Category;



@Repository
public interface CategoryRepository {
	

	
	
	public Category addcategory(Category category) ;


}
