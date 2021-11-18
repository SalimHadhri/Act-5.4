package com.thp.vintud.configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.thp.vintud.entity.Announcement;
import com.thp.vintud.entity.Category;
import com.thp.vintud.repository.AnnouncementRepository;
import com.thp.vintud.repository.CategoryRepository;

@Configuration
public class CategoryConfig implements CategoryRepository{

	
	

	
	@Bean(name="ali")
	public Category addcategory(Category category) {			
		category.setDescription("lala");
		category.setName("dada");
		
		return category ;

	}
	
	
	
	
}
